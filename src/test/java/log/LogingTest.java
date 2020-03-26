package log;

import md.design.patterns.facade.HotelFacade;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogingTest {
	private static final Logger log = LoggerFactory.getLogger(HotelFacade.class);

	@Test
	void some_log_tests(){

		log.warn("message {}",1);
		log.debug("This is object debug");
		log.info("My age is between {} and {}", 20, 30);
		log.info("Hello this is info logger test");
	}
}
