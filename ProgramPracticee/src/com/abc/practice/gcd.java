package com.abc.practice;

import java.util.Scanner;

public class gcd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the FIRST value");
		int n1=sc.nextInt();
		System.out.println("enter the second value");
		int n2=sc.nextInt();
		int max=(n1>n2)?n1:n2;
		int gcd=1;
		for(int i=1;i<=max;i++)
		{
		  if(n1%i==0 && n2%i==0)	
		  {
			  gcd=i;
		  }
		}
		System.out.println(gcd);
		}
		
}
