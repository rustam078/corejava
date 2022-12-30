package com.abc.inhertance;

public interface Bird {
 void fly();
 void eat();
 
 default void leave() {
		System.out.println("all bird leave on nest......");
	}
}




