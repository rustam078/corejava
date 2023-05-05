package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Department;
import com.crud.repository.DepartmentRepo;

@Service
public class DepartmentserviceImpl implements IDepartment {

	
	@Autowired
	private DepartmentRepo deprepo;
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return deprepo.save(department);
	}
	
	@Override
	public Optional<Department> getDepartment(Long id) {
		// TODO Auto-generated method stub
		return deprepo.findById(id);
	}

	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return deprepo.findAll();
	}

	public void deleteid(Long id) {
		// TODO Auto-generated method stub
		 deprepo.deleteById(id);;
	}

}
