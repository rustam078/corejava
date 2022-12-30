package com.fullcreative.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Stack {
public static void main(String a[])
{
Stackfun std=new Stackfun();
Scanner sc =new Scanner(System.in);
System.out.println("Enter 1 to push");
System.out.println("Enter 2 to pop");
System.out.println("Enter 3 to peek");
System.out.println("Enter 4 to search");
System.out.println("Enter 5 to print");
System.out.println("Enter 6 to exit");

List<Object> linkedList = new LinkedList<>();
linkedList.add(0,200);
((LinkedList<Object>) linkedList).addFirst(100);

System.out.println(linkedList.toString());
//System.out.println(linkedList.get(5));
try
{
while(true)
{
System.out.println("Enter the choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:std.push();
break;
case 2:std.pop();
break;
case 3:std.peek();
break;
case 4:std.search();
break;
case 5:std.print();
break;
case 6: System.exit(0);
default :System.out.println("invalid choice");
}

}
}
catch(Exception e)
{
}
}
}


class Stackfun {
	int top;
	final int max = 5;
	int stack[] = new int[max];
	Scanner sc = new Scanner(System.in);

	Stackfun() {
		top = -1;
	}

	void push() {
		if (top == max) {
			System.out.println("stack over flow");
			return;
		} else {
			System.out.println("enter element");
			top = top + 1;
			try {
				stack[top] = sc.nextInt();
			} catch (Exception e) {
			}
		}
	}

void pop()
{
if(top==-1)
{
System.out.println("stack empty");
}
else
{
int item=stack[top];
System.out.println("poped item= "+item);

top=top-1;
}
}

	void peek() {
		if (top == -1) {
			System.out.println("stack empty");
		} else {
			int item = stack[top];
			System.out.println("peek item= " + item);
		}
	}

	void search() {
		int i = 0, count = 0;
		System.out.println("enter a number");
		int n = sc.nextInt();
		for (i = top; i >= 0; i--) {
			if (stack[i] == n) {
				System.out.println(n + " is at index " + i);
				count++;
			}
		}
		if (count == 0)
			System.out.println(n + " not found");
	}

	void print() {
		if (top == -1) {
			System.out.println("EMPTY");
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
}
