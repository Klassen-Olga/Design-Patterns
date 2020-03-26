package md.design.patterns.facade;

import java.util.LinkedList;

public class Bar {
	private LinkedList<Drink> drinks;

	public Bar(LinkedList<Drink> drinks){
		this.drinks=drinks;
	}
}
