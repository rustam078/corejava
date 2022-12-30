package com.abc.practice;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a odd number");
				int n=sc.nextInt();
				System.out.println("pattern 1");
				pat1(n);
				System.out.println();
				System.out.println("pattern 2");
				
				System.out.println();
				pat2(n);
				System.out.println();
				System.out.println("pattern 3");
				System.out.println();
				pat3(n);
				System.out.println();
				System.out.println("pattern 4");
				System.out.println();
				pat4(n);
				System.out.println();
				System.out.println("pattern 5");
				System.out.println();
				pat5(n);
				System.out.println();
				System.out.println("pattern 6");
				System.out.println();
				pat6(n);
				System.out.println();
				System.out.println("pattern 7");
				System.out.println();
				pat7(n);
				System.out.println();
				System.out.println("pattern 8");
				System.out.println();
				pat8(n);
				System.out.println();
				System.out.println("pattern 9");
				System.out.println();
				pat9(n);
				System.out.println();
				System.out.println("pattern 10");
				System.out.println();
				pat10(n);
				System.out.println();
				System.out.println("pattern 11");
				System.out.println();
				pat11(n);
				System.out.println();
				System.out.println("pattern 12");
				System.out.println();
				pat12(n);
				System.out.println();
				System.out.println("pattern 13");
				System.out.println();
				pat13(n);
				System.out.println();
				System.out.println("pattern 14");
				System.out.println();
				pat14(n);
				System.out.println();
				System.out.println("pattern 15");
				System.out.println();
				pat15(n);
				System.out.println();
				System.out.println("pattern 16");
				System.out.println();
				pat16(n);
				System.out.println();
				System.out.println("pattern 17");
				System.out.println();
				pat17(n);
				System.out.println();
				System.out.println("pattern 18");
				System.out.println();
				pat18(n);
				System.out.println();
				System.out.println("pattern 19");
				System.out.println();
				pat19(n);
				System.out.println();
				System.out.println("pattern 20");
				System.out.println();
				pat20(n);
				System.out.println();
				System.out.println("pattern 21");
				System.out.println();
				pat21(n);
				System.out.println();
				System.out.println("pattern 22");
				System.out.println();
				pat22(n);
				System.out.println();
				System.out.println("pattern 23");
				System.out.println();
				pat23(n);
				System.out.println();
				System.out.println("pattern 24");
				System.out.println();
				pat24(n);
			
			
	}

	static void pat1(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			//
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void pat2(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			//
			for(int j=1;j<=n+1-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	static void pat3(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=n+1-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pat4(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n+1-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pat5(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=n+1-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pat6(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n+1-i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pat7(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void pat8(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=n+1-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void pat9(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	static void pat10(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=n+1-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n+1-i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void pat11(int n)
	{
		int p=0;

		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=n+1-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
				p=j;
			}
			System.out.println();
		}
		

		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=p;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pat12(int n)
	{
		

		for(int i=0;i<n;i++)
		{
			
			
			for(int j=0;j<n;j++)
			{
				if(i+j==n/2||i-j==n/2||i+j==n+n/2-1||j-i==n/2)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void pat13(int n)
	{
		

		for(int i=1;i<=n;i++)
		{
			
			
			for(int j=1;j<=i;j++)
			{
				if(i==j||j==1||i==n)
				System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
	
	static void pat14(int n)
	{
		
     int count=n*n;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				if(count<10)
					System.out.print(0);
			
				System.out.print(count--+" ");
			}
			System.out.println();
		
		}
	}
	
	static void pat15(int n)
	{
		
     int count;
		for(int i=1;i<=n;i++)
		{
			count=n*i;
			for(int j=1;j<=n;j++)
			{
				if(count<10)
					System.out.print(0);
			
				System.out.print(count--+" ");
			}
		
			System.out.println();
		
		}
	}
	
	static void pat16(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				if(i%2==0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
			
			
			}
			System.out.println();
		
		}
	}
	
	static void pat17(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				if(j%2==0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
			
			
			}
			System.out.println();
		
		}
	}
	
	static void pat18(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				if((i+j)%2==1)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
			
			
			}
			System.out.println();
		
		}
	}
	
	static void pat19(int n)
	{
		
     int count=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(count<10)
				{
					System.out.print(0);
				}
				System.out.print(count+++" ");
			}
			System.out.println();
		}
	}
	
	static void pat20(int n)
	{
		
     int count;
		for(int i=1;i<=n;i++)
		{
			count=i*(i+1)/2;
			for(int j=1;j<=i;j++)
			{
				if(count<10)
					System.out.print(0);
			
				System.out.print(count--+" ");
			}
		
			System.out.println();
		
		}
	}
	
	static void pat21(int n)
	{

		int count=0;
		for(int i=1;i<=n;i++)
		{
			

			if(i%2==0)
			{

				count=i*(i+1)/2;
				for(int j=1;j<=i;j++)
				{

					if(count-(j-1)<10)
					{
						System.out.print(0);
					}
					System.out.print(count-(j-1)+" ");
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{

					if(count<10)
					{
						System.out.print(0);
					}
					System.out.print(count+j+" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	
	static void pat22(int n)
	{

		int count=0,k=1;
		for(int i=1;i<=n;i++)
		{


			if(i%2==0)
			{


				for(int j=1;j<=i;j++)
				{

					if(k<10)
					{
						System.out.print(0);
					}
					System.out.print(k+++" ");
				}
			}
			else
			{
				count=i*(i+1)/2;
				for(int j=1;j<=i;j++)
				{

					if(count<10)
					{
						System.out.print(0);
					}
					System.out.print(count--+" ");
					k++;
				}
			}
			System.out.println();
		}

	}

	

	static void pat23(int n)
	{
		
     int count=n*(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			//
			for(int j=1;j<=i;j++)
			{
				if(count<10)
				{
					System.out.print(0);
				}
				System.out.print(count--+" ");
			}
			System.out.println();
		}
	}
	
	static void pat24(int n)
	{
		int c=1;

		for(int i=0;i<=n;i++)
		{
			
			for(int k=0;k<n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==0||i==j) 
				c=1;
				else
					c=c*(i-j+1)/j;
					System.out.print(c+ " ");
			}
			System.out.println();
		}
	}
	
}
