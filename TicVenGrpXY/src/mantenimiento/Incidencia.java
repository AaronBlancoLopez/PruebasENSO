package mantenimiento;

import java.time.LocalDateTime;

public class Incidencia {
	private static int incIdCounter = 1;
	int idInc;
	int idInv;
	LocalDateTime Inicio;
	String problema;
	String revisadoDNI;
	LocalDateTime Fin;

	public Incidencia(int idInv, String problema) {
		this.idInv = idInv;
		this.problema = problema;
		this.idInc = incIdCounter;
		this.Inicio = LocalDateTime.now();
		incIdCounter++;
	}

	public static int getIncIdCounter() {
		return incIdCounter;
	}

	public static void setIncIdCounter(int incIdCounter) {
		Incidencia.incIdCounter = incIdCounter;
	}

	public int getIdInv() {
		return idInv;
	}

	public void setIdInv(int idInv) {
		this.idInv = idInv;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getRevisadoDNI() {
		return revisadoDNI;
	}

	public void setRevisadoDNI(String revisadoDNI) {
		this.revisadoDNI = revisadoDNI;
	}

	public LocalDateTime getFin() {
		return Fin;
	}

	public void setFin(LocalDateTime fin) {
		Fin = fin;
	}
}
