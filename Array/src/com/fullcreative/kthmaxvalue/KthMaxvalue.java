package com.fullcreative.kthmaxvalue;

import java.util.Arrays;
import java.util.Scanner;

import com.fullcreative.findminmax.CustomException;

class Kvalue {

	public static int kLargextIndex(int[] input, int k) {
		
		Arrays.sort(input);
		return input[input.length - k]; // for min k-1
	}
}




public class KthMaxvalue {

	public static void main(String[] args) {

		int input[] = null;
		int sizeOfArray = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the size of array...");

			try {
				sizeOfArray = scanner.nextInt();

			} catch (Exception e) {
				throw new CustomException("size cant be string ...");
			}

			if (sizeOfArray > 0) {
				input = new int[sizeOfArray];
				System.out.println("Enter " + sizeOfArray + " value into array...");
				try {
					for (int i = 0; i < input.length; i++) {
						input[i] = scanner.nextInt();

					}
				} catch (Exception e) {
					throw new CustomException("only string allowed ...");
				}

				System.out.println("Enter the k value to find kth largest value from array..");
				int kthLargestNumber = scanner.nextInt();
				System.out.println("The " + kthLargestNumber + "th largest value is ="
						+ Kvalue.kLargextIndex(input, kthLargestNumber));
			} else {
				throw new CustomException("plz enter positive Integer value ...");
			}

		}catch (CustomException e) {
			System.out.println(e.getMessage());
		}

	}

}
