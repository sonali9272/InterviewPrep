package com.java.interview;

public class SumOfDigitsOfNum {

	public static void main(String[] args) {
		int num = 2305;
	
		System.out.println(sum(num));
		
		}

	private static int sum(int num) {
		
		return (num == 0) ? 0 : num % 10 + sum(num/10);
	}
}
