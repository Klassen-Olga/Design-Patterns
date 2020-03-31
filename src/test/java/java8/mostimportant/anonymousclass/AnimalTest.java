package java8.mostimportant.anonymousclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalTest {
	@Test
	void should_return_animal_is_eating(){
		//When
		Animal animal=new Animal();
		assertTrue("Animal is eating".equals(animal.eat()));
	}

	/**
	 * We are using anonymous classes, if we need to override some methods but only once
	 * the child class will be created, but we can save up some code
	 */
	@Test
	void should_return_animal_is_eating_fast(){
		//When

		//New object
		Animal animal1=new Animal();

		//Behind the scenes new child class Animal(because it has own realisation of methods)
		// and only one object  possible animal
		//object animal is of child class Animal
		Animal animal=new Animal(){
			public String eat(){
				return "Animal is eating fast";
			}
			public String sleep(){
				return "Animal is sleeping fast";

			}
		};

		//Then
		assertTrue("Animal is eating fast".equals(animal.eat()));
		assertTrue("Animal is sleeping fast".equals(animal.sleep()));

		assertTrue("Animal is eating".equals(animal1.eat()));
		assertTrue("Animal is sleeping".equals(animal1.sleep()));
	}

	@Test
	void should_create_new_class_behind_the_scenes(){
		Eatble eatble=new Eatble() {
			@Override
			public String eat() {
				return "I am anonymous class that implements interface Eatble and I eat with pleasure";
			}
		};
		//Another variant with lambda
		Eatble eatble1=()->"I am bombi4eskaia bombeara";

	}
}
