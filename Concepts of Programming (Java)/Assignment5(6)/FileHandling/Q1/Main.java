package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException{
		//question 1
		FileReader fr = new FileReader("hello.txt");
		int ch;
		int noOfChar=0;
		int noOfWords=-1;
		int noOfLines=0;
		while((ch=fr.read())!=-1) {
			noOfChar++;
			if((char)ch==' ' || (char)ch=='\n') noOfWords++;
			if((char)ch=='\n') noOfLines++;
			System.out.print((char)ch);
		}
		fr.close();
		System.out.println(); 
		System.out.println("No of charecters: "+noOfChar);
		System.out.println("No of words: "+noOfWords);
		System.out.println("No of lines: "+noOfLines);
		
		//question 2
		FileReader frn = new FileReader("hello.txt"); 
		String word ="";
		String matchWord = "banglore";
		while((ch=frn.read())!=-1) {
			if((char)ch!= '\n' && (char)ch!= ' ') {
				word+=(char)ch;
			}
			else {
				if(word.equals(matchWord)) {
					System.out.println("Match found: "+word+" == "+matchWord);
				}
				word="";
			}
		}
		frn.close();
		
		//question 3
		FileReader frnn= new FileReader("hello.txt");
		FileWriter writer = new FileWriter("dac.txt");
		while((ch=frnn.read())!=-1) {
			writer.write((char)ch);
		}
		frnn.close();
		writer.close();
		
		System.out.println();
		System.out.println("Write Complete.");
		
		FileReader frnnn=new FileReader("dac.txt");
		while((ch=frnnn.read())!=-1) {
			System.out.print((char)ch);
		}
		frnnn.close();
	}
}
