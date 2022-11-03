public class Main {
	public static void main(String args[]) {
		Account ac = new Account(1234,"Nischal",50000);
		ac.deposit(5000);
		ac.withdraw(5000);
		ac.intrest();
	}
}
