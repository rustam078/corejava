package com.abc.practice;

import java.util.Scanner;

public class zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the size of 1st array");
		int n1=sc.nextInt();
		int a1[]=new int[n1];
		System.out.println("enter  1st array element");
		for(int i=0;i<n1;i++)
			a1[i]=sc.nextInt();
		
		
		System.out.println("enter the size of 2nd array");
		int n2=sc.nextInt();
		int a2[]=new int[n2];
		System.out.println("enter  2st array element");
		for(int i=0;i<n2;i++)
			a2[i]=sc.nextInt();
		
		int a3[]=new int[n1+n2];
		performance(n1,n2,a1,a2,a3);
		
		
		
	}
	
	static void performance(int n1,int n2,int[] a1,int []a2,int[] a3)
	{
		int j=0;
		int max =(n1>n2)?n1:n2;
		
		for(int i=0;i<max;i++)
		{
			if(i<n1)
			{
				a3[j]=a1[i];
				j++;
			}
			if(i<n2)
			{
				a3[j]=a2[i];
				j++;
			}
		}
		
		System.out.println("resultant array is:-");
		for(int i=0;i<a3.length;i++)
			System.out.print(a3[i]+" ");
	}

}
