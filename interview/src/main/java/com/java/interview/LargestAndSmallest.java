package com.java.interview;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int[] array = {1,6,3,9,8,13,2};
		
		int smallest = array[0];
		int largest = array[0];
		
		for(int i=1; i<array.length; i++){
			if(array[i]>largest){
				largest = array[i];
			}
			
			if(array[i]<smallest){
				smallest = array[i];
			}
		}
		System.out.println("Largest: " + largest + '\t' + "Smallest: " + smallest);
	}

}
