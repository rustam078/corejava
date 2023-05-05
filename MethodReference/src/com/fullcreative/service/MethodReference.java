package com.fullcreative.service;

import java.util.List;
import java.util.stream.Collectors;

import com.fullcreative.Dao.EmployeeDao;
import com.fullcreative.Entity.Employee;
import com.fullcreative.Entity.EmployeeResponse;
import com.fullcreative.Entity.IContructorRef;
import com.fullcreative.Entity.IMethodRef;

public class MethodReference {

	public static void main(String[] args) {

		List<Employee> employee = EmployeeDao.getEmployee();
		for (Employee emp : employee) {
			System.out.println(emp);
		}
		System.out.println("***************************");

		// 1 static method reference
		employee.forEach(MethodReference::print);

		MethodReference mapper = new MethodReference();

		// 2 giving pre defined functional interface implemention through method ref
		Runnable runnable = mapper::threadTask;
		Thread thread = new Thread(runnable);
		thread.start();

		// 3 custom functional interface implementation using method reference
		IMethodRef ref = mapper::threadTask;
		ref.doTask();

		// 4 calling custom method of convoter

		List<EmployeeResponse> collect = employee.stream().map(mapper::convoter).collect(Collectors.toList());
		System.err.println(collect);

		// 5 By defualt getter method Employee::getSalary are static in lamda exp
		float totalSum = employee.stream().map(Employee::getSalary).reduce((float) 0, (v1, v2) -> v1 + v2);
		System.out.println(totalSum);
		
		
		//-----------Constructor implementation--->
		
		IContructorRef ref2=Employee::new;
		Employee employee2 = ref2.getEmployee();
		employee2.display();
		
		
	}

	// ---------All these method are written in different class------------>

	private static void print(Employee list) {
		System.out.println(list);
	}

	private EmployeeResponse convoter(Employee emp) {
		EmployeeResponse response = new EmployeeResponse();
		response.setName(emp.getName());
		response.setEmail(emp.getEmail());
		response.setSalary(emp.getSalary());
		return response;
	}

	private void threadTask() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i * 2);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
