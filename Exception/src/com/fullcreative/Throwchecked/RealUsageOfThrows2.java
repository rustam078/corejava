package com.fullcreative.Throwchecked;

class TestApp2{
	
	public static void doWork() {  
		System.out.println("TestApp.doWork()");
		domorework();
	}
	
	public static void domorework()  {
		System.out.println("TestApp.domorework()");
		
	}
}
public class RealUsageOfThrows2 {
	
	
	public static void main(String[] args)  throws InterruptedException  {
		TestApp2.doWork();
		Thread.sleep(100);
		System.out.println("RealUsageOfThrows.main()");
		System.err.println("heloo world..");
	}

}
