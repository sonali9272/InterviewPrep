package com.java.interview;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num to be reversed"); 
		int originalNum = input.nextInt();

		int reverse = reverseIntegerNum(originalNum);
		System.out.println("Reverse no is:" + reverse);
		
		input.close();

	}

	public static int reverseIntegerNum(int originalNum) {
		
		int reverse = 0;
		int temp = 0;
		
		while(originalNum!=0){
			
			temp = originalNum % 10;
			reverse = reverse * 10 + temp;
			originalNum = originalNum / 10;	
			
		}
		
		return reverse;	
	}
}
