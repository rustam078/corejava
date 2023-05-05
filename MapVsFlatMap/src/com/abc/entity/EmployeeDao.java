package com.abc.entity;

import java.util.List;

public class EmployeeDao {

	public static List<Employee> getData(){
		Employee employee1 = new Employee(1,"Rustam",List.of("Delhi","Banglore","Chennai"));
		Employee employee2 = new Employee(2,"Saddam",List.of("Pune","Banglore","Kolkata"));
		Employee employee3 = new Employee(3,"Atul",List.of("Delhi","Banglore","Noyda"));
		return List.of(employee1,employee2,employee3);
	}
}
