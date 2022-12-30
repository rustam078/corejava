package com.fullcreative.service;

public class StreamApi {

	public static void main(String[] args) {

//		List<Employee> employee = EmployeeDao.getEmployee();
//		  for(Employee emp: employee) {
//			  System.out.println(emp);
//		  }
//		  
//		employee.stream().filter(emp -> emp.getName().startsWith("R")).forEach(System.out::println);
//		employee.stream().filter(emp -> emp.getEmail() == null).forEach(System.out::println);
//		// avg of salary
//		float avg = employee.stream().map(sal -> sal.getSalary()).reduce((float) 0, (v1, v2) -> v1 + v2);
//		float avg1 = employee.stream().map(Employee::getSalary).reduce((float) 0, (v1, v2) -> v1 + v2);
//		System.out.println(avg);
//		System.out.println(avg1);
//		System.out.printf("Sum of Employees' salaries (via reduce method): %.2f%n",
//				employee.stream().mapToDouble(Employee::getSalary).reduce(0, (value1, value2) -> value1 + value2));

//		employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);	
//		Collections.sort(employee,(o1,o2)->o1.getName().compareTo(o2.getName()));
//		System.out.println(employee);

		/***********************************************************************************************/
//		Set<Employee> employee = EmployeeDao.getEmployee();
//	
//		System.out.println(employee.stream().map(Employee::getSalary).reduce((float) 0,(v1,v2)->v1+v2));
//		List<java.lang.Float> collect = employee.stream().map(sal->sal.getSalary() ).collect(Collectors.toList());
//		Collections.sort(collect);
//		System.out.println(collect);
//		List<String> clSet = employee.stream().map(Employee::getName).collect(Collectors.toList());
//		Collections.sort(clSet);
//		System.out.println(clSet);
//		employee.stream().forEach(i->{
////		if(i.getSalary()>=30000&&i.getSalary()<100000) {
////			i.setSalary(i.getSalary()+50000);
////			System.out.println(i);
////		}
//		});
//		int count = 0;
//		for (Employee emp : employee) {
//			count++;
//			System.out.println(emp);
//		}
//
//		System.out.println(count);
//		List<Employee> arrayList = new ArrayList<>(employee);
//		Collections.sort(arrayList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//		System.out.println("****************");
//		System.out.println(arrayList);
//		System.out.println("/********************************/");
//		employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
//
//		Set<String> name = new TreeSet<>();
//		employee.stream().forEach(i -> {
//			name.add(i.getName());
//		});
//		int c = 0;
//		for (String emp : name) {
//			c++;
//			System.out.println(emp);
//		}
//		System.out.println(c);
//
//		System.out.printf("Sum of Employees' salaries (via reduce method): %.2f%n",
//				employee.stream().mapToDouble(Employee::getSalary).reduce(0, (value1, value2) -> value1 + value2));

	}
}
