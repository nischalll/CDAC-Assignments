package com.cdac;

public class Q12SumValuesOfArray {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		System.out.println("result = "+sum);
	}
}
