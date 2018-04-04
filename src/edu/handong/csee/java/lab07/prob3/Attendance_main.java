package edu.handong.csee.java.lab07.prob3;

import java.util.Random;

public class Attendance_main {

	public static void main(String[] args) {
		Attendance s_1 = new Attendance();
		Attendance s_2 = new Attendance();
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0);
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0);

		s_1.set_name("Jess");
		s_1.set_year(4);
		s_1.set_id("21400999");
		s_1.set_missed(0);
		s_2.set_name("Kent");
		s_2.set_year(2);
		s_2.set_id("21700111");
		s_2.set_missed(0);

		Random randomGenerator = new Random();

		s_1.set_missed(randomGenerator.nextInt(10));
		s_2.set_missed(randomGenerator.nextInt(10));
		s_3.set_missed(randomGenerator.nextInt(10));
		s_4.set_missed(randomGenerator.nextInt(10));
		if (s_1.get_missed() > 6) {
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");
			System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());
		} else
			System.out.println("We'll see about the grade, " + s_1.get_name());
		if (s_2.get_missed() > 6) {
			System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");
			System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());
		} else
			System.out.println("We'll see about the grade, " + s_2.get_name());
		if (s_3.get_missed() > 6) {
			System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");
			System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());
		} else
			System.out.println("We'll see about the grade, " + s_3.get_name());
		if (s_4.get_missed() > 6) {
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");
			System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());
		} else
			System.out.println("We'll see about the grade, " + s_4.get_name());

	}

}
