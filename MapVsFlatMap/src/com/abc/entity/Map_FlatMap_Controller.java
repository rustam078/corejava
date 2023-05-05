package com.abc.entity;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Map_FlatMap_Controller {

	public static void main(String[] args) {
		List<Employee> data = EmployeeDao.getData();
		System.out.println(data);

		// uses of map
		List<Integer> id = data.stream().map(Employee::getId).collect(Collectors.toList());
		System.out.println(id);

		// uses of flatMap
		Set<List<String>> city = data.stream().map(Employee::getCity).collect(Collectors.toSet());
		System.out.println(city); // stream of stream we have to flat it.

		// with flatMap
		Set<String> cities = data.stream().flatMap(e -> e.getCity().stream()).collect(Collectors.toSet());
		System.out.println(cities);
	}
}
