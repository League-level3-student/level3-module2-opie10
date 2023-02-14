package _03_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		String mult = num1+" x "+num2+" = "+(num1*num2);
		return mult;
	}
	public static Boolean isPrime(int num) {
		boolean prime = true;
		 if(num<=1)
	        {
	            prime =false;
	        }
	       for(int i=2;i<=num/2;i++)
	       {
	           if((num%i)==0)
	               return  prime =false;
	       }
	       
		return prime;
	}
	public static boolean isSquare(int num) {
		boolean square = false;
		if(Math.sqrt(num)==(int)Math.sqrt(num)) {
			square=true;
		}
		return square;
	}
	
	public static boolean isCube(int num) {
		boolean cube = false;
		if(Math.cbrt(num)==(int)Math.cbrt(num)) {
		
			cube=true;
		}
		return cube;
	}
	public static int countPearls(List<Boolean> pearls) {
		int pearlnum = 0;
		for (int i = 0; i < pearls.size(); i++) {
			if (pearls.get(i) == true) {
				pearlnum = pearlnum + 1;
			}
		}
		return pearlnum;
	}

	public static double findTallest(List<Double> heights) {
		double tallest = 0.0;
		for (int i = 0; i < heights.size(); i++) {
			if (heights.get(i) > tallest) {
				tallest = heights.get(i);
			}
		}
		return tallest;
	}

	public static int findBrokenEgg(List<String> eggs) {
		int index = -1;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) != "whole") {
				index = i;
				break;
			}

		}
		return index;
	}

	public static String findLongestWord(List<String> length) {
		String longest = "";
		for (int i = 0; i < length.size(); i++) {
			if (length.get(i).length() > longest.length()) {
				longest = length.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> soscheck) {
		boolean issos = false;
		for (int i = 0; i < soscheck.size(); i++) {

			if (soscheck.get(i).contains("... --- ...")) {
				issos = true;
				break;
			}
		}
		return issos;
	}

	public static List<Double> sortScores(List<Double> scores) {
		List<Double> scorelist = new ArrayList<Double>(scores);
		for (int i = 0; i < scorelist.size(); i++) {
			for (int j = 0; j < scorelist.size(); j++) {
				if (j - 1 > -1) {
					if (scorelist.get(j) < scorelist.get(j - 1)) {
						double temp = scorelist.get(j);
						scorelist.set(j, scorelist.get(j - 1));
						scorelist.set(j - 1, temp);

					}
				}
			}
		}

		return scorelist;
	}
	public static List<String> sortDNA(List<String>dna){
		List<String> dnaorder = new ArrayList<String>(dna);
		for (int i = 0; i < dnaorder.size(); i++) {
			for (int j = 0; j < dnaorder.size(); j++) {
				if (j - 1 > -1) {
					if (dnaorder.get(j).length() < dnaorder.get(j-1).length()) {
						String temp = dnaorder.get(j);
						dnaorder.set(j, dnaorder.get(j - 1));
						dnaorder.set(j - 1, temp);

					}
				
				}
				
				
			}
			
		}
		return dnaorder;
	}
	public static List<String> sortWords(List<String>alp){
		List<String> alphabet = new ArrayList<String>(alp);
		for (int i = 0; i < alphabet.size(); i++) {
			for (int j = 0; j < alphabet.size(); j++) {
				if (j - 1 > -1) {
					if (alphabet.get(j).compareTo(alphabet.get(j-1))<0) {
						String temp = alphabet.get(j);
						alphabet.set(j, alphabet.get(j - 1));
						alphabet.set(j - 1, temp);
					}
					}
			}
		}
		return alphabet;
	}
}
	
