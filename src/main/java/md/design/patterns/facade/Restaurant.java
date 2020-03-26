package md.design.patterns.facade;

import java.util.LinkedList;

public class Restaurant {
	private Bar bar;
	LinkedList<Food> food;

	public Restaurant(Bar bar, LinkedList<Food> food) {
		this.bar = bar;
		this.food = food;
	}
}
