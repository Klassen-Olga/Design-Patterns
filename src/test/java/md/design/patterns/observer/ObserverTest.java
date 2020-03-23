package md.design.patterns.observer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {
	@Test
	void should_have_21_00_time(){
		Flight chisinau_Berlin=new Flight(LocalTime.of(20, 20), LocalDate.of(2020, 03, 14));
		Client oleg=new Client(LocalTime.of(20, 20), LocalDate.of(2020, 03, 14), chisinau_Berlin);
		Client valera=new Client(LocalTime.of(20, 20), LocalDate.of(2020, 03, 14), chisinau_Berlin);
		Client luminita= new Client(LocalTime.of(20, 20), LocalDate.of(2020, 03, 14), chisinau_Berlin);

		chisinau_Berlin.add(oleg);
		chisinau_Berlin.add(valera);
		chisinau_Berlin.add(luminita);
		//when
		LocalTime newTime=LocalTime.of(21, 00);
		chisinau_Berlin.changeTime(newTime);

		//then
		assertEquals(newTime, oleg.getTime());
		assertEquals(newTime, valera.getTime());
		assertEquals(newTime, luminita.getTime());
	}

}
