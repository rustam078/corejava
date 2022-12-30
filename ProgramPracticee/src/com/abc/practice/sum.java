package com.abc.practice;



class sum1 {

	private String name ;
   private String pass ;
	
	

public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getPass() {
return pass;
}
public void setPass(String pass) {
this.pass = pass;
}

	
}

class inhert extends  sum1{
	
	
	public void display() {
		sum1 sum1 = new sum1();
		sum1.setName("ram");
		System.out.println(sum1.getName());
	}
}



public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum1 sum1 = new sum1();
		sum1 sum2 = new sum1();
		sum1.setName("rustam");
	     inhert inhert = new inhert();
	     inhert.display();
		
		System.out.println(sum1.getName());
		System.out.println(sum2.getName());
	
	}
}
