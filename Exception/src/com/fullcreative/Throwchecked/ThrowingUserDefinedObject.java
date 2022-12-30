package com.fullcreative.Throwchecked;

class UserDefined extends RuntimeException{
	
	 {
		System.out.println("UserDefined.enclosing_method()");
	}
	
}

class Child extends UserDefined{
	static {
	 System.out.println("Child.enclosing_method()");	
	}
}

public class ThrowingUserDefinedObject {
	
	
	public static void main(String[] args) {
		throw new Child();
	}

}
