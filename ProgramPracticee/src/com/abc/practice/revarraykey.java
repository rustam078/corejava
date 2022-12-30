package com.abc.practice;

import java.util.Scanner;

public class revarraykey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the size of  array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter   array element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();

		System.out.println("enter key form where to swap");
		int key=sc.nextInt();

		int arr[]=new int[n];
		int p=0;
		for(int i=0;i<key;i++)
		{
			arr[p]=a[i];
			p++;
		}
		
		for(int i=n-1;i>=key;i--)
		{
			arr[p]=a[i];
			p++;
		}

		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

}
