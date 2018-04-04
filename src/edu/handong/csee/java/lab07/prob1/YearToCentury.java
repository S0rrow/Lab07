package edu.handong.csee.java.lab07.prob1;

/**
 * @author s0rrow
 * This class is for offering main class methods.
 */
public class YearToCentury {
	int year;// Declare variable for counting years.

	public YearToCentury() {// This method is for initializing integer variable for counting years.
		year = 0;// Initialize to 0.
	}

	public YearToCentury(int year) {// This method is for assigning the given parameter to year.
		this.year = year;// Int parameter year is equal to int variable year from this class.
	}

	public int calc_century() {// This method is for calculating given year in century format.
		if (year % 100 == 0) {// In condition where remaining of year divided by 100 is 0,
			year = year / 100;// int variable year is reassigned as year divided to 100.
		} else {
			year = (year / 100) + 1;// If not, than int variable year is reassigned as year divided to 100 plus 1.
		}
		return year;// Return the reassigned year variable.
	}
}
