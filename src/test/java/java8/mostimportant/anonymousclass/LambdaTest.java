package java8.mostimportant.anonymousclass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Functional interface is an interface that has only one abstract method, that should be overridden
 * That is why it is good for lambda expressions, where we implement this method
 */
public class LambdaTest {

	@Test
		void anonymousClass(){
		List<String> myList = new ArrayList<String>();
		myList.add("A");
		myList.add("B");
		//Comparator is a functional interface because it has only one abstract method
		//We create an child class that implements Comparator interface(anonymous class) with own implementation of method compare
		Collections.sort(myList, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return -1* s1.compareTo(s2);
			}
		});

		/*
		* default method
		* Collections.sort(myList);
		* */

	}

	@Test
	void anonymousClassPlus(){
		List<String> myList = new ArrayList<String>();
		myList.add("A");
		myList.add("B");
		/*
		 * Take two strings
		 * compare and return int
		 * */
		Collections.sort(myList, (String s1, String s2) -> {

			return -1* s1.compareTo(s2);
		});
	}
	@Test
	void lambda(){
		List<String> myList = new ArrayList<String>();
		myList.add("A");
		myList.add("B");
		Collections.sort(myList, (s1, s2) -> -1* s1.compareTo(s2));

	}
}
