package com.cdac;

public class Q13MinAndMax {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60,70,999,80,90,100};
		int min=array[0];
		int max=array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]<min)
				min=array[i];
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("minimum = "+min);
		System.out.println("maximum = "+max);
	}
}
