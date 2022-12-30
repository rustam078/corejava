package com.abc.practice;

import java.util.Scanner;

public class merge {

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
		for(int i=0;i<a1.length;i++)
			a3[i]=a1[i];
		for(int i=0;i<a2.length;i++)
			a3[i+a1.length]=a2[i];
		
		System.out.println("resultant array is:-");
		for(int i=0;i<a3.length;i++)
			System.out.print(a3[i]+" ");
		
		

	}

}
