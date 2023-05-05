package com.abc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.abc.dao.StudentDao;
import com.abc.provider.StudentFilter;

import stremapi.prac.First;

public class StudentService {
	
	
	public static void main(String[] args) {
		List<First> studentGetDao = StudentDao.studentGetDao();
		System.out.println(studentGetDao);
		
		System.out.println("...................................................");
		 ArrayList<StudentFilter> arrayList = new ArrayList<>();
		 
studentGetDao.stream().forEach(i->{
	StudentFilter studentFilter = new StudentFilter();
	studentFilter.setName(i.getName());
	studentFilter.setZipcode(i.getZipcode());
	studentFilter.setSalary(i.getSalary());
	arrayList.add(studentFilter);
	
	
});
System.out.println(arrayList);
		
		System.out.println("...................................................");
		for (Iterator<First> iterator = studentGetDao.iterator(); iterator.hasNext();) {
			First first = (First) iterator.next();
			System.out.println(first.getName()+" "+first.getAddr()+" "+first.getSalary());
		}
		System.out.println("...................................................");
		
		studentGetDao.stream().forEach(t->System.out.println(t));
		
		System.out.println("...................................................");
		
		studentGetDao.stream().filter(i->i.getName().startsWith("r")).forEach(System.out::println);
		System.out.println("...................................................");

		studentGetDao.stream().sorted(Comparator.comparing(First::getSalary)).forEach(System.out::println);
		
		System.out.println("...................................................");
		
		Collections.sort(studentGetDao, (o1,o2)->o2.getName().compareTo(o1.getName()));
		System.out.println(studentGetDao);
		
		List<First> collect = studentGetDao.stream().filter(i->i.getSalary()>1500).collect(Collectors.toList());
	System.out.println(collect);
	
	collect.stream().map(i->i.getSalary()*2).forEach(System.out::println);
	First first = collect.stream().max(Comparator.comparing(First::getSalary)).get();
	System.out.println("...........................................");
	System.out.println(first);
	
	}

}
