package com.abc.frequencyofeachchar;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharUsingStream {

	public static void main(String[] args) {
		String str = "aaaabddegkshfhaajjjjjzzzzz";
		
		
		//1st approach to count frequency of char using map function
				Map<Character, Integer> frequency1 = str.chars().mapToObj(c -> (char) c)
						.collect(Collectors.toMap(Function.identity(),c -> 1,Integer::sum));
				System.out.println(frequency1);
				
		//2st approach to count frequency of char using grouping function
		Map<Character, Integer> frequency2 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));
	
		//this is to get highest repeated char if frequency same then based on ascii 
		int max = 0;
		char ch = ' ';
		for (Map.Entry<Character, Integer> entry : frequency2.entrySet()) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
			if (entry.getValue() >= max) {
				if ((int) entry.getKey() > (int)ch) {
					max = entry.getValue();
				ch = entry.getKey();
				}
			}
		}
		System.out.println(ch + " ===> " + max);
		
		
		
		System.out.println(getNumChar(str));

	}

	//3rd approach without using any map
	public static char getNumChar(String s) {
		char[] c = s.toCharArray();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int[] countArray = new int[26];
		for (char x : c) {
			for (int i = 0; i < alphabet.length(); i++) {
				if (alphabet.charAt(i) == x) {
					countArray[i]++;
				}
			}
		}

		java.util.HashMap<Integer, Character> countList = new java.util.HashMap<Integer, Character>();

		for (int i = 0; i < 26; i++) {
			countList.put(countArray[i], alphabet.charAt(i));
		}
		java.util.Arrays.sort(countArray);
		int max = countArray[25];
		return countList.get(max);
	}
	
	
	
}
