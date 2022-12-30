package com.fullcreative.ArrayList;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {

	private int size = 1;
	private Object array[] = new Object[size];
	private int length = 0;

	@Override
	public void add(T item) {
		if (length == size) {
			increaseArray();
		}
		this.array[this.length++] = item;
	}

	/**
	 * get method return the T object for a given index else
	 * 
	 * @throws ArrayIndexOutOfBoundsException
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index > length - 1 || index < 0) {
			throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + length);
		}
		return (T) this.array[index];
	}

	/**
	 * it will return the size of list
	 * 
	 */

	@Override
	public int size() {
		return this.length;
	}

	private void increaseArray() {
		this.array = Arrays.copyOf(this.array, size * 2);
		this.size *= 2;
	}

	/**
	 * search through item
	 * 
	 * @input T object item
	 * @output return index else -1
	 */
	@Override
	public int search(T item) {

		for (int i = 0; i < length; i++) {
			if (array[i].equals(item))
				return i;

		}
		return -1;
	}

	/**
	 * this method perform remove operation through index return T object.
	 */

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		T data = null;
		if (length > index) {
			data = (T) this.array[index];
			shiftElement(index);

		} else {
			throw new ArrayIndexOutOfBoundsException("index out of bond .........");
		}
		return data;
	}

	/**
	 * this method is used to perform shiftElement on remove operation
	 */

	private void shiftElement(int index) {
		for (int i = index; i < length - 1; i++) {

			this.array[i] = this.array[i + 1];
		}
		this.array[length-- - 1] = null;
		if (length == size / 2 + 2)
			decreaseArray();

	}

	/**
	 * this method is used to perform Decrease size of Array
	 */
	private void decreaseArray() {

		this.array = Arrays.copyOf(this.array, size / 2);
		this.size /= 2;

	}

	/**
	 * used to print list
	 */
	@Override
	public String toString() {
		if (array == null)
			return "null";

		int iMax = length - 1;
		if (iMax == -1)
			return "[]";

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			b.append(String.valueOf(array[i]));
			if (i == iMax)
				return b.append(']').toString();
			b.append(", ");
		}
	}

	@Override
	public boolean isEmpty() {
		return this.length==0;
	}

}
