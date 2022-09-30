package com.cdac;

public class Q15SecondLargest {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60,70,999,80,90,100};
		int max=array[0];
		int secondMax=array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
			if(array[i]>secondMax &&array[i] <max) {
				secondMax=array[i];
			}
		}
		System.out.println("sec max = "+secondMax);
	}
}
