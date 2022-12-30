package com.fullcreative.Throwchecked;

class TestApp{
	
	public static void doWork() throws InterruptedException {  //due to propagation of checked exception 
															  // we have to handle in all caller method
		System.out.println("TestApp.doWork()");
		domorework();
	}
	
	public static void domorework() throws InterruptedException {
		System.out.println("TestApp.domorework()");
		Thread.sleep(100);
	}
}
public class RealUsageOfThrows {
	
	
	public static void main(String[] args) throws InterruptedException {
		TestApp.doWork();
		System.out.println("RealUsageOfThrows.main()");
		System.err.println("heloo world..");
	}

}
