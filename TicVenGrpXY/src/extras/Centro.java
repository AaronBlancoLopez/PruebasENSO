package extras;

public enum Centro {
	Arquivo("Arquivo Histórico",0),
	Balconada("Casa da Balconada",1),
	Bioloxia("Facultade de Bioloxía",2),
	Burgo("Residencia universitaria Burgo das nacións",3);

	private String nombreCentro;
	private int idCentro;
	
	private Centro(String nombreCentro, int idCentro) {
		this.nombreCentro=nombreCentro;
		this.idCentro=idCentro;
	}
	public String getNombreCentro() {
		return nombreCentro;
	}
	public int getIdCentro() {
		return idCentro;
	}

}
