package com.abc.practice;


import java.math.BigInteger;
import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println();
			System.out.println();
			System.out.println("press 1 for check prime number");
			System.out.println("press 2 to find num btn range");
			System.out.println("press 3 for Twin prime number");
			System.out.println("press 4 for fibonacci number");
			System.out.println("press 5 for belonging fibonacii number");
			System.out.println("press 6 for checking perfect square number");
			System.out.println("press 7 for checking power of 2");
			System.out.println("press 8 for long factorial using BigInteger class");
			System.out.println("press 9 for print sum of each digit");
			System.out.println("press 10 for checking strong number");
			System.out.println("press 11 for checking Armstrong number");
			System.out.println("press 12 for checking Harsad number");
			System.out.println("press 13 for exit");
			System.out.println("enter your choice");
			int n=sc.nextInt();

			switch(n)
			{
			case 1: checkprime();
			break;

			case 2: range();
			break;

			case 3: twin();
			break;

			case 4: fibonacci();
			break;

			case 5: fibelong();
			break;

			case 6: perfectsquare();
			break;

			case 7: powerof2();
			break;

			case 8: longfact();
			break;


			case 9: sumofdigit();
			break;

			case 10: strong();
			break;

			case 11: armstrong();
			break;

			case 12: harshad();
			break;

			default :System.exit(0);
			}
		}
	}

	static void checkprime()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int c=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				c++;
				break;
			}
		}
		if(num==1)
			System.out.println(num+" is a composite number");
		else if(c>0)
			System.out.println(num+" is not a prime number");
		else
			System.out.println(num+" is a prime number");
	}

	static void range()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int first=sc.nextInt();
		int last=sc.nextInt();
		int c=0;
		while(first<=last)
		{
			for(int i=2;i<=first/2;i++)
			{
				if(first%i==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
				System.out.print(first+" ");

			first++;
			c=0;


		}
		System.out.println();
	}


	static void twin()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(is_prime(i)&&is_prime(i+2))
			{
				System.out.println("("+i+","+(i+2)+")");
			}
		}
	}

	static boolean is_prime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return  false;
		}
		return true;
	}

	static void fibonacci()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int sum;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;

		}
		System.out.println();
	}

	static boolean search(int n)
	{
		int a=0;
		int b=1;
		int sum=0;

		while(sum<=n)
		{
			a=b;
			b=sum;

			if(sum==n)
				return true;

			sum=a+b;

		}
		return false;

	}

	static void fibelong()
	{


		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number");
		int n=sc.nextInt();
		boolean f=search(n);
		if(f==true)
		{
			System.out.println("belong to fibonaci number");
		}
		else

		{
			System.out.println("not belong to number");
		}

	}

	static void perfectsquare()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number");
		int n=sc.nextInt();
		int s=(int)Math.sqrt(n);
		if(s*s==n)
			System.out.println("perfect square");
		else
			System.out.println("not a perfect square");

	}

	static void powerof2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number");
		int n=sc.nextInt();
		int s;
		int c=0;
		for(int i=1;i<=n/2;i++)
		{
			s=(int)Math.pow(2,i);
			if(s==n)
			{
				c++;
				System.out.println("is a power of 2");
				break;
			}
		}
		if(c==0)
			System.out.println("not a power of 2");

	}


	static void longfact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number");
		int n=sc.nextInt();
		BigInteger fact=new BigInteger("1");
		for(int i=1;i<=n;i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}

		System.out.println(fact);

	}


	static void sumofdigit()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
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
		System.out.println("sum= "+sum);


	}

	static void strong()
	{

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


	static void armstrong()
	{
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

	static void harshad()
	{
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

