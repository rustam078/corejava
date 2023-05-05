package com.fullcreative.Entity;

public class Employee {

	private String name;
	private String address;
	private Long mobilenumber;
	private String email;
	private float salary;
	
	
	public Employee() {
    System.out.println("I got call through constructor ref");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", mobilenumber=" + mobilenumber + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public String getEmail() {
		return email;
	}

	public float getSalary() {
		return salary;
	}

	public Employee(String name, String address, Long mobilenumber, String email, float salary) {
		super();
		this.name = name;
		this.address = address;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.salary = salary;
	}

	public void display() {
		System.out.println(toString());
		
	}
	
}
