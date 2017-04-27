package com.java.interview;

public class SumONaturalNumbers {

	public static void main(String[] args) {
		int n = 5;
		
		System.out.println(calculateSum(n));

	}

	private static int calculateSum(int n) {
		
		if(n==0){
			return 0;
		}else{
			return (n*n) + calculateSum(n - 1);
		}	
	}
}
