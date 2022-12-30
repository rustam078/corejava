package com.fullcreative.service;

import java.util.List;

import com.fullcreative.Dao.EmployeeDao;
import com.fullcreative.Entity.Employee;

public class StreamApi2 {

	public static void main(String[] args) {
		long start, end;
		List<Employee> employee = EmployeeDao.getEmployee();
		start = System.currentTimeMillis();
		double salarywithstream = employee.stream().map(Employee::getSalary).mapToDouble(i -> i).average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("normal stream execution time="+ (end-start) +" Average salary="+salarywithstream);
		
		start = System.currentTimeMillis();
		double salarywithparallelstream = employee.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("parellel stream execution time="+ (end-start) +" Average salary="+salarywithstream);
		
		long count = employee.stream().filter(emp -> emp.getName().startsWith("R")).count();
		System.out.println(count);
	}
}
