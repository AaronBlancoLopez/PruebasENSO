package economico;

public interface ItfFacturas {
	int creaFactura(String empresa, String concepto, float cantidad);
	int pagarFactura(int idFactura);
	float getCoste(int idFactura);
	Factura getFactura(int idFactura);
}
