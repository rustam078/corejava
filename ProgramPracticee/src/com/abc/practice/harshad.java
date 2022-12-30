package com.abc.practice;

import java.util.Scanner;

public class harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int rem;
		int temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			sum+=rem;
			temp=temp/10;
		}
		if(n%sum==0)
			System.out.println("harshed number");
		else
			System.out.println("not a harshed number");
	}

}
