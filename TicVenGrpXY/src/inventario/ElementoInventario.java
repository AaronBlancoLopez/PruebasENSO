package inventario;

import java.time.LocalDateTime;

import extras.Localizacion;

public class ElementoInventario {
	int idInv;
	int idFactura;
	int tipo;
	String marca;
	String modelo;
	Localizacion loc;
	String responsableDNI;
	LocalDateTime FchBaja = null;
	
	public ElementoInventario(int idFactura, int tipo, String marca, String modelo, Localizacion loc, String responsableDNI) {
		super();
		this.idFactura = idFactura;
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.loc = loc;
		this.responsableDNI = responsableDNI;
	}
	
	int getId() {
		return idInv;
	}

}
