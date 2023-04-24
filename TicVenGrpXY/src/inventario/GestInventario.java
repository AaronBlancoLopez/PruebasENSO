package inventario;

import java.time.LocalDateTime;
import java.util.ArrayList;

import economico.ItfFacturas;
import extras.Localizacion;
import extras.TicVenError;

public class GestInventario implements ItfInventario {
	ArrayList<ElementoInventario> inventario;
	ItfFacturas gestEconomica;
	
	@Override
	public int creaElementoInventario(int idFactura, int tipo, String modelo, Localizacion loc, String responsableDNI)
			throws TicVenError {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ElementoInventario getElementoInventario(int idInv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElementoInventario modificaInventario(int idInv, Localizacion loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElementoInventario modificaInventario(int idInv, String responsableDNI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void baja(int idInv, LocalDateTime fechabaja) throws TicVenError {
		// TODO Auto-generated method stub

	}

	@Override
	public int[] buscar(int tipo, String Modelo, Localizacion loc, String responsableDNI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getIdFactura(int idInv) throws TicVenError {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getCoste(int idInv) throws TicVenError {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void pagaElementoInventario(int idInv) throws TicVenError {
		// TODO Auto-generated method stub

	}

}
