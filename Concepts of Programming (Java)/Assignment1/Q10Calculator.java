package com.cdac;

import java.util.Scanner;

public class Q10Calculator {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		boolean on=true;
		int choice;
		int num1,num2;
		while(on) {
			System.out.println("Press 1 for addition : ");
			System.out.println("Press 2 for substraction : ");
			System.out.println("Press 3 for multiplication : ");
			System.out.println("Press 4 for division : ");
			
			System.out.print("Enter Your Choice: ");
			choice=scanner.nextInt();
			System.out.println();
			switch(choice){    
		    case 1: 
		    	System.out.println("Enter Two Numbers for Addition with spaces between:");
		    	num1=scanner.nextInt();
		    	num2=scanner.nextInt();
		    	System.out.println(num1+num2);
		    break;  
		    case 2: 
		    	System.out.println("Enter Two Numbers for Substraction with spaces between:"); 
		    	num1=scanner.nextInt();
		    	num2=scanner.nextInt();
		    	System.out.println(num1-num2);
		    break;  
		    case 3: 
		    	System.out.println("Enter Two Numbers for Multiplication with spaces between:");
		    	num1=scanner.nextInt();
		    	num2=scanner.nextInt();
		    	System.out.println(num1*num2);
		    break;  
		    case 4: 
		    	System.out.println("Enter Two Numbers for Division with spaces between:");
		    	num1=scanner.nextInt();
		    	num2=scanner.nextInt();
		    	System.out.println(num1/num2);
		    break;    
		    default:
		    	System.out.println("--------INVALID CHOICE!---------\n\n");;  
		    }  
		}
	}
}
