package com.fullcreative.propagation;
/*
 * this code is showing the error and propagation 
 * and it cant be recover even if we use try catch also
 * error type:- java.lang.OutOfMemoryError.
 */
class Propagtion{
	
	public void controller() {
		System.out.println("Propagtion.controller() enter");
		service();
		System.out.println("Propagtion.controller() exit");
	}
	
	public void service() {
		System.out.println("Propagtion.service()enter");
		repository();
		System.out.println("Propagtion.service() exit");
	}
	public void repository() {
		System.out.println("Propagtion.repository() enter");
		
		int a[]=new int[Integer.MAX_VALUE];
//		int a=10/0;  //java.lang.ArithmeticException: / by zero  for normal flow here only handle it
//		controller(); //java.lang.StackOverflowError
		System.out.println("Propagtion.repository()exit");
	}
}
public class Test {

	public static void main(String[] args) {
		Propagtion propagtion = new Propagtion();
		propagtion.controller();
		
		
		
//		try {
//		
//		} catch (Exception e) { // try to give Throwable
//      System.out.println("trying to handle a error............");			
//		}
	}
}
