package com.abc.practice;

import java.util.Scanner;


/* EXPLANATION:-
 * 
 *  input n=4;
 * so 4+44+444+4444;
 * output= 4963;
 * 
 * input n=2;
 * so 2+22;
 * output= 24;
 */
public class sumofseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		int temp=n,sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=temp;
			temp=temp*10+n;
		}
		System.out.println(sum);
	}

}
