package com.fullcreative.staticprogram;

class Parent {

	static {
		System.out.println("Parent.enclosing_method(static block)");
	}

	{
		System.out.println("Parent.enclosing_method(non static block)");
	}
}

class child extends Parent {

	{
		System.out.println("child.enclosing_method(non static)");
	}

	static {
		System.out.println("child.enclosing_method(static)");
	}
}

public class StaticProgram {

	public static void main(String[] args) {

		System.out.println("GFG.main()");
		// child child = new child();
	}

	static {
		System.out.println("GFG.enclosing_method()");
	}
}
