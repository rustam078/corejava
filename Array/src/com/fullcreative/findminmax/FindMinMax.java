package com.fullcreative.findminmax;

import java.util.InputMismatchException;
import java.util.Scanner;

class MinMax {

	public static int[] findMinMax(int[] array) {

		int min_max[] = new int[2];
		min_max[0] = min_max[1] = array[0];    //index 0 will store min val and index 1 will store max val
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min_max[0])
				min_max[0] = array[i];
			else if (array[i] > min_max[1])
				min_max[1] = array[i];

		}
		return min_max;
	}

}




public class  FindMinMax {

	public static void main(String[] args) {
		int input[] = null;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the size of array...");
			int size = scanner.nextInt();
			if (size > 0) {
				input = new int[size];
				System.out.println("Enter " + size + " value into array...");
				for (int i = 0; i < input.length; i++) {
					input[i] = scanner.nextInt();

				}
			} else {
				throw new CustomException("plz enter positive Integer value ...");
			}
			int result[] = MinMax.findMinMax(input);
			System.out.println("min value in array = " + result[0]);
			System.out.println("max value in array = " + result[1]);
		} catch (InputMismatchException e) {

			System.out.println("Invalid input .....");

		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}

	}
}


