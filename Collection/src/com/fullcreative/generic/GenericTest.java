package com.fullcreative.generic;

class Gen<T> {

	T obj;

	Gen(T obj) {
		this.obj = obj;
	}

	public void show() {
		System.out.println(obj.getClass().getName());
	}

	public T getGen() {
		return obj;
	}
}

public class GenericTest {

	public static void main(String[] args) {

		Gen<String> s = new Gen<String>("rustam");
		s.show();
		System.out.println(s.getGen());
		Gen<Integer> gen = new Gen<Integer>(10);

		gen.show();
		System.out.println(gen.getGen());

	}

}
