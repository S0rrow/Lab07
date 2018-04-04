package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;// Import scanner for input.

/**
 * @author s0rrow
 * This class is for using declared methods from YearToCentury class as main class.
 */
public class YearToCentury_main {
	public static void main(String[] args) {// This is main method.
		int yr = 0;// Declare local int variable for getting years.
		Scanner keyboard = new Scanner(System.in);// Declare scanner for getting input.

		System.out.println("Type in year: ");// Print first order to have user type year.
		yr = keyboard.nextInt();// Than, scan the next typed integer.

		YearToCentury year = new YearToCentury(yr);// Declare variable year for calling methods from class YearToCentury.
		System.out.println(yr + " is " + year.calc_century() + "th century.");// Print the result for calculating year to century in given format.
	}
}