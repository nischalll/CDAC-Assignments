package Employee;

public class Payroll {
	private Employee[] employees;

	Payroll(Employee[] employees) {
		this.employees = employees;
	}

	public void paySalary(int id) {
		for (int i = 0; i < employees.length; i++) {
			if (id == employees[i].getSSN()) {
				System.out.println("Salary Paid to " + employees[i].getFirstName() +" "+ employees[i].getLastName());
			}
		}

	}
}
