package CollectionDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LLDemo {
	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();  
		  al.add(7);  
		  al.add(2);
		  al.addFirst(10);
		  al.addLast(40);
		  al.removeFirst();
		  al.remove(2);
		  Collections.sort(al,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		  System.out.println(al);
	}
}
