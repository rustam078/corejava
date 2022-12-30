package com.fullcreative.LinkedList;

import com.fullcreative.ArrayList.List;

class Node<T> {
	T item;
	Node<T> next;
	Node<T> prev;

	Node(T element) {
		this.item = element;
		this.next = null;
		this.prev = null;
	}

}

class LinkedList<T> implements List<T> {
	private int size = 0;
	Node<T> first;
	Node<T> last;

	/**
	 * void add(T item);
	 * void add(int index,T item);
	 * void addFirst(T item);
	 * T get(int index) throws ArrayIndexOutOfBoundsException;
	 * T remove(int index);
	 * int search(T item);
	 * int size();
	 * boolean isEmpty();
	 */
	
	
	/**
	 * check for empty linkedlist
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * create new node
	 * 
	 * @param item
	 * @return
	 */
	private Node<T> getNode(T item) {
		Node<T> node = new Node<T>(item);
		size++;
		return node;
	}

	/**
	 * add the element on last
	 * 
	 * @return void
	 */
	@Override
	public void add(T item) {
		if (first == null) {
			linkFirst(item);
		} else {
			Node<T> node = getNode(item);
			last.next = node;
			node.prev = last;
			last = node;
		}
	}

	/**
	 * add the element based on index
	 * 
	 * @param index
	 * @param item
	 */
	public void add(int index, T item) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Exception :: Index: " + index + ", Size: " + this.size);
		} else {

			if (first == null) {
				linkFirst(item);
			} else if (index == 0) {
				addFirst(item);
			} else if (index > 0 && index < size - 1) {
				Node<T> node = getNode(item);
				Node<T> temp = findByIndex(index);
				temp.prev.next = node;
				node.prev = temp.prev;
				temp.prev = node;
				node.next = temp;
				temp = null;
				return;
			} else {
				add(item);

			}

		}

	}

	/**
	 * add element on first index
	 */
	public void addFirst(T item) {
		if (first == null) {
			linkFirst(item);
		} else {
			Node<T> node = getNode(item);
			node.next = first;
			first.prev = node;
			first = node;
		}
	}

	/**
	 * @return element based on index else
	 * @throw IndexOutOfBoundsException
	 */
	@Override
	public T get(int index) {

		if (size > index && index >= 0) {
			Node<T> temp;
			temp = findByIndex(index);
			return temp.item;
		} else {
			throw new IndexOutOfBoundsException("Exception :: Index: " + index + ", Size: " + this.size);
		}
	}

	/**
	 * remove element based on index
	 * 
	 * @return T Object
	 * @throw IndexOutOfBoundsException
	 */
	@Override
	public T remove(int index) {

		if (index >= 0 && index < size) {
			Node<T> temp = findByIndex(index);
			if (temp.prev == null) {
				first = temp.next;
				first.prev = null;
				size--;
			} else {
				temp.prev.next = temp.next;
				temp.next = temp.prev;
				size--;
			}
			return (T) temp.item;

		} else {
			throw new IndexOutOfBoundsException("Exception :: Index: " + index + ", Size: " + this.size);
		}
	}

	/**
	 * perform search operation
	 * 
	 * @param item
	 * @return index else -1
	 */
	@Override
	public int search(T item) {
		Node<T> temp = first;
		if (isEmpty()) {
			return -1;
		} else {
			for (int i = 0; i < size; i++) {
				if (temp.item == item) {
					return i;
				} else {
					temp = temp.next;
				}

			}
			return -1;
		}
	}

	/**
	 * return size of linkedlist
	 */
	@Override
	public int size() {

		return this.size;
	}

	/**
	 * toString Override
	 */
	@Override
	public String toString() {
		if (!isEmpty()) {
			Node<T> temp = first;
			int iMax = size - 1;
			StringBuilder b = new StringBuilder();
			b.append('[');
			for (int i = 0;; i++) {
				b.append(String.valueOf(temp.item));
				temp = temp.next;
				if (i == iMax)
					return b.append(']').toString();
				b.append(", ");
			}
		} else {
			return "[]";
		}
	}

	private Node<T> findByIndex(int index) {
		Node<T> temp = first;
		int count = 0;
		while (count != index) {
			temp = temp.next;
			count++;
		}
		return temp;
	}

	private void linkFirst(T item) {
		Node<T> node = getNode(item);
		last = first = node;
		return;
	}

}