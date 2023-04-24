package mantenimiento;

import extras.TicVenError;

public interface ItfGestIncidencias {
	int crearIncidencia(int idInv, String descripcion); // return idInc
	int atenderIncidencia(int idInc, String reparacion); // return idOT. Crea una OT asociada, no puede haber 2 OT asociadas al mismo tiempo, pero si secuenciales.
	void aceptarFactura(int idInc, int idFactura) throws TicVenError; // Asigna factura a OT. Excepción si incidencia sin OT
	int[] buscarIncidencia(int idInv);         // return array idInc relacionadas con el inventario indicado
	int resolverIncidencia(int idInc);        // CierraOT asociada si la hay e Incidencia. Return idOT, -1 si no hay.
	int resolverIncidenciaEnFalso(int idInc); // CierraOT asociada si la hay pero no Incidencia. Return idOT, -1 si no hay.
	int[] buscarincidenciasActivas();          // return array idInc activas
	int[] buscarincidenciasCerradas();         // return array idInc cerradas
	float getCoste(int idInc);                 // return coste de todas las OTs vinculadas a un incidencia.
}
