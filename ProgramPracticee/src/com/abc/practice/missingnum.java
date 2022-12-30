package com.abc.practice;

import java.util.Arrays;
import java.util.Scanner;

public class missingnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the size of  array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter   array element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				System.out.println(1);
				System.exit(0);
			}
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		System.out.println();
		int res=0;
		int sum=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				sum=a[i]+a[i+1];
				if(sum%2==0)
				{
					res=sum/2;
				}
			}
		}
		
		if(res==0)
		{
			res=1+a[n-1];
		}
		
		System.out.println(res);
	}

}
