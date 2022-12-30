package com.fullcreative.map;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountRepeatCharacter {
	public static void main(String[] args) {
		String str = "my name is rustam ali";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				if (map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
				} else {
					map.put(str.charAt(i),1);

				}
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" ====> "+entry.getValue());
		}
	}
}
