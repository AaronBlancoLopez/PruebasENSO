package mantenimiento;

import java.util.ArrayList;

import economico.ItfFacturas;
import extras.TicVenError;

public class GestOTs implements ItfGestOT {
	ArrayList<OrdenTrabajo> lstOTs;
	ItfFacturas gestEconomica;
	
	@Override
	public int creaOT(int idInc, String empresa, String descrReparacion) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int facturaOT(int idOT) throws TicVenError {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void cierraOT(int idOT) throws TicVenError {
		// TODO Auto-generated method stub

	}

	@Override
	public float getCoste(int idInc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] buscaOTs(int idInc) {
		// TODO Auto-generated method stub
		return null;
	}

}
