package verify.exam07;

@SuppressWarnings("serial")
public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		// TODO Auto-generated constructor stub
	}

	public WrongPasswordException(String message) {
		super(message);
	}
}
