package com.fullcreative.interfacepractice;

interface Test {

	int a = 20;

	static void staticMethod() {
		System.out.println("Test.staticMethod()");
	}

	static void staticMethod(int a) {
		System.out.println("Test.staticMethod(overloading)");
	}

	default void defaultMethod() {
		System.out.println("Test.defaultMethod()");
	}
}

interface Child extends Test {

	static void staticMethod() {
		System.out.println("Child.staticMethod()");
	}

	static void staticMethod(int a) {
		System.out.println("Child.staticMethod(overloading)");
	}

	@Override
	default void defaultMethod() {
		System.out.println("Child.defaultMethod()");
	}

	default void defaultMethod(int w) {
		System.out.println("Child.defaultMethod(overloading)");
	}
}

class InterfaceProgram implements Test {
	int a;
	int b;

	@Override
	public void defaultMethod() {
		System.out.println("test");
		System.out.println(this.a);
	}

	public static void main(String[] args) {

		InterfaceProgram ip = new InterfaceProgram();
		ip.defaultMethod();
		Test.staticMethod();

	}
}