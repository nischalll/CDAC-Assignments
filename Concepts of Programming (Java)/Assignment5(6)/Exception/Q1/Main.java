import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String args[]) {
		FileReader fReader=null;
		FileWriter fWriter=null;
		try {
			fReader = new FileReader("file.txt");
			fWriter = new FileWriter("file.txt");
			
				try {
					char ch=(char) fReader.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
