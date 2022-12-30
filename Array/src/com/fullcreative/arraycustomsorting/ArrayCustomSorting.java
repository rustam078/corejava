package com.fullcreative.arraycustomsorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayCustomSorting {

	public static void main(String[] args) {
		String[] student = { "rustam", "simran", "atul", "dravid" };

		System.out.println("before sorting...");
		for (String s1 : student)
			System.out.print(s1 + "\t");
		System.out.println();
		Arrays.sort(student, (o1, o2) -> o1.toString().substring(1, 2).compareTo(o2.toString().substring(1, 2)));
		System.out.println("after sorting...");
		for (String s1 : student)
			System.out.print(s1 + "\t");

	}

}

//class mycompartor implements Comparator {
//
//	public int compare(Object o1, Object o2) {
//		return o1.toString().substring(1, 2).compareTo(o2.toString().substring(1, 2));
//	}
//}
