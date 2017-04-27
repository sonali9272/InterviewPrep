package com.java.interview;

public class SwapMulDiv {

	public static void main(String[] args) {
		int a = 5; 
		int b = 10;
		
		System.out.println("Before swaping");
		System.out.println("a:" + a + "\t" + "b" + b);
		
		swapmuldiv(a,b);

	}

	public static void swapmuldiv(int a, int b) {
		a = a*b;
		b = a/b;
		a = a/b; 
		
		System.out.println("a:" + a +  "\t" + "b:" + b);
	}

}
