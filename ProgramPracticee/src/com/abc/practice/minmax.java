package com.abc.practice;

import java.util.Arrays;
import java.util.Scanner;

public class minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the size of  array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter   array element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		
		System.out.println("min element= "+a[0]+"\n"+"max element= "+a[n-19]);
	}

}
