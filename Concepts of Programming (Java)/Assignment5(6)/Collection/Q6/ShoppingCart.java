package CollectionDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) {
		ArrayList<String> cart=new ArrayList<>();
		boolean loop = true;
		while(loop) {
			System.out.println("Press 1 to add item to the cart");
			System.out.println("Press 2 to remove items from cart");
			System.out.println("Press 3 to empty the cart");
			System.out.println("Press 4 to view items in the cart");
			System.out.println("Press 5 to checkout cart");
	
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1: {
				String item = scanner.nextLine();
				cart.add(item);
				System.out.println(cart);
				break;
			}
			case 2: {
				String item = scanner.nextLine();
				cart.remove(item);
				System.out.println(cart);
				break;
			}
			case 3: {
				cart.clear();
				System.out.println(cart);
				break;
			}
			case 4:{
				System.out.println(cart);
				break;
			}
			case 5:{
				System.out.println("thank you for shopping.");
				loop=false;
				break;
			}
			default:
				System.out.println("Wrong input try again");
			}
		}
	}
	
}
