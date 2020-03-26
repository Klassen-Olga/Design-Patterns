package md.design.patterns.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdapterTest {
	@Test
	void should_return_true_even_with_changed_function_name(){
		Client client=new Client("John", new AdapterRegEx(new ClientCheck()));
		assertTrue(client.checkName());
	}
	@Test
	void should_return_false_even_with_changed_function_name(){
		Client client=new Client("John!", new AdapterRegEx(new ClientCheck()));
		assertFalse(client.checkName());
	}
}
