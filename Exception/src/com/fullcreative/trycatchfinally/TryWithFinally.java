package com.fullcreative.trycatchfinally;

public class TryWithFinally {

	public static void main(String[] args) {
		
//		int a=10/0; in this case finally block will not executed
		try {
			int a=10/0;
			System.exit(0);  //here this line not get executed because of exception
		} catch (Exception e) {

		e.printStackTrace();
		}
		finally {
			System.out.println("finally block executed");
		}
	}
}
