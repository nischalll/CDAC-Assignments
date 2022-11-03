public class Main {
	public static void main(String args[]) {
		
		Student s = new Student();
		s.initStudent(1234, "Nischal", 45);
		s.result();
		
		Student sc = new Student();
		sc.initStudent(1235, "Other Student", 32);
		sc.result();
	}
}
