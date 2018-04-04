package edu.handong.csee.java.lab07.prob3;
/**
 * @author s0rrow
 * This class is a main class for printing out student's attendance using methods from Attendance class.
 */
import java.util.Random;
// Import random for generating random numbers.
public class Attendance_main {
	public static void main(String[] args) {// This is a main method.
		Attendance s_1 = new Attendance();// Declare an empty instance for first from Attendance class.
		Attendance s_2 = new Attendance();// Declare an empty instance for second from Attendance class.
		Attendance s_3 = new Attendance("Liel", 1, "21700726", 0);// Declare an instance for third from Attendance class about student 'Liel.'
		Attendance s_4 = new Attendance("DoYoung", 2, "21700082", 0);// Declare an instance for fourth from Attendance class about student 'DoYoung.'

		s_1.set_name("JungYeon");// Set student name for first instance.
		s_1.set_year(4);// Set student year for first instance.
		s_1.set_id("21700999");// Set student id for first instance.
		s_1.set_missed(0);// Set missed time of class for first instance.
		s_2.set_name("ShiHyun");// Set student name for second instance.
		s_2.set_year(2);// Set student year for second instance.
		s_2.set_id("21700111");// Set student id for second instance.
		s_2.set_missed(0);// Set missed time of class for second instance.

		Random randomGenerator = new Random();// Declare random for generating random numbers.

		s_1.set_missed(randomGenerator.nextInt(10));// Assign random numbers generated through randomGenerator to first instance.
		s_2.set_missed(randomGenerator.nextInt(10));// Assign random numbers generated through randomGenerator to second instance.
		s_3.set_missed(randomGenerator.nextInt(10));// Assign random numbers generated through randomGenerator to third instance.
		s_4.set_missed(randomGenerator.nextInt(10));// Assign random numbers generated through randomGenerator to fourth instance.
		if (s_1.get_missed() > 6) {// If class missed is more than 6 times,
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");// Print the fail message.
			System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());// And notify the missed time.
		} else
			System.out.println("We'll see about the grade, " + s_1.get_name());// If not, print out to check the grade.
		if (s_2.get_missed() > 6) {// If class missed is more than 6 times,
			System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");// Print the fail message.
			System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());// And notify the missed time.
		} else
			System.out.println("We'll see about the grade, " + s_2.get_name());// If not, print out to check the grade.
		if (s_3.get_missed() > 6) {// If class missed is more than 6 times,
			System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");// Print the fail message.
			System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());// And notify the missed time.
		} else
			System.out.println("We'll see about the grade, " + s_3.get_name());// If not, print out to check the grade.
		if (s_4.get_missed() > 6) {// If class missed is more than 6 times,
			System.out.println("I'm sorry " + s_4.get_name() + ". You fail this course");// Print the fail message.
			System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());// And notify the missed time.
		} else
			System.out.println("We'll see about the grade, " + s_4.get_name());// If not, print out to check the grade.

	}

}
