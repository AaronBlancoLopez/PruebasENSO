package extras;

public class TicVenError extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TicVenError() {
		super("TicVentario: Error desconocido");
	}

	public TicVenError(String message) {
		super(message);
	}
	
	

}
