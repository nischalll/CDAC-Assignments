import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AList {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>();
		
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);
		aList.add(7);
		aList.remove(0);
		aList.set(1, 22);
		Iterator<Integer> iterator = aList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("viewing element: "+aList.get(0));
		System.out.println(aList);
		Collections.sort(aList);
		System.out.println(aList);
	}
}
