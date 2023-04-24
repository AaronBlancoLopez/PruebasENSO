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
	
	public ElementoInventario(int idFactura, int tipo, String modelo, Localizacion loc, String responsableDNI) {
		super();
		this.idFactura = idFactura;
		this.tipo = tipo;
		this.marca = null;
		this.modelo = modelo;
		this.loc = loc;
		this.responsableDNI = responsableDNI;
	}

	//getters y setters
	int getId() {
		return idInv;
	}

	public int getIdInv() {
		return idInv;
	}

	public void setIdInv(int idInv) {
		this.idInv = idInv;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Localizacion getLoc() {
		return loc;
	}

	public void setLoc(Localizacion loc) {
		this.loc = loc;
	}

	public String getResponsableDNI() {
		return responsableDNI;
	}

	public void setResponsableDNI(String responsableDNI) {
		this.responsableDNI = responsableDNI;
	}

	public LocalDateTime getFchBaja() {
		return FchBaja;
	}

	public void setFchBaja(LocalDateTime fchBaja) {
		FchBaja = fchBaja;
	}
}
