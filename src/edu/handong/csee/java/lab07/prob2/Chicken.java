package edu.handong.csee.java.lab07.prob2;
/**
 * @author s0rrow
 * This class is for declaring methods needed for 
 */
public class Chicken {//This class is for declaring 
	private String name;
	private double price;
	private int stars;

	public Chicken() {
		this.name = "";
		this.price = 0.0;
		this.stars = 0;
	}

	public Chicken(String name, double price, int stars) {
		this.name = name;
		this.price = price;
		this.stars = stars;
	}

	public String get_name() {
		return this.name;
	}

	public double get_price() {
		return this.price;
	}

	public int get_stars() {
		return this.stars;
	}

	public void set_name(String name) {
		this.name = name;
	}

	public void set_price(double price) {
		this.price = price;
	}

	public void set_stars(int stars) {
		this.stars = stars;
	}
}
