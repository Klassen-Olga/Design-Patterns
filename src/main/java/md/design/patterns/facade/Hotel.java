package md.design.patterns.facade;

import java.util.LinkedList;

public class Hotel {
	private LinkedList<Guest> guests;
	private LinkedList<Personal> personal;
	private Restaurant restaurants;
	public Hotel(LinkedList<Guest> guests, LinkedList<Personal> personal, Restaurant restaurants){
		this.guests=guests;
		this.personal=personal;
		this.restaurants=restaurants;
	}
}
