package com.abc.practice;

import java.util.Arrays;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of  array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter   array element");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] >= a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	

		System.out.println("resultant sort array is:-");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

	}

}
