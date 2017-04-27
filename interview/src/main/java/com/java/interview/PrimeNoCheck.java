package com.java.interview;

public class PrimeNoCheck {

	public static void main(String[] args) {
		int number = 56;

		System.out.println(primeCheck(number));
	}

	private static boolean primeCheck(int number) {
		int sqrt = (int) Math.sqrt(number);
		boolean isPrime = true;
		
		for(int i=2; i<=sqrt; i++){
			if(number % i == 0){
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
}
