package com.cdac;

public class Q9LargestOfThree {
	public static void main(String[] args) {
		int number1=70;
		int number2=90;
		int number3=3220;
		largestOfThree(number1,number2,number3);
	}

	private static void largestOfThree(int number1,int number2,int number3) {
		if(number1>number2) {
			if(number1>number3) {
				System.out.println("number1 is the largest :"+ number1);
			}
			else {
				System.out.println("number3 is the largest :"+ number3);
			}
		}
		else if(number3>number2) {
			System.out.println("number3 is the largest :"+ number3);
		}
		else {
			System.out.println("number2 is the largest :"+ number2);
		}
	}
}
