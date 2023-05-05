package com.abc.immutable;


final public class ImmutableEmployee {

	private final Integer id;
	private final String name;
	private final Depertment dept;
	
	public ImmutableEmployee() {
		this.id = null;
		this.name = "";
		this.dept = new Depertment();
	}
	
	public ImmutableEmployee(Integer id, String name,Depertment dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Depertment getDept() {
//		return dept;  don't send actual object reference
//		return new Depertment(dept.getName(),dept.getLocation());
		return new Depertment(this.dept);
	}

	@Override
	public String toString() {
		return "ImmutableEmployee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
	
}
