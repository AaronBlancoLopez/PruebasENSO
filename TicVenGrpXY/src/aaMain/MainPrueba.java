package aaMain;

import analisis.Analizar;
import economico.GestEconomica;
import extras.Centro;
import extras.Localizacion;
import extras.TicVenError;
import inventario.GestInventario;
import mantenimiento.GestIncidencias;

public class MainPrueba {

	public static void main(String[] args) {
		int idFact, idInv, idInc, idOT;
		int[] idsInc = new int[2];
		float coste=0f;
		GestEconomica facturas= new GestEconomica();
		GestInventario inventario= new GestInventario();
		GestIncidencias mantenimiento = new GestIncidencias();
		Analizar analisis = new Analizar();
		
		// Centros disponibles
		for (Centro c : Centro.values()) {
			System.out.println(String.format("%2d-%2d: %s(%s)", c.ordinal(), c.getIdCentro(), c.getNombreCentro(), c.toString()));
		}
	
		try {
			// Añadir elemento al inventario
			// Creo Factura -> CreoElementoInventario
			idFact=facturas.creaFactura("TiendaMiPC", "portátil i7", 1100.0f);
			idInv=inventario.creaElementoInventario(idFact, 5, "portatil i7", new Localizacion(Centro.Arquivo,2,"loc-215"), "35151267J");			
			// Hago unas reparaciones
			for(int k=0; k<2; k++) {
				idInc = mantenimiento.crearIncidencia(idInv, "No enciende la pantalla");
				idOT = mantenimiento.atenderIncidencia(idInc, "Sustituir pantalla");
				mantenimiento.aceptarFactura(idInc, facturas.creaFactura("ReparaMiPc", "Pantalla", 450.0f));
				if(idOT == mantenimiento.resolverIncidenciaEnFalso(idInc))
					System.out.println(String.format("%d - Orden de trabajo finalizada", idOT));
				idOT = mantenimiento.atenderIncidencia(idInc, "Reemplazar Tarjeta Gráfica");
				mantenimiento.aceptarFactura(idInc, facturas.creaFactura("ReparaMiPc", "Tarjeta gráfica", 250.0f));
				if(idOT == mantenimiento.resolverIncidencia(idInc)) {
					System.out.println(String.format("%d - Orden de trabajo finalizada", idOT));
					System.out.println(String.format("%d - incidencia cerrada", idInc));
				}
				coste+=mantenimiento.getCoste(idInc);
				idsInc[k]=idInc;
				}
			System.out.println(String.format("Coste del mantenimiento: %.2f€", coste));
			
			// Hago los análisis disponibles
			analisis.costeINVxCentro();
			analisis.mediaINCxCentroAnho(Centro.Arquivo, 2023);
			analisis.mediaCosteOT(idsInc);
			analisis.mediaCosteOTxEmpresa(idsInc);
			analisis.mediaTiempoINCxTipo(idsInc);

		} catch (TicVenError e) {
			System.out.println(String.format("Se ha producido el siguiente error en el inventario: \n\t%s",e.getMessage()));
		}
		

	}

}
