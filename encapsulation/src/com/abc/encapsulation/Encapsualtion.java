package com.abc.encapsulation;
 

class EncapsualtionExample {
	
	private String username;
	private String password;
	public EncapsualtionExample() {
	
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}

public class Encapsualtion {
	
	public static void main(String[] args) {
     
		EncapsualtionExample e=new EncapsualtionExample();
		e.setUsername("rustam");
		e.setPassword("qwerty");
		
		System.out.println("name="+e.getUsername());
		System.out.println("pass="+e.getPassword());
		
		
	}
}
