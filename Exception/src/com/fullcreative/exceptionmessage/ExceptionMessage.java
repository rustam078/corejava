package com.fullcreative.exceptionmessage;

public class ExceptionMessage {
	public static void main(String[] args) {
		try {
			
			int a=10/0;
			System.out.println(a);
		} catch (ArithmeticException| NullPointerException |ClassCastException |ArrayIndexOutOfBoundsException e) { //this all exception are sibling so no problem
																								//but if give child and parent exception through pipe
			                                                                                    // then it will show compile time error as shown below
			e.printStackTrace();
			System.out.println("**************************");
			System.out.println(e); //e is a reference indirectly its call toString() only.
			System.out.println("**************************");
			System.out.println(e.toString());
			System.out.println("**************************");
			System.out.println(e.getMessage());
		}
//	catch (Exception |RuntimeException e) {
//		/*
//		 * already caught by parent exception
//		 */
//
//		}
	}

}
