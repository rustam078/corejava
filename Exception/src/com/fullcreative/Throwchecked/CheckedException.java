package com.fullcreative.Throwchecked;

import java.io.IOException;

public class CheckedException {
	
	/*
	 * throwing checked exception complusorly we have to handle it
	 */
//	public static void main(String[] args) throws IOException {
//		throw new IOException();
//	}
	
	
	/*
	 * for unchecked no need to handle it
	 */
	public static void main(String[] args) {
		throw new RuntimeException();
	}

}
