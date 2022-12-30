package com.abc.practice;

import java.util.Scanner;

public class fillarray {
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter the key value");
		int key=sc.nextInt();
		for(int i=0;i<n;i++)
			a[i]=key;
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");

}
}
