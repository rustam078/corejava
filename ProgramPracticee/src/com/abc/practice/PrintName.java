package com.abc.practice;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a odd number");
		int n=sc.nextInt();

		for(int i=0;i<n;i++)

		{
			//for R
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0&&j<n-2||j==n-2&&i!=0&&i<n/2||i==n/2&&j<n-2||i-j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.print("  ");


			//for U
			for(int j=0;j<n;j++)
			{
				if(j==0&&i!=n-1||j==n-1&&i!=n-1||i==n-1&&j!=0&&j!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.print("   ");


			//for S
			for(int j=0;j<n;j++)
			{
				if(j==0&&i!=0&&i!=n/2&&i<n/2||i==0&&j!=0||i==n/2&&j!=0&&j!=n-1||j==n-1&&i>n/2&&i!=n-1||i==n-1&&j!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.print("   ");


			//for T
			for(int j=0;j<n;j++)
			{
				if(i==0||j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.print("   ");

			//for A
			for(int j=0;j<n;j++)
			{
				if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||j==n-1&&i!=0||i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");


			//for M
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j&&i<=n/2||i+j==n-1&&i<n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.print("   ");
			System.out.print("   ");


			//for A
			for(int j=0;j<n;j++)
			{
				if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||j==n-1&&i!=0||i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");

			//for L
			for(int j=0;j<n;j++)
			{
				if(j==0||i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.print("  ");

			//for I
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.print("   ");

			System.out.println();
		}

	}

}
