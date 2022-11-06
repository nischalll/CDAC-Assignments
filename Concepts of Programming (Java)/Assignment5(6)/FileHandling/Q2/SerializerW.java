package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class SerializerW {
	public static void main(String[] args) throws IOException{
		Student s1=new Student(1, "rahul", 50, "maths");
		Student s2=new Student(2, "rahul", 80, "english");
		Student s3=new Student(3, "mahesh", 20, "hindi");
		Student s4=new Student(4, "nischal", 100, "physics");
		Student s5=new Student(5, "yash", 60, "chemistry");
		
		FileOutputStream fs = new FileOutputStream("stdfile");	
		ObjectOutputStream os = new ObjectOutputStream(fs);
		ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(s1,s2,s3,s4,s5));
		
		os.writeObject(students);
		System.out.println("success..");
	}
}

