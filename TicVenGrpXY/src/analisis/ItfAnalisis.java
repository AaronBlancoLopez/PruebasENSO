package analisis;

import extras.Centro;

public interface ItfAnalisis {
	// Coste medio de todas las OT vinculadas a la lista de incidencias en el array
	float mediaCosteOT(int[] Inc);
	// Tiempo medio de resolución de una incidencia en la lista según el tipo de elemento del inventario
	float mediaTiempoINCxTipo(int[] Inc);
	// Tiempo medio de incidencias por centro y año 
	float mediaINCxCentroAnho(Centro centro, int anho);
	// Coste medio de OT por empresa en la lista de Incidencias
	float mediaCosteOTxEmpresa(int[] Inc);
	// Coste del inventario por centro
	float[] costeINVxCentro(); // el array guarda los valores según el enum de centros
}
