package com.fullcreative.stockbuysell;

import java.util.InputMismatchException;
import java.util.Scanner;


class BuySell{
	
	public static int maxProfitOnlyOneTransaction(int []price) {
		
	int maxProfit=0;
	int minValueOnDay =price[0]; //storing minimum price from an array []price
	for(int index=1;index<price.length;index++) {
		
		minValueOnDay=Math.min(minValueOnDay, price[index]);
		int profit=price[index]-minValueOnDay;
		maxProfit=Math.max(maxProfit, profit);
	}
	return maxProfit;
		
		
	}
	
	
	public static int maxProfitWithMultiTransaction(int []price) {
		
		int maxProfit=0;
		for(int index=1;index<price.length;index++) {
			if(price[index]>price[index-1]) {
				maxProfit+=price[index]-price[index-1];
			}
		}
		return maxProfit;
	}
	
	
}


public class ProfitBuySell {
	
	
	public static void main(String[] args) {
		
		
		final int size=7;
		int input[]=new int[size];
		
		System.out.println("enter the price of each day...");
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<7;i++) {
				int price=sc.nextInt();
				if(price>0) {
					input[i]=price;
					
				}else {
					throw new MyOwnException();
				}
			}	
			System.out.println("MaxprofitWithOneTransaction = "+BuySell.maxProfitOnlyOneTransaction(input));
			System.out.println("MaxprofitWithMultiTransaction = "+BuySell.maxProfitWithMultiTransaction(input));
		}catch (InputMismatchException | MyOwnException e) {
		System.out.println("plz give vaild +ve Integer only..............");
		}
		
	
	}

}

class MyOwnException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public MyOwnException() {
		super();
	}

	public MyOwnException(String message) {
		super(message);
	}
	
	
}
