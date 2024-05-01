package in.ashokit.error;

public class UserDefinedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDefinedException() {
		
	}

	public UserDefinedException(String message) {
		super(message);
		
	}

}
