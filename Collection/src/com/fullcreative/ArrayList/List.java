package com.fullcreative.ArrayList;

public interface List<T> {

	void add(T item);

	T get(int index) throws ArrayIndexOutOfBoundsException;

	T remove(int index) throws ArrayIndexOutOfBoundsException;

	int search(T item);

	int size();

	boolean isEmpty();

}
