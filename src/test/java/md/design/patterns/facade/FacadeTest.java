package md.design.patterns.facade;

import md.design.patterns.facade.Hotel;
import md.design.patterns.facade.HotelFacade;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacadeTest {
	@Test
	void should_create_hotel(){
		HotelFacade hotelFacade=new HotelFacade();
		assertTrue(hotelFacade.prepareHotel() instanceof Hotel);
	}
}
