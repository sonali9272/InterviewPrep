package com.java.interview;

import java.util.Scanner;

public class ReverseWordByWord {

	public static void main(String[] args) {
		
		//@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word to be reversed");
		String original = input.nextLine();
		
		String reverse = reverseWordByWord(original);
		System.out.println("Reversed word is:" + reverse);
		
		input.close();
	}

	public static String reverseWordByWord(String original) {
		
		if(original == null || original.length() == 0){
			return null;
			// throw new IllegalArgumentException();
		}
		
		char[] array = original.toCharArray();
		String reverse = "";
		
		for(int i=array.length-1; i>=0; i--){
			reverse = reverse + array[i];
		}
		return reverse;
	}
}

