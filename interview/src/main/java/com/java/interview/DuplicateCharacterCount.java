package com.java.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
		String name = "sonali singh";
		char[] array = name.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char item: array) {
			
			//map.put(item, map.getOrDefault(item, 0) + 1);

			if (map.containsKey(item)) {
				map.put(item, map.get(item)+1);
			} else {
				map.put(item, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		for(Character character:keys){
			if(map.get(character)>1){
				System.out.println("character " + character + '\t'+ "occurred more than once" +'\t'+ map.get(character));
			}
		}
	}
}
