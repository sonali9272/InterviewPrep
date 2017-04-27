package com.java.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String word = "aabbccedfe";
		char[] array = word.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char item:array){
			if(map.containsKey(item)){
				map.put(item, map.get(item)+1);
			}else{
				map.put(item,1);
			}	
		}
		
		Set<Character>  keys = map.keySet();
		for(Character key:keys){
			if(map.get(key) == 1){
				System.out.println(key);
				break;
			}
		}
	}
}
