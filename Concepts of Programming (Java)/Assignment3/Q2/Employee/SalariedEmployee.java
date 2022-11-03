package Employee;

public class SalariedEmployee extends Employee{
	public int salary;

	public SalariedEmployee(int SSN,String FirstName,String LastName,int salary) {
		super(SSN,FirstName,LastName);
		this.salary = salary;
	}
	public void computeGrossPay(){
		System.out.println(salary+1000);
	}

	public void computeNetPay(){
		System.out.println(salary-1000);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void print(){
		System.out.println("SSN: "+SSN);
		System.out.println("FirstName: "+FirstName);
		System.out.println("LastName: "+LastName);
		System.out.println("Salary: "+salary);
	}
}
