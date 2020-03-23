import md.design.patterns.factory.Drug;
import md.design.patterns.factory.Pharmacy;
import md.design.patterns.iterator.iterableImplementation.LifeSet;
import md.design.patterns.observer.Client;
import md.design.patterns.observer.Flight;
import md.design.patterns.singleton.Cup;
import md.design.patterns.singleton.Water;

import java.time.LocalDate;
import java.time.LocalTime;

public class Launcher {
	public static void main(String[] args) {
		//Singleton
		Water water=new Water("BuliBuli");
		Cup cup=Cup.getCupWithWater(water);

		//Factory
		Pharmacy pharmacy = new Pharmacy();
		Drug drug=pharmacy.getDrug("headache");

		//Observer
		Flight chisinau_Berlin=new Flight(LocalTime.of(20, 20), LocalDate.of(2020, 03, 14));
		Client oleg=new Client(LocalTime.of(20, 20), LocalDate.of(2020, 03, 14), chisinau_Berlin);
		Client valera=new Client(LocalTime.of(20, 20), LocalDate.of(2020, 03, 14), chisinau_Berlin);
		Client luminita= new Client(LocalTime.of(20, 20), LocalDate.of(2020, 03, 14), chisinau_Berlin);



	}
}
