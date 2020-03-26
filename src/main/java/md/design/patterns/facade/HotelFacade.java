package md.design.patterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

/**
 * Making a facade to interact with a bunch of complex objects
 * zb you need to instantiate an object, which needs in hist constructor another Object, that needs another object
 * that needs another object and so on
 * or
 * to produce a complex action we need another actions which involve another classes
 */
public class HotelFacade {

	public Restaurant prepareRestaurant(){

		return new Restaurant(prepareBar(), prepareFood());
	}
	private LinkedList<Personal> preparePersonal(){
		return new LinkedList<Personal>();
	}
	private LinkedList<Food> prepareFood(){
		return new LinkedList<Food>();
	}
	private LinkedList<Drink> prepareDrinks(){
		return new LinkedList<Drink>();
	}
	private LinkedList<Guest> prepareGuests(){
		return new LinkedList<Guest>();
	}
	public Bar prepareBar(){
		return new Bar(prepareDrinks());
	}
	public Hotel prepareHotel(){
		return new Hotel(prepareGuests(), preparePersonal(), prepareRestaurant());
	}
}
