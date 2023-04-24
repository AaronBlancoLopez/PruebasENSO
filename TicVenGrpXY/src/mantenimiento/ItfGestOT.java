package mantenimiento;

import extras.TicVenError;

public interface ItfGestOT {
	int creaOT(int idInc, String empresa, String descrReparacion);
	int facturaOT(int idOT) throws TicVenError; // return idFactura.
	void cierraOT(int idOT) throws TicVenError; // paga factura
	float getCoste(int idInc); // 0 si no hay factura o no está pagada
	int[] buscaOTs(int idInc); // devuelve OTs relacionadas con una incidencia.
}
