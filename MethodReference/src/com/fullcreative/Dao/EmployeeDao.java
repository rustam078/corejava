package com.fullcreative.Dao;

import java.util.ArrayList;
import java.util.List;

import com.fullcreative.Entity.Employee;

public class EmployeeDao {

	public static List<Employee> getEmployee() {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Rustam", "Banglore", 8808404433l, "rustam@gmail.com", 1000.0f));
		list.add(new Employee("amir", "Delhi", 9857745678l, "amir@gmail.com", 900.0f));
		list.add(new Employee("atul", "Banglore", 983937323l, "atul@gmail.com", 1500.0f));
		list.add(new Employee("saddam", "Banglore", 7884757693l, "saddam@gmail.com", 800.0f));
		list.add(new Employee("reshabh", "Lukhnow", 39878433l, "reshabh@gmail.com", 550.0f));
		list.add(new Employee("Roy", "Telangana", 897584738l, "roy@gmail.com", 700.0f));
		list.add(new Employee("akhil", "Chennai", 5927483648l, "akhil@gmail.com", 200.0f));
		list.add(new Employee("raj", "Patna", 89374848l, "raj@gmail.com", 100.0f));
		list.add(new Employee("deepak", "Nanital", null, "deepak@gmail.com", 300.0f));
		list.add(new Employee("niketan", "Banglore", 897457454l, null, 600.0f));
		list.add(new Employee("anmol", null, 897457454l, null, 400.0f));
		return list;
	}
	
	
//	public static List<Employee> getEmployee() {
//		return IntStream
//				.rangeClosed(1, 10)
//				.mapToObj(i->new Employee("employee"+i, "city"+i, new Random().nextLong(7777777777l, 9999999999l), "employee"+i+"@gmail.com",new Random().nextFloat(5000)))
//				.collect(Collectors.toList());
//	}
	static float avg=0;
	public static void average(Employee list) {
		float salary = list.getSalary();
		avg+=salary;
		System.out.println(avg);
	}

}
