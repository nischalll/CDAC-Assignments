import java.util.Scanner;

public class Q1EmployeeData {
	public int empNo;
	public String empName;
	public String designation;
	public String dept;
	public int salary;
	
	public void readEmpData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee no:");
		empNo=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the employee name:");
		empName=sc.nextLine();
		System.out.print("Enter the employee desg:");
		designation=sc.nextLine();
		System.out.print("Enter the employee dept:");
		dept=sc.nextLine();
		System.out.print("Enter the employee salary:");
		salary=sc.nextInt();
		sc.close();
	}
	
	public void displayEmployee() {
		System.out.println("the employee no:"+" "+empNo);
		System.out.println("the employee name:"+" "+empName);
		System.out.println("the employee desg:"+" "+designation);
		System.out.println("the employee dept:"+" "+dept);
		System.out.println("the employee salary:"+" "+salary);
	}
}
