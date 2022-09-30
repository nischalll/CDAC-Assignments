package com.cdac;

public class Q14ReverseAnArray {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60,70,999,80,90,100};
		int[] revArray = new int[array.length];
		
		for(int i=array.length-1; i>=0; i--) {
			revArray[(array.length-i)-1]=array[i];
		}
		for(int i=0 ; i<array.length; i++) {
			System.out.println(array[i]+ "  "+revArray[i]);

		}
	}
}
