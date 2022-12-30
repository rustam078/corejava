package com.fullcreative.map;

import java.util.HashMap;
import java.util.Hashtable;

public class CollectionPractice {
	public static void main(String[] args) {

		Hashtable hm = new Hashtable();
		hm.put(10, "ali");
		hm.put(11, "arman");
		hm.put(101, "arman");
		hm.put(12, "samrer");
		hm.put("ali", "ali");
		hm.put("car", "Toyta");

//		hm.put(null, "ali");
//		hm.put(null, "ahmed");
//		hm.put(null, null);

		System.out.println(hm.get(null));
		
		System.out.println(hm);
	}
}
