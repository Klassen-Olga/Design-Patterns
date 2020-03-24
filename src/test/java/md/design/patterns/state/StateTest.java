package md.design.patterns.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StateTest {
	SearchMachine machine=new SearchMachine();
	@Test
	void should_start_search_and_be_in_searching_state(){
		machine.startSearch();
		assertTrue(machine.checkState() instanceof SearchMachineState);
		machine.crawling();
		assertTrue(machine.checkState() instanceof ResultShowingState);
		machine.closeSearch();
		assertTrue(machine.checkState() instanceof StateOfRest);


	}
}
