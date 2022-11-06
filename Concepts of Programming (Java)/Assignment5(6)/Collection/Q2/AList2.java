package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AList2 {
	public static void main(String[] args) {
		Player[] players = new Player[5];
		players[0]=new Player("rahul", 200, 18, "India", 7, null);
		players[1]=new Player("harbajan", 50, 18, "India", 9, null);
		players[2]=new Player("sachin", 500, 18, "India", 13, null);
		players[3]=new Player("dhoni", 400, 18, "India", 14, null);
		players[4]=new Player("kolhi", 300, 18, "India", 15, null);
		
		PlayerManager pm = new PlayerManager(players);
		boolean loop=true;
		while(loop) {
			System.out.println("===Array Lis Menu====");
			System.out.println("Press 1 to display players who scored max no of runs.");
			System.out.println("Press 2 to sort players by name");
			System.out.println("Press 3 to remove player who scored less than 100 runs");
			System.out.println("Press 4 to update category");
			System.out.println("Press 5 to EXIT");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				pm.displayMax();
				break;
			}
			case 2: {
				pm.playerSort();
				pm.display();
				break;
			}
			case 3: {
				pm.removeLessThan();
				pm.display();
				break;
			}
			case 4: {
				pm.changeCategory();
				pm.display();
				break;
			}
			case 5:{
				loop=false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
		
	}
}
