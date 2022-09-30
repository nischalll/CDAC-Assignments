package com.cdac;

public class Q11ElectricityBill {
	public static void main(String args[]) {
		int units = 520;
		int bill = 0;

		if (units <= 100) {
			bill+=100*1.2;
			units-=100;
		}
		else if(units>=100 && units <=300) {
			bill+=100*1.2 + (units-100)*2;
		}
		else if(units>300 && units<=600) {
			bill+= 100*1.2 + 200*2 + (units-300)*3;
		}
		else {
			bill+= 100*1.2 + 200*2 + 300*3 + (units-600)*5;
		}
		System.out.println(bill);
	}
}
