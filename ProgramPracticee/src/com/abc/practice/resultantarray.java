package com.abc.practice;

import java.util.Scanner;

public class resultantarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the size of  array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter   array element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int sum=1;
		for(int i=0;i<n;i++)
		{
			sum*=a[i];
		}
		
		for(int i=0;i<n;i++)
		System.out.print(sum/a[i]+" ");

	}

}
