package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SerializerR {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("stdfile");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object o = ois.readObject(); 
		ArrayList<Student> students = (ArrayList<Student>) o;
		System.out.println(students);
		for (Student student : students) {
			student.printStudent();
		}
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getMarks()-s2.getMarks();
			}
		});
		System.out.println();
		for (Student student : students) {
			student.printStudent();
		}
	}
}
