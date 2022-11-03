import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int noOfPlayers=5;
		Player players[] = new Player[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<noOfPlayers; i++) {
			String name;
			int age;
			String country;
			int runs;
			System.out.println("Enter Player Name: ");
			name=sc.nextLine();
			System.out.println("Enter Player Age: ");
			age=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Player Country: ");
			country=sc.nextLine();
			System.out.println("Enter Player TotalRuns: ");
			runs=sc.nextInt();
			players[i]=new Player(name,age,country,runs);
		}
		for(int i=0; i<noOfPlayers;i++) {
			System.out.println(players[i].name+" "+players[i].getRuns());
		}
		sc.close();
	}
}
