package com.abc.practice.testcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Entry{
	int year;
	List<String> movie;
	public Entry(int year, List<String> movie) {
		super();
		this.year = year;
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Entry [year=" + year + ", movie=" + movie + "]";
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<String> getMovie() {
		return movie;
	}
	public void setMovie(List<String> movie) {
		this.movie = movie;
	}
	
}
public class TestString {

	public static void main(String[] args) {
		ArrayList<Entry> arrayList = new ArrayList<>();
//		arrayList.add(0,"sun");
     arrayList.add(new Entry(2002, List.of("gaghni","singham","joda")));
     arrayList.add(new Entry(2003, List.of("sun","gold","krish")));
     System.out.println(arrayList);
    Iterator<Entry> itr = arrayList.iterator();
    while (itr.hasNext()) {
		Entry type = (Entry) itr.next();
		if(type.getYear()==2002) {
			System.out.println(type.getMovie());
		}
		for(String s:type.getMovie()) {
			if(s.equals("sun")) {
				System.out.println(type.getYear());
			}
		}
		
	}
	}

}