package inventario;

import java.time.LocalDateTime;
import java.util.ArrayList;

import economico.Factura;
import economico.ItfFacturas;
import extras.Localizacion;
import extras.TicVenError;

public class GestInventario implements ItfInventario {
	ArrayList<ElementoInventario> inventario;
	ItfFacturas gestEconomica;
	
	@Override
	public int creaElementoInventario(int idFactura, int tipo, String modelo, Localizacion loc, String responsableDNI) throws TicVenError {
		inventario.add(new ElementoInventario(idFactura, tipo, modelo, loc, responsableDNI));
		return 0;
	}

	@Override
	public ElementoInventario getElementoInventario(int idInv) {
		for (ElementoInventario elementoInventario : inventario) {
			if(elementoInventario.getId() == idInv) {
				return elementoInventario;
			}
		}
		return null;
	}

	@Override
	public ElementoInventario modificaInventario(int idInv, Localizacion loc) {
		for (ElementoInventario elementoInventario : inventario) {
			if(elementoInventario.getId() == idInv) {
				ArrayList<ElementoInventario> nuevoInventario = getInventario();
				nuevoInventario.remove(elementoInventario);
				elementoInventario.setLoc(loc);
				nuevoInventario.add(elementoInventario);
				setInventario(nuevoInventario);
				return elementoInventario;
			}
		}
		return null;
	}

	@Override
	public ElementoInventario modificaInventario(int idInv, String responsableDNI) {
		for (ElementoInventario elementoInventario : inventario) {
			if(elementoInventario.getId() == idInv) {
				ArrayList<ElementoInventario> nuevoInventario = getInventario();
				nuevoInventario.remove(elementoInventario);
				elementoInventario.setResponsableDNI(responsableDNI);
				nuevoInventario.add(elementoInventario);
				setInventario(nuevoInventario);
				return elementoInventario;
			}
		}
		return null;
	}

	@Override
	public void baja(int idInv, LocalDateTime fechabaja) throws TicVenError {
		for (ElementoInventario elementoInventario : inventario) {
			if(elementoInventario.getId() == idInv) {
				ArrayList<ElementoInventario> nuevoInventario = getInventario();
				nuevoInventario.remove(elementoInventario);
				elementoInventario.setFchBaja(fechabaja);
				nuevoInventario.add(elementoInventario);
				setInventario(nuevoInventario);
				return;
			}
		}
		throw new TicVenError();
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

	public ArrayList<ElementoInventario> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<ElementoInventario> inventario) {
		this.inventario = inventario;
	}
}
