package com.java.interview;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		
		//@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		String[] arr = name.split("\\s+");
		
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++){
		System.out.println("Entered string is:"+arr[i]);
		System.out.println("Position of the entered string is:" +i);
			}
		}
	}


