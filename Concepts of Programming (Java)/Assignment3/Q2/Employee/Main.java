package Employee;

public class Main {
	public static void main(String[] args){
		HourlyEmployee hr = new HourlyEmployee(1234,"Ramesh","Rajurkar",50000);
		hr.print();
		SalariedEmployee sr = new SalariedEmployee(1235,"Rajesh","marwadi",70000);
		sr.print();
	}
}
