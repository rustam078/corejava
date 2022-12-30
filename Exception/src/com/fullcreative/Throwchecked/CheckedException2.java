package com.fullcreative.Throwchecked;

import java.io.IOException;

public class CheckedException2 {
	
	/*
	 * throwing checked exception complusorly we have to handle it
	 */
//	public static void main(String[] args) throws IOException {
//		throw new IOException();
//	}
	
	
	/*
	 * for unchecked no need to handle it
	 */
	
//	static IOException e;  checked reference cant be throw without throws
	
	   static RuntimeException e;
	public static void main(String[] args) {
		throw e;
//		System.out.println("unreachable code.........");
	}

}
