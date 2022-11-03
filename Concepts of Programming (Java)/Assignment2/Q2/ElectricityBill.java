import java.util.Scanner;

public class ElectricityBill {
	public String customerName;
	public int customerNumber;
	public int unitsConsumed;
	
	public void readData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		customerName= sc.nextLine();
		System.out.print("Enter the number: ");
		customerNumber=sc.nextInt();
		System.out.print("Enter the units: ");
		unitsConsumed=sc.nextInt();
	}
	
	public void showData() {
		System.out.println("Name: "+customerName);
		System.out.println("Number: "+customerNumber);
		System.out.println("Units Consumed: "+unitsConsumed);
	}
	
	public void computeBill() {
		if(unitsConsumed<=100) {
			System.out.println("Your bill is: "+unitsConsumed*1.20);
		}
		else if(unitsConsumed>100 && unitsConsumed<=300) {
			System.out.println("Your bill is: "+(100*1.2+(unitsConsumed-100)*2.0));
		}
		else if(unitsConsumed>300 && unitsConsumed<=600) {
			System.out.println("Your bill is: "+(100*1.2+200*2.0+(unitsConsumed-300)*3.0));
		}
		else {
			System.out.println("Your bill is: "+(100*1.2+200*2.0+300*3.0+(unitsConsumed-600)*5));
		}
	}
}
