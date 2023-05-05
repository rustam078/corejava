package stremapi.prac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ksdj {

	public static void main(String[] args) {
		List<First> al = new ArrayList<>();
		al.add(new First("rustam","banglore","az08kg",1200.4f));
		al.add(new First("atul","banglore","az08kg",1400.4f));
		al.add(new First("punit","banglore","az08kg",1200.4f));
		al.add(new First("saddam","banglore","az08kg",1200.4f));
		al.add(new First("rashid","banglore","az08kg",1200.4f));
		al.add(new First("patkal","banglore","az08kg",1200.4f));
	        
		
		List<ABC> ll=new ArrayList<>();
	
		al.stream().forEach(details -> {
			ABC abc= new ABC();
			abc.setName(details.getName());
			abc.setAdd(details.getAddr());
//			System.out.println(abc);
			ll.add(abc);
			
		});
		
		al.stream().forEach(details->{
//			System.out.println("Name is :: " +details.getName() + " Add is :: "+details.getAddr());
			
		});
		
		ll.stream().forEach(System.out::println);
		System.out.println(ll);
	}
}
