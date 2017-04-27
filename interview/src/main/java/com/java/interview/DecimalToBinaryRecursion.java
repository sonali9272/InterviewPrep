package com.java.interview;

public class DecimalToBinaryRecursion {

	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(decimalEqui(num));

	}

	private static int decimalEqui(int num) {
		
		if(num == 0){
			return 0;
		}else{
			return (num % 2) + decimalEqui(num / 2);
		}	
	}
}
