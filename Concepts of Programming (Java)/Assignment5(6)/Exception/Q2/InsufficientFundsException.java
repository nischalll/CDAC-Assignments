package ExceptionHandling2;


public class InsufficientFundsException extends Exception {
	public InsufficientFundsException() {
		super("not enough funds to withdraw!");
	}
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}
