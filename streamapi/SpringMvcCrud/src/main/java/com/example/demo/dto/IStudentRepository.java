package com.example.demo.dto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.StudentDao;

@Repository
public interface IStudentRepository extends CrudRepository<StudentDao, Integer> {

}
