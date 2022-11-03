public class Main {
	public static void main(String[] args) {
		ElectricityBill eb = new ElectricityBill();
		eb.readData();
		eb.showData();
		eb.computeBill();
	}
}
