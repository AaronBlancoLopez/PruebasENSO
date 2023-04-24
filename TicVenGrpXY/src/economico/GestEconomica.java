package economico;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GestEconomica implements ItfFacturas {
	ArrayList<Factura> LstFacturas;

	@Override
	public int creaFactura(String empresa, String concepto, float cantidad) {
		LstFacturas.add(new Factura(empresa, cantidad, concepto));
		return 0;
	}

	@Override
	public int pagarFactura(int idFactura) {
		for (Factura factura : LstFacturas) {
			if(factura.getIdFactura() == idFactura) {
				ArrayList<Factura> nuevaLista = getLstFacturas();
				nuevaLista.remove(factura);
				factura.setPagado(LocalDateTime.now());
				nuevaLista.add(factura);
				setLstFacturas(nuevaLista);
			}
		}
		return 0;
	}

	@Override
	public float getCoste(int idFactura) {
		for (Factura factura : LstFacturas) {
			if(factura.getIdFactura() == idFactura) {
				return factura.getCantidad();
			}
		}
		return 0;
	}

	@Override
	public Factura getFactura(int idFactura) {
		for (Factura factura : LstFacturas) {
			if(factura.getIdFactura() == idFactura) {
				return factura;
			}
		}
		return null;
	}

	//getters y setters
	public ArrayList<Factura> getLstFacturas() {
		return LstFacturas;
	}
	public void setLstFacturas(ArrayList<Factura> lstFacturas) {
		LstFacturas = lstFacturas;
	}
}
