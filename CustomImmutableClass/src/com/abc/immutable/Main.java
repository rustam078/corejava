package com.abc.immutable;

public class Main {

	public static void main(String[] args) {
		Depertment depertment = new Depertment();
		depertment.setName("tech");
		depertment.setLocation("banglore");
		ImmutableEmployee employee = new ImmutableEmployee(10,"rustam",depertment);
		System.out.println(employee);
//		employee.setName("Ali");
		
		Depertment dept = employee.getDept();
		System.out.println(dept);
		System.err.println(depertment==dept);
		dept.setName("HR"); //even we trying to change its not change
		dept.setLocation("kolkata");
		System.err.println(dept);
		System.out.println(employee);
		
	}
}
