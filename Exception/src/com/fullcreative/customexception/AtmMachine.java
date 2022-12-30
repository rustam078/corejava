package com.fullcreative.customexception;

import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		try {
			enterpin();

		} catch (InvalidPinException e) {
			try {
				enterpin();

			} catch (InvalidPinException e1) {

				try {
					enterpin();

				} catch (InvalidPinException e2) {

					System.out.println("your card is block now u can contact with bank..");

				}
			}

		}

	}

	public static void enterpin()throws InvalidPinException {
	   int pin = 12345;
		int pinnum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pin....");
		pinnum = sc.nextInt();
		if (pinnum == pin) {
			System.out.println("login sucessfull...");
		} else {
			InvalidPinException invalidPin = new InvalidPinException("Oops invalid input try again....");
			System.out.println(invalidPin.getMessage());
			throw invalidPin;
		}
	}

}
