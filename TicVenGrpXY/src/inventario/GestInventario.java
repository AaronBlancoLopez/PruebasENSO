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
		throw new TicVenError("Intentando dar de baja un elemento que no se encuentra en el inventario.");
	}

	@Override
	public Integer[] buscar(int tipo, String modelo, Localizacion loc, String responsableDNI) {
		ArrayList<Integer> encontrados = new ArrayList<>();
		for (ElementoInventario elemInv : inventario) {
			if(elemInv.getTipo() == tipo && elemInv.getModelo().equals(modelo) && elemInv.getLoc() == loc && elemInv.getResponsableDNI().equals(responsableDNI)) {
				encontrados.add(elemInv.getId());
			}
		}
		Integer[] arrEncontrados = new Integer[encontrados.size()];
		arrEncontrados = encontrados.toArray(arrEncontrados);
		return arrEncontrados;
	}

	@Override
	public int getIdFactura(int idInv) throws TicVenError {
		for (ElementoInventario elementoInventario : inventario) {
			if(elementoInventario.getId() == idInv) {
				return elementoInventario.getIdFactura();
			}
		}
		throw new TicVenError("Intentando obtener el id de factura de un elemento que no se encuentra en el inventario.");
	}

	@Override
	public float getCoste(int idInv) throws TicVenError {
		for (ElementoInventario elementoInventario : inventario) {
			if(elementoInventario.getId() == idInv) {
				return gestEconomica.getCoste(elementoInventario.getIdFactura());
			}
		}
		throw new TicVenError("Intentando obtener el coste de un elemento que no se encuentra en el inventario.");
	}

	@Override
	public void pagaElementoInventario(int idInv) throws TicVenError {
		for (ElementoInventario elementoInventario : inventario) {
			if(elementoInventario.getId() == idInv) {
				gestEconomica.pagarFactura(elementoInventario.getIdFactura());
			}
		}
		throw new TicVenError("Intentando pagar un elemento que no se encuentra en el inventario.");
	}

	public ArrayList<ElementoInventario> getInventario() {
		return inventario;
	}

	public void setInventario(ArrayList<ElementoInventario> inventario) {
		this.inventario = inventario;
	}
}
