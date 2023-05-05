package com.crud.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Department;
import com.crud.service.DepartmentserviceImpl;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentserviceImpl service;
	
	@GetMapping("/disp")
	public String disp() {
		return "hello world";
	}
	
	@PostMapping("/dept")
	public Department saveDepartment(@RequestBody Department department) {
		
		
		return service.saveDepartment(department);
		
	}
	
	@GetMapping("/dept/{id}")
	public Department getDepartment(@PathVariable Long id) {
		
		return service.getDepartment(id).get();
	}
	
	
	@GetMapping("/dept")
	public List<Department> getAllDepartment() {
		
		return service.getAllDepartment();
	}
	
	@DeleteMapping("/del/{id}")
	public void deleteDepartment(@PathVariable Long id) {
		 service.deleteid(id);
	}
}
