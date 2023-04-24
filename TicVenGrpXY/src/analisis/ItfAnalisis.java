package analisis;

import extras.Centro;

public interface ItfAnalisis {
	// Coste medio de todas las OT vinculadas a la lista de incidencias en el array
	float mediaCosteOT(int[] Inc);
	// Tiempo medio de resoluci�n de una incidencia en la lista seg�n el tipo de elemento del inventario
	float mediaTiempoINCxTipo(int[] Inc);
	// Tiempo medio de incidencias por centro y a�o 
	float mediaINCxCentroAnho(Centro centro, int anho);
	// Coste medio de OT por empresa en la lista de Incidencias
	float mediaCosteOTxEmpresa(int[] Inc);
	// Coste del inventario por centro
	float[] costeINVxCentro(); // el array guarda los valores seg�n el enum de centros
}
