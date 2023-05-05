package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.dto.IStudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements IStudentservice {

	@Autowired
	private IStudentRepository iRepository;
	
	@Override
	public void insertstudent(StudentDao dto) {
		
		 iRepository.save(dto);
	}

}
