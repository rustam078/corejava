package com.abc.practice.testcode;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class MostFrequentCharacter {
 static  int max=0;
 static char key;
	public static void main(String[] args) {
		System.out.println(new Date().getTime());
		String str = "Test data check wwworrrd";
		
		str = str.toLowerCase();
		Map<Character, Integer> treeMap = new TreeMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				if (treeMap.containsKey(str.charAt(i))) {
					treeMap.put(str.charAt(i), treeMap.get(str.charAt(i)) + 1);
				} else {
					treeMap.put(str.charAt(i), 1);

				}

			}
		}
		
		
		for(Map.Entry entry:treeMap.entrySet()) {
			if((int)entry.getValue()>=max ) {
				max=(int)entry.getValue();
				key=(char) entry.getKey();
			}
		
		}
		System.out.println(key);
		System.out.println(treeMap);
		System.out.println(new Date().getTime());

	}

}