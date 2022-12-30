package com.abc.practice;

import java.util.Arrays;
import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);


		System.out.println("enter the size of  array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter   array element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();

		int j=0,c=0;
		int ar[]=new int[n];

		for (int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				ar[j]=a[i];
				j++;
				c++;
			}
		}



		for (int i=0;i<n;i++)
		{
			if(a[i]%2==1)
			{
				ar[j]=a[i];
				j++;
			}
		}

		System.out.println("resultant array before sorting is:-");
		for(int i=0;i<a.length;i++)
			System.out.print(ar[i]+" ");
		System.out.println();

		int temp;
		for(int i=0;i<c-1;i++)
		{
			for(int t=i+1;t<c;t++)
			{
				if(ar[i]>ar[t])
				{
					temp=ar[i];
					ar[i]=ar[t];
					ar[t]=temp;
				}
			}
		}

		for(int i=c;i<n-1;i++)
		{
			for(int t=i+1;t<n;t++)
			{
				if(ar[i]<ar[t])
				{
					temp=ar[i];
					ar[i]=ar[t];
					ar[t]=temp;
				}
			}
		}
		System.out.println("resultant array is:-");
		for(int i=0;i<a.length;i++)
			System.out.print(ar[i]+" ");
	}

}
