package com.abc.practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int temp=n,rem,length=0,sum=0;
		while(temp>0)    
		{   
		temp = temp/10;   
		length++;   
		} 
		temp=n;
		System.out.println(temp);
		for(int i=1;i<=length;i++)
		{
			rem=temp%10;
			sum+=(int)Math.pow(rem,length);
			temp/=10;
		}
		
		if(n==sum)
			System.out.println("armstrong");
		else
			System.out.println(sum+"not armstrong");

	}

}
