package com.abc.practice;

import java.util.Scanner;

public class fibonacci {

	public static void main(String args[])  
	{    
		int n,c;  
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			c= (int) Math.pow(2, i);
			if (n==c)
			{
				System.out.println( n + " is a power of 2");
				System.exit(0);
			}	
		}
		System.out.println("Not a power of 2 ");	
	}





}



