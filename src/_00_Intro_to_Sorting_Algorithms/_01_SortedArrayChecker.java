package _00_Intro_to_Sorting_Algorithms;

import java.util.Iterator;

public class _01_SortedArrayChecker {
	/*
	 * Write a static method called intArraySorted.
	 *
	 * This method takes in an array of integers and it returns a boolean. The
	 * method returns true if the integer array is in ascending order and false
	 * otherwise.
	 */
	public static boolean intArraySorted(int[] arr) {
		boolean real = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j + 1] < arr.length-1) {
					if (arr[j] > arr[j + 1]) {
						real = false;

					}
				}
			}
		}

		return real;

	}
	public static boolean doubleArraySorted(double[] arr2) {
		boolean order = true;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length-1; j++) {
				if (arr2[j]>arr2[j+1]) {
					order=false;
				}
				
			}
		}
		return order;
	}
	public static boolean charArraySorted(char[]arr3) {
		
		
		boolean charo = true;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length-1; j++) {
				if (arr3[j]>arr3[j+1]) {
					charo=false;
				}
				
			}
		}
		return charo;
	}
	
	public static boolean stringArraySorted(String[]arr4) {
		boolean stringo = true;
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4.length-1; j++) {
				if (arr4[j].compareTo(arr4[j+1])>=1) {
					stringo=false;
				}
				
			}
		}
		return stringo;
		
		
		
	}
	/*
	 * 2. Write a static method called doubleArraySorted.
	 *
	 * This method takes in an array of doubles and it returns a boolean. The method
	 * returns true if the double array is in ascending order and false otherwise.
	 */

	/*
	 * 3. Write a static method called charArraySorted.
	 * 
	 * This method takes in an array of characters and it returns a boolean. The
	 * method returns true if the character array is in alphabetical order and false
	 * otherwise (You can compare characters just like integers).
	 */

	/*
	 * 4. Write a static method called stringArraySorted.
	 *
	 * This method takes in an array of Strings and it returns a boolean. The method
	 * returns true if the String array is in alphabetical order and false otherwise
	 * (Use the compareTo(String) method).
	 */

}
