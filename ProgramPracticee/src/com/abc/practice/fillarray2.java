package com.abc.practice;

import java.util.Arrays;
import java.util.Scanner;

public class fillarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter the start value");
		int start=sc.nextInt();
		System.out.println("enter the end value");
		int end=sc.nextInt();
		System.out.println("enter the key value");
		int key=sc.nextInt();
		Arrays.fill(a,start,end,key);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");

	}

}
