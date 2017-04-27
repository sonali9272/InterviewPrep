package com.amazon.interview;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String input = "This is a test string";
		
		System.out.println(reverseWords(input));

	}

	public static String reverseWords(String input) {
		
		if(input == null || input.length() == 0){
			return null;
		}
		
		String reverse = "";
		String[] array = input.split("\\s+");
		
		for(int i=array.length-1; i>=0; i--){
			reverse = reverse + " " +array[i];
		}
		return reverse;	
	}
}
