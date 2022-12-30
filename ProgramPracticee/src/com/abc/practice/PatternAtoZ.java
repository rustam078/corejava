package com.abc.practice;

import java.util.Scanner;

public class PatternAtoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a odd number");
		int n=sc.nextInt();
		while(true) {
			System.out.println("enter a character which you have to ptint");
			char ch1=sc.next().charAt(0);
			char ch=Character.toUpperCase(ch1);
			printPattern(ch, n);
		}


	}


	static void printPattern(char character,int n)
	{

		switch (character)
		{
		case 'A':
			printA(n);
			break;

		case 'B':
			printB(n);
			break; 

		case 'C':
			printC(n);
			break;

		case 'D':
			printD(n);
			break;
		case 'E':
			printE(n);
			break;	

		case 'F':
			printF(n);
			break;
		case 'G':
			printG(n);
			break;
		case 'H':
			printH(n);
			break;
		case 'I':
			printI(n);
			break;
		case 'J':
			printJ(n);
			break;
		case 'K':
			printK(n);
			break;
		case 'L':
			printL(n);
			break;
		case 'M':
			printM(n);
			break;
		case 'N':
			printN(n);
			break;
		case 'O':
			printO(n);
			break;
		case 'P':
			printP(n);
			break;
		case 'Q':
			printQ(n);
			break;
		case 'R':
			printR(n);
			break;
		case 'S':
			printS(n);
			break;
		case 'T':
			printT(n);
			break;
		case 'U':
			printU(n);
			break;
		case 'V':
			printV(n);
			break;
		case 'W':
			printW(n);
			break;
		case 'X':
			printX(n);
			break;
		case 'Y':
			printY(n);
			break;
		case 'Z':
			printZ(n);
			break;
		}
	}

	static void printA(int n)
	{
		for(int i=0;i<n;i++)

		{
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
			System.out.println();
		}
	}




	static void printB(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0&&j!=n-1||i==n/2&&j!=n-1||i==n-1&&j!=n-1||j==n-1&&i!=0&&i!=n/2&&i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void printC(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j!=0||i==n-1&&j!=0||j==0&&i!=0&&i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}




	static void printD(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j!=n-1||i==n-1&&j!=n-1||j==0||j==n-1&&i!=0&&i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}


	static void printE(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n/2||i==n-1||j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}


	static void printF(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n/2||j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}


	static void printG(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j!=0||i==n/2&&j>n/2||i==n-1&&j!=0||j==0&&i!=0&&i!=n-1||j==n-1&&i>=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}



	static void printH(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==n/2||j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}


	static void printI(int n)
	{
		for(int i=0;i<n;i++)

		{
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
			System.out.println();

		}
	}


	static void printJ(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==n/2&&i!=n-1||i==n-1&&j!=0&&j<n/2||j==0&&i>n/2&&i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}


	static void printK(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i+j==n/2||i-j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}


	static void printL(int n)
	{
		for(int i=0;i<n;i++)

		{
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
			System.out.println();

		}
	}




	static void printM(int n)
	{
		for(int i=0;i<n;i++)

		{
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
			System.out.println();

		}
	}



	static void printN(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}



	static void printO(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(j==0&&i!=0&&i!=n-1||j==n-1&&i!=0&&i!=n-1||i==0&&j!=0&&j!=n-1||i==n-1&&j!=0&&j!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}


	static void printP(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||j==n-1&&i!=0&&i<n/2||i==n/2&&j!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

	static void printQ(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(j==0&&i!=0&&i<n-2||j==n-1&&i!=0&&i<n-2||i==0&&j!=0&&j!=n-1||i==n-2&&j!=0&&j!=n-1||i==j&&i>=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

	static void printR(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0&&j!=n-1||j==n-1&&i!=0&&i<n/2||i==n/2&&j!=n-1||i-j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}



	static void printS(int n)
	{
		for(int i=0;i<n;i++)

		{
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
			System.out.println();

		}
	}


	static void printT(int n)
	{
		for(int i=0;i<n;i++)

		{
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
			System.out.println();

		}
	}


	static void printU(int n)
	{
		for(int i=0;i<n;i++)

		{
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
			System.out.println();

		}
	}

	static void printV(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}



	static void printW(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i+j==n-1&&i>=n/2||i==j&&i>=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

	static void printX(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(i==j||i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

	static void printY(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(i==j&&i<=n/2||i+j==n-1&&j>=n/2||j==n/2&&i>=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

	static void printZ(int n)
	{
		for(int i=0;i<n;i++)

		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}
}
