package CollectionDemo;

import java.util.Stack;

public class stackDemo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(100);
		s.push(200);
		s.pop();
		System.out.println(s);
	}
}
