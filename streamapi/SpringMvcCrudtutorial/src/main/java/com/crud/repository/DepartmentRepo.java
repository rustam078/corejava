package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {

}
