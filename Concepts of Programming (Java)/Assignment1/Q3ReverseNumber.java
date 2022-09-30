package com.cdac;

public class Q3ReverseNumber {
	public static void main(String args[]) {
		int number=123;
		reverse(number);
	}
	
	public static void reverse(int number) {
		int newNumber=number;
		int result=0;
		
		while(newNumber>0) {
			result=result*10;
			result=result+(newNumber%10);
			newNumber=newNumber/10;
		}
			
		

		System.out.println(number+" "+result);
	}
}
