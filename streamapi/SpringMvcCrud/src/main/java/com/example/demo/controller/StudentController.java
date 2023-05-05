package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.StudentDao;
import com.example.demo.service.StudentServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class StudentController {
	
	@Autowired
	private StudentServiceImpl serviceImpl;
	
	
	@GetMapping("api/student")
	public void add() {
		
		StudentDao dao=new StudentDao();
		dao.setName("rustam");
		dao.setSalary(4200.04f);
		dao.setAddr("banglore");
		
		serviceImpl.insertstudent(dao);
		
		
	}
	@GetMapping("/api")
	@ResponseBody
	public String handle() {
		return "this is a body isn fdkf";
	}
	

}
