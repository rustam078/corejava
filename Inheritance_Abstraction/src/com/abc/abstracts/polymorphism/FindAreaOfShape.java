package com.abc.abstracts.polymorphism;

import java.util.Scanner;

abstract class Shape {

	public float area;
	float pi = 3.14f;

	abstract void acceptInput();

	abstract void compute();

	public void display() {
		System.out.println("Area = " + this.area);
	}
}

class Square extends Shape {

	private int length;

	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Square..");
		this.length = sc.nextInt();
//    this.compute();
	}

	@Override
	void compute() {
		super.area = this.length * this.length;
	}

}

class Rectangle extends Shape {

	private int length;
	private int breath;

	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breath of Square..");
		this.length = sc.nextInt();
		this.breath = sc.nextInt();
	}

	@Override
	void compute() {
		super.area = this.length * this.breath;
	}

}

class Circle extends Shape {

	private int radius;

	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle..");
		this.radius = sc.nextInt();

	}

	@Override
	void compute() {
		super.area = this.pi * this.radius * this.radius;
	}

}

class Gemoritry {

	public void permit(Shape ref) {
	
		ref.acceptInput();
		ref.compute();
		ref.display();
	}
}

public class FindAreaOfShape {
	public static void main(String[] args) {
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Gemoritry gemoritry = new Gemoritry();
		gemoritry.permit(square);
		gemoritry.permit(rectangle);
		gemoritry.permit(circle);

//		Shape ref=square;
//		ref.acceptInput();
//		ref.compute();
//		ref.display();
//		ref=rectangle;
//		ref.acceptInput();
//		ref.compute();
//		ref.display();
//		ref=circle;
//		ref.acceptInput();
//		ref.compute();
//		ref.display();
	}
}
