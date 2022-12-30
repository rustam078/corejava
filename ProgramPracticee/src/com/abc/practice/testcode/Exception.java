package com.abc.practice.testcode;

//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class Exception {
//
//	public static void main(String[] args) {
//		List arrayList = new ArrayList();
//		arrayList.add(new StringBuffer("rustam"));
//		arrayList.add(new StringBuffer("candan"));
//		arrayList.add(new StringBuffer("bipul"));
//		arrayList.add(new StringBuffer("karan"));
//		arrayList.add(new StringBuffer("ramesh"));
//		arrayList.add(new StringBuffer("arjun"));
//		arrayList.add("dilip");
//		arrayList.add("dilip");
//
//		System.out.println(arrayList);
//		Collections.sort(arrayList, (o1, o2) -> o1.toString().compareTo(o2.toString()));
//		System.out.println(arrayList);
//		Collections.sort( arrayList,new MyComparator().reversed());
//		System.out.println(arrayList);
//arrayList.stream().forEach(i->{
//	if(i.toString().startsWith("r"))
//     System.out.println(i);
//});
//	}
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exception {

	public static void replace(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String s=arr[i];
			 s= s.replaceAll("[aeiou]", "*");
			 arr[i]=s;

		}
		for(String s2:arr) {
			System.out.println(s2);
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] student = { "rustam", "simran", "atul", "dravid" };
		
		for(String s1:student)
			System.out.print(s1+"\t");
		System.out.println();
		Arrays.sort(student, ( o1,o2) -> o1.toString().substring(1, 2).compareTo(o2.toString().substring(1, 2)));
		for(String s1:student)
			System.out.print(s1+"\t");
		
		 replace(student);
	}
	
}

class mycompartor implements Comparator {

	public int compare(Object o1, Object o2) {
		return o1.toString().substring(1, 2).compareTo(o2.toString().substring(1, 2));
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

}