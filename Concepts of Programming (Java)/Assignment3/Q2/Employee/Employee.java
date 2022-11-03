package Employee;

public class Employee {
	public int SSN;
	public String FirstName;
	public String LastName;

	public Employee(int SSN, String FirstName, String Lastname){
		this.SSN=SSN;
		this.FirstName=FirstName;
		this.LastName=Lastname;
	}


	public int getSSN(){
		return SSN;
	}
	public String getFirstName(){
		return FirstName;
	}
	public String getLastName(){
		return LastName;
	}
	public void setSSN(int SSN){
		this.SSN = SSN;
	}
	public void setFirstName(String FirstName){
		this.FirstName=FirstName;
	}

	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	public void printEmp(){
		System.out.println("SSN: "+SSN);
		System.out.println("First Name: "+FirstName);
		System.out.println("Last Name: "+LastName);
	}
}
