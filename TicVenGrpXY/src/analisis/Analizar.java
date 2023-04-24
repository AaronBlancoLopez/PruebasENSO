package analisis;

import economico.ItfFacturas;
import extras.Centro;
import inventario.ItfInventario;
import mantenimiento.ItfGestIncidencias;

public class Analizar implements ItfAnalisis {
	ItfFacturas gestEconomica;
	ItfInventario gestInventario;
	ItfGestIncidencias gestMantenimiento;
	
	@Override
	public float mediaCosteOT(int[] Inc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float mediaTiempoINCxTipo(int[] Inc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float mediaINCxCentroAnho(Centro centro, int anho) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float mediaCosteOTxEmpresa(int[] Inc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float[] costeINVxCentro() {
		// TODO Auto-generated method stub
		return null;
	}

}
