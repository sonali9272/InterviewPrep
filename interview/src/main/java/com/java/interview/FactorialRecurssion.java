package com.java.interview;

public class FactorialRecurssion {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(calculateFactorial(num));
	}

	private static int calculateFactorial(int num) {
		
		if(num == 0){
			return 1;
		}
		
		int factorial = num*calculateFactorial(num-1);
		return factorial;
	}
}
