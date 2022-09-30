package com.cdac;

public class Q7PyramidNumberPattern {
	public static void main(String args[]) {
		int limit=10;
		int count=1;
		for (int i = 1; i <=limit ; i=i+2) {
			for(int j=9; j>=i; j=j-2){
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(count+" ");
			}
			count++;
			System.out.println();
		}
	}
}
