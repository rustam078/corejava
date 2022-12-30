package com.fullcreative.generic;

import java.util.function.Consumer;

class Gener<T extends Number> {

	T obj;

	Gener(T obj) {
		this.obj = obj;
	}

	public void show() {
		System.out.println(obj.getClass().getName());
	}

	public T getGen() {
		return obj;
	}
}
class num<T extends Number&Runnable&Consumer<T>>{
	
}
public class GenericBound {

	public static void main(String[] args) {

	
		Gener<Integer> gen = new Gener<Integer>(10);
		Gener<Float> gen1 = new Gener<Float>(10.0f);
		Gener<Double> gen2 = new Gener<Double>(10.02);
		Gener<Short> gen3 = new Gener<Short>((short) 23);

		gen.show();
		System.out.println(gen.getGen());

		gen1.show();
		System.out.println(gen1.getGen());
		gen2.show();
		System.out.println(gen2.getGen());
		gen3.show();
		System.out.println(gen3.getGen());
	}

}
