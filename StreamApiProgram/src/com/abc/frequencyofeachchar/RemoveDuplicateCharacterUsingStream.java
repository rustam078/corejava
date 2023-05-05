package com.abc.frequencyofeachchar;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacterUsingStream {

	public static void main(String[] args) {
		String str = "aaabddegkshfhjhhhd";
		Set<Character> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
           System.out.println(collect.toString());
           
           //2nd approach using distinct method
           List<Character> collect1 = str.chars().mapToObj(c -> (char) c).distinct().collect(Collectors.toList());
           System.out.println(collect1);
	}
}

