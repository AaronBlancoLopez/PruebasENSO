package economico;

import java.time.LocalDateTime;

public class Factura {
	private static int idCounter = 0;
	int idFactura;
	String Empresa;
	LocalDateTime pagado;
	float cantidad;
	String concepto;

	public Factura(String empresa, float cantidad, String concepto) {
		this.Empresa = empresa;
		this.cantidad = cantidad;
		this.concepto = concepto;
		this.idFactura = idCounter;
		idCounter++;
	}

	//getters y setters
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	public LocalDateTime getPagado() {
		return pagado;
	}
	public void setPagado(LocalDateTime pagado) {
		this.pagado = pagado;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
}
