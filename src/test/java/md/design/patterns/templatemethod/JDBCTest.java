package md.design.patterns.templatemethod;

import org.junit.jupiter.api.Test;

public class JDBCTest {
	@Test
	void should_insert_new_book(){
		Book book=new Book("??", "Test template method");
		book.insert();
	}
	@Test
	void should_insert_new_address(){
		Address address=new Address("Germany", "Ilmenau", "98693", "blalbla");
		address.insert();
	}
}
