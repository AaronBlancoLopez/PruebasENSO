package mantenimiento;

import java.util.ArrayList;

import extras.TicVenError;
import inventario.ItfInventario;

public class GestIncidencias implements ItfGestIncidencias {
	ArrayList<Incidencia> lstIncidencias;
	ItfInventario gestInventario;
	ItfGestOT gestOT;
	
	@Override
	public int crearIncidencia(int idInv, String descripcion) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int atenderIncidencia(int idInc, String reparacion) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void aceptarFactura(int idInc, int idFactura) throws TicVenError {
		// TODO Auto-generated method stub

	}

	@Override
	public int[] buscarIncidencia(int idInv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int resolverIncidencia(int idInc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int resolverIncidenciaEnFalso(int idInc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] buscarincidenciasActivas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] buscarincidenciasCerradas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getCoste(int idInc) {
		// TODO Auto-generated method stub
		return 0;
	}

}
