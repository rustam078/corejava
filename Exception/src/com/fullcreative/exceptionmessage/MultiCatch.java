package com.fullcreative.exceptionmessage;

import java.io.IOException;
import java.io.PrintWriter;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			int a=10/0;
//			System.out.println(a);
			PrintWriter pw=new PrintWriter("abc.txt");
			
		}
//		catch (RuntimeException e) {
//			// TODO: handle exception  run time is parent of all uncheked exception
//		}
		catch (IOException e) {
			// TODO: handle exception
		}
		catch (IllegalStateException e) {
			// TODO: handle exception
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		catch (ClassCastException e) {
			// TODO: handle exception
		}
		catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
//		catch (NumberFormatException e) {
//			// TODO: handle exception
//		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("handle by exception");
		}
	}
}
