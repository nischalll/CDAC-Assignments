package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PlayerManager {
	private ArrayList<Player> pList;
	
	public PlayerManager(Player[] players) {
		pList = new ArrayList<>(Arrays.asList(players));
	}
	
	public void removeLessThan() {
		for (int i=0; i<pList.size(); i++) {
			Player player = pList.get(i);
			if(player.getTotalRun()<100) {
				pList.remove(i);
			}
		}
	}
	
	public void changeCategory() {
		for (int i=0; i<pList.size(); i++) {
			Player player = pList.get(i);
			if(player.getNoOfCentury()>10) {
				player.setCategory("A");
			}else {
				player.setCategory("B");
			}
		}
	}
	
	public void playerSort() {
		Collections.sort(pList,new Comparator<Player>() {
			@Override
			public int compare(Player p1, Player p2) {
				return p1.getName().compareTo(p2.getName());
			};
		});
	}
	
	public void displayMax() {
		Player max=pList.get(0);
		
		for (int i=0; i<pList.size(); i++) {
			Player player = pList.get(i);
			if(player.getTotalRun()>max.getTotalRun()) {
				max=player;
			}
		}
		System.out.println(max);
	}
	
	public void display() {
		System.out.println(pList);
	}
	
}
