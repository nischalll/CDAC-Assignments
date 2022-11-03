public class Student {
	public int id;
	public String name;
	public int mark;
	public boolean result;
	
	public void initStudent(int id, String name,int mark) {
		this.id=id;
		this.name=name;
		this.mark=mark;
		
		if(mark<35) {
			result=false;
		}else {
			result=true;
		}
	}
	
	public void result() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+mark);
		System.out.println("Result: "+(result?"Pass":"fail"));
	}
}
