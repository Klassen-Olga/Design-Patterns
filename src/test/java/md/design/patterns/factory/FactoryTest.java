package md.design.patterns.factory;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryTest {
	@Test
	void should_be_Azinfexin_Type(){
		//when
		Pharmacy pharmacy = new Pharmacy();
		Drug drug=pharmacy.getDrug("headache");

		//then
		assertTrue(drug instanceof Azinfexin);
	}
}
