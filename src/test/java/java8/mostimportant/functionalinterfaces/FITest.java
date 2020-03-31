package java8.mostimportant.functionalinterfaces;

import java8.mostimportant.anonymousclass.Animal;
import org.junit.jupiter.api.Test;

import java.util.function.*;

import static org.junit.jupiter.api.Assertions.*;

public class FITest {
	/**
	 * Predicate
	 * 1 parameter: any value
	 * returns: boolean
	 */
	@Test
	void take_one_parameter_and_test_if_is_greaterOne(){
		//It is an instance of child class Predicate that has own implementation of method test()
		//in our case it checks if parameter grater one
		Predicate<Integer> isGreaterThenOne=x->x>1;
		assertTrue(isGreaterThenOne.test(2));
		assertFalse(isGreaterThenOne.test(0));
	}
	@Test
	void divisorOf2(){
		Predicate<Integer> isDivisorOf2=x->x%2==0;
		assertTrue(isDivisorOf2.test(2));

		assertTrue(isDivisorOf2.test(4));

		assertTrue(isDivisorOf2.test(6));

		assertTrue(isDivisorOf2.test(0));

		assertFalse(isDivisorOf2.test(1));
	}

	/**
	 * Consumer
	 * 1 parameter: any type
	 * no return method
	 */
	@Test
	void take_one_argument_and_do_smth(){

		Consumer<String> printMe=str-> System.out.println(str);
		printMe.accept("Hello");
	}

	/**
	 * Function
	 * 1 parameter: one type
	 * returns another type
	 */
	@Test
	void take_one_string_return_length(){
		Function<String, Integer> stringLength= String::length;
		assertEquals(4, stringLength.apply("four"));
	}

	/**
	 *Supplier
	 * no parameter
	 * returns any type
	 */
	@Test
	void take_no_argument_return_object(){
		Supplier<Animal> getAnimal= Animal::new;
		assertNotNull(getAnimal.get());
	}

	/**
	 * Binary operator
	 * 2 parameters of same type
	 * return type of parametertestjava
	 */
	@Test
	void take_two_numbers_multiple_them(){
		BinaryOperator<Integer> multipleMe=(a,b)->a*b;
		assertEquals(32, multipleMe.apply(4,8));
	}
}
