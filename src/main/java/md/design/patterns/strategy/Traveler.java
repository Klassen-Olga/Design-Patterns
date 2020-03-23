package md.design.patterns.strategy;

import md.design.patterns.strategy.eating.Eating;
import md.design.patterns.strategy.moving.Moving;
import md.design.patterns.strategy.plan.Plan;
import md.design.patterns.strategy.sleeping.Sleeping;

/**
 * Strategy pattern solves the inheritance problem, diamond problem, multiple inheritance problem
 * It solves the problem of c&p code, that multiple children have the same methods with one to one
 * implementation
 *
 * With strategy pattern there is no need to have subclasses for (zb ducks), because a special duck will be
 * defined as a set of behaviours(strategies)
 */
public class Traveler {
	Moving modeOfTransport;
	Eating modeOfEating;
	Sleeping modeOfSleep;
	Plan travelPlan;
	public Traveler(Moving modeOfTransport, Eating modeOfEating, Sleeping modeOfSleep, Plan travelPlan){
		this.modeOfEating=modeOfEating;
		this.modeOfSleep=modeOfSleep;
		this.modeOfTransport=modeOfTransport;
		this.travelPlan=travelPlan;

	}
	public String eat(){
		return modeOfEating.eat();
	}
	public String sleep(){
		return modeOfSleep.sleep();
	}
	public String move(){
		return modeOfTransport.move();
	}
	public String[] getPlan(){
		return this.travelPlan.getCities();
	}
}
