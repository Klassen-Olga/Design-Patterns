package md.design.patterns.strategy;

import md.design.patterns.strategy.eating.Eating;
import md.design.patterns.strategy.eating.StreetEating;
import md.design.patterns.strategy.moving.BikeMoving;
import md.design.patterns.strategy.moving.Moving;
import md.design.patterns.strategy.plan.BalticStatesPlan;
import md.design.patterns.strategy.plan.Plan;
import md.design.patterns.strategy.sleeping.Sleeping;
import md.design.patterns.strategy.sleeping.TendSleeping;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrategyTest {
	@Test
	void should_be_traveler_that_travels_bike_in_balticStates_sleeps_inTend_eats_atStreet(){
		Moving moving=new BikeMoving();
		Sleeping sleeping =new TendSleeping();
		Eating eating=new StreetEating();
		Plan plan=new BalticStatesPlan();
		String[] cities={"Talinn", "Riga", "Vilnus"};

		//As a result we don't need a lot of classes with different behaviour, but we can combine
		//some classes to achieve an object with certain set of behaviour

		Traveler traveler=new Traveler(moving,eating, sleeping, plan);
		assertEquals("moving by bike", traveler.move());
		assertEquals("tend sleeping", traveler.sleep());
		assertEquals("street eating", traveler.eat());

	}
}
