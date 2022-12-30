package com.abc.practice;

import java.util.Scanner;

public class Strongnum {

	public static void main(String[] args) {
		int n,i;
		int fact,rem;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : " );
		n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(n != 0)
		{
		i = 1;
		fact = 1;
		rem = n % 10;
		while(i <= rem)
		{
		fact *= i;
		i++;
		}
		sum = sum + fact;
		n = n / 10;
		}
		if(sum == temp)
		System.out.println(temp+ " is a strong number\n");
		else
		System.out.println(temp+ " is not a strong number\n");
		System.out.println();
		}

}

