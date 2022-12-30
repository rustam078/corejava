package com.abc.inhertance;
abstract class Eagle implements Bird {

	@Override
	public void fly() {
		System.out.println("Eagle fly at high alltitude.........");
	}

}

class GoldenEagle extends Eagle {

	@Override
	public void eat() {
		System.out.println("Golden Eagle hunts over ocean and eats.....");
	}

}

class SerpentEagle extends Eagle {

	@Override
	public void eat() {
		System.out.println("Sepent Eagle hunts over mountains and eats.....");

	}

}

class Sky {
	public void polymorphism(Bird ref) {

		ref.fly();
		ref.eat();
		ref.leave();
	}
}

public class TestApp {
	public static void main(String[] args) {
		Bird goldenEagle = new GoldenEagle();
		Bird serpentEagle = new SerpentEagle();
		Sky permit = new Sky();
		permit.polymorphism(goldenEagle);
		permit.polymorphism(serpentEagle);
	}
}