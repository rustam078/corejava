package com.crud.service;

import java.util.List;
import java.util.Optional;

import com.crud.entity.Department;

public interface IDepartment {

	public Department saveDepartment(Department department);
	public Optional<Department> getDepartment(Long id);
	public List<Department> getAllDepartment();
	public void deleteid(Long id);
}
