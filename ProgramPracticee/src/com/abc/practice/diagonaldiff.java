package com.abc.practice;

import java.util.Scanner;

public class diagonaldiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the size of  array");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("enter   array element");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		
		int d=0;
		
		for(int i=0;i<n;i++)
		{
			d+=a[i][i];
			d-=a[i][n-1-i];
		}
		System.out.println("difference="+Math.abs(d));
	}

}
