package edu.handong.csee.java.lab07.prob2;
/**
 * @author s0rrow
 * This class is for using methods declared in Chicken class.
 */
public class Chicken_main {
	public static void main(String[] args) {// This is the main method.
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);// Declare first instance using Chicken class.
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);// Declare second instance using Chicken class.
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);// Declare thirs instance using Chicken class.

		menu1.set_stars(3);// Set the rating of first instance.
		menu2.set_stars(4);// Set the rating of second instance.
		menu3.set_stars(1);// Set the rating of third instance.

		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());// Print the name and rating of first instance.
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());// Print the name and rating of second instance.
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());// Print the name and rating of third instance.
	}

}
