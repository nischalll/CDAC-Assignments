package CollectionDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BookManager {
	public static void main(String[] arg) {
		Book[] books=new Book[5];
		books[0]=new Book("HarryPotter", "jk rowling", 5.0, 17);
		books[1]=new Book("HarryBotter", "jk sowling", 5.0, 73);
		books[2]=new Book("HarryCotter", "jk towling", 5.0, 2);
		books[3]=new Book("HarryDotter", "jk uowling", 5.0, 5);
		books[4]=new Book("HarryEotter", "jk vowling", 5.0, 8);
		
		HashMap<Integer, Book> hMap=new HashMap<>();
		boolean loop=true;
		while(loop) {
			System.out.println("press 1 to insert books to map.");
			System.out.println("press 2 to display map using for each.");
			System.out.println("press 3 to display map of given key.");
			System.out.println("press 4 to reduce price by 10%.");
			
			Scanner scanner = new Scanner(System.in);
			int choice=scanner.nextInt();
			
			switch (choice) {
			case 1: {
				hMap.put(books[0].getIsbn(), books[0]);
				hMap.put(books[1].getIsbn(), books[1]);
				hMap.put(books[2].getIsbn(), books[2]);
				hMap.put(books[3].getIsbn(), books[3]);
				hMap.put(books[4].getIsbn(), books[4]);
				break;
			}
			case 2: {
				for(Entry<Integer, Book> entry :hMap.entrySet()) {
					 System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
				}
				break;
			}
			case 3:{
				Scanner sc = new Scanner(System.in);
				int index = sc.nextInt();
				System.out.println(hMap.get(index)); 
				break;
			}
			case 4:{
				Scanner sc = new Scanner(System.in);
				int index = sc.nextInt();
				Book book = hMap.get(index);
				book.setPrice(book.getPrice()*.90);
				for(Entry<Integer, Book> entry :hMap.entrySet()) {
					 System.out.println("Key = " + entry.getKey() +
                            ", Value = " + entry.getValue());
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
}
