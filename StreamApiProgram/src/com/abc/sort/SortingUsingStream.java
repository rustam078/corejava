package com.abc.sort;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingStream {
	public static List<Integer> number(){
		return List.of(11,2,3,45,23,47,23,12,54,21,24,27);
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = number();
		
		//ascending order
		List<Integer> sort = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		//descending order
		List<Integer> reversesort = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesort);
		
		//array in descending order
		  Integer[] array = numbers.stream().sorted(Collections.reverseOrder()).toArray(Integer[]::new);
		System.out.println(array[0]);
	}

}
