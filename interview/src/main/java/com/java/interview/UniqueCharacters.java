package com.java.interview;

public class UniqueCharacters {

	public static void main(String[] args) {
		String input = "nitin";
		
		System.out.println(uniqueCharacter(input));

	}

	private static boolean uniqueCharacter(String input) {
		char[] array = input.toCharArray();
		String test = "";
				
		
		for(int i=0; i<array.length; i++){
			for(int j=i+1; j<array.length; j++){
				if(array[i] == array[j]){
					test = test + array[i];
				}if(test.isEmpty()){
					return false;
				}else{
					return true;
				}
			}
		}
		return true;
	}

}
