package com.abc.provider;

public class StudentFilter {

	private String name;
	private String zipcode;
	private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "StudentFilter [name=" + name + ", zipcode=" + zipcode + ", salary=" + salary + "]";
	}
	
}
