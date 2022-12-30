package com.abc.practice;

import java.util.Scanner;

public class leftrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the size of  array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter   array element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter how many left rotate");
		int m=sc.nextInt();
		int mod=m%n;

		for(int i=0;i<n;i++)
			System.out.print(a[(i+mod)%n]+" ");
		System.out.println();





	}

}
