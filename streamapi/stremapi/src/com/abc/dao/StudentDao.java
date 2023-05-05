package com.abc.dao;

import java.util.ArrayList;
import java.util.List;

import stremapi.prac.First;

public class StudentDao {

	public static List<First> studentGetDao() {
		
		List<First> al = new ArrayList<>();
		al.add(new First("rustam","banglore","az08kg",1200.4f));
		al.add(new First("atul","banglore","az08kg",1400.4f));
		al.add(new First("punit","banglore","az08kg",1600.4f));
		al.add(new First("saddam","banglore","az08kg",6200.4f));
		al.add(new First("rashid","banglore","az08kg",8200.4f));
		al.add(new First("patkal","banglore","az08kg",1500.4f));
		return al;
	}
}
