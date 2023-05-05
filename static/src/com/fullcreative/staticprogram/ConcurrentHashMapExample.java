package com.fullcreative.staticprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class ConcurrentHashMapExample {

	public static void main(String[] args)
	{
		
ConcurrentHashMap<Integer, String> m= new ConcurrentHashMap<>();

		m.put(100, "Hello");
		m.put(101, "Geeks");
		m.put(102, "Geeks");

		// Here we cant add Hello because 101 key
		// is already present in ConcurrentHashMap object
		m.putIfAbsent(101, "Hello");

		// We can remove entry because 101 key
		// is associated with For value
		m.remove(101, "Geeks");

		// Now we can add Hello
		m.putIfAbsent(103, "Hello");

		// We cant replace Hello with For
		m.replace(101, "Hello", "For");
		System.out.println(m);
		
		
		List<Integer> numbersList = new ArrayList<>(Arrays.asList(1,2,1,34,45,5,7, 1, 2, 3, 3, 3, 4, 5, 6, 6,9, 6, 7, 8));
		List<Integer> collect = numbersList.stream()
        .sorted()
        .distinct()
        .collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(collect.get(0)+" "+collect.get(collect.size()-1));
		
		String s="rustam";
		s.toUpperCase();
       System.out.println(s);
	}
}





