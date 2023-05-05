package com.abc.immutable;

public class Depertment {

	private String name;
	private String location;
	

	public Depertment() {
		}
	
	public Depertment(String name,String location) {
		this.name=name;
		this.location=location;
	}
	
	//using copy constructor 
	public Depertment(Depertment depertment) {
            this(depertment.getName(),depertment.getLocation());
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Depertment [name=" + name + ", location=" + location + "]";
	}


	
	
}
