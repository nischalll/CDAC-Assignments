package com.cdac;

public class Q8Tables {
	public static void main(String args[]) {
		int number = 10;
		table(number);
	}

	private static void table(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.println(number + " * " + i + " = " + number * i);

		}
	}

}
