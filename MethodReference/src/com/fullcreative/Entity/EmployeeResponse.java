package com.fullcreative.Entity;


public class EmployeeResponse {

	private String name;
	private String email;
	private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeResponse [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
	
}
