package Employee;

public class Company {
	public static void main(String[] args){

		ComissionEmployee hr = new ComissionEmployee(1234,"Ramesh","Rajurkar",50000);
		hr.print();
		SalariedEmployee sr = new SalariedEmployee(1235,"Rajesh","marwadi",70000);
		sr.print();

		Payroll payroll = new Payroll(new Employee[]{hr,sr});
		payroll.paySalary(1234);
	}
}
