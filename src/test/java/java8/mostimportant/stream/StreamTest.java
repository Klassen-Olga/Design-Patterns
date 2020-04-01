package java8.mostimportant.stream;

import java8.mostimportant.anonymousclass.stream.Person;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StreamTest {
	List<Person> personList = Person.get10Person();
	List<String> arr=Arrays.asList("a1", "a2", "a3", "a1");



	@Test
	void print_all_persons_lastName_together_with_gender() {
		personList.stream().map(person -> person.getLastName() + " " + person.getGender()).forEach(person -> System.out.println(person));

	}

	@Test
	void count_all_male() {
		long num = personList.stream().filter(person -> person.getGender() == Person.Gender.MALE).count();
		assertEquals(2, num);
	}

	@Test
	void print_all_males_nationality_and_firstName() {
		personList.stream()
			.filter(person -> person.getGender() == Person.Gender.MALE)
			.forEach(person -> System.out.println(person.getFirstName() + " " + person.getNationality()));
	}

	@Test
	void sort_lastNames_desc_print_all() {
		personList.stream()
			.map(Person::getLastName)
			.sorted()
			.forEach(System.out::println);
	}

	@Test
	void returns_list_with_modified_firstNames_and_modifies_initial_list() {
		List<Person> personList1 = personList.stream()
			.peek(person -> person.setLastName(person.getLastName() + "_"))
			.collect(Collectors.toList());

	}

	@Test
	void returns_the_oldest_person() {
		Person person = personList.stream()
			.max(Comparator.comparing(Person::getAge))
			.orElseThrow(NoSuchElementException::new);
		assertEquals("Z", person.getLastName());
	}

	@Test
	void should_return_person_with_the_longest_name() {
		Person person = personList.stream()
			.max(Comparator.comparing(person1 -> person1.getLastName().length()))
			.get();
		assertEquals("Blob", person.getFirstName());
	}

	@Test
	void returns_the_sum_of_persons_ages() {
		int sum = personList.stream()
			.map(Person::getAge)
			.reduce(0, (a, b) -> a + b);
		int sum1 = personList.stream().map(Person::getAge).mapToInt(Integer::intValue).sum();
		assertEquals(sum, sum1);
	}

	@Test
	void groups_by_gender() {
		Map<Person.Gender, List<Person>> personsPerGender = personList.stream()
			.collect(Collectors.groupingBy(Person::getGender));
	}

	@Test
	void counts_person_per_nationality() {
		Map<Person.Nationality, Long> numberOfPersonPerNationality =
			personList.stream()
				.collect(Collectors.groupingBy(Person::getNationality, Collectors.counting()));
	}

	@Test
	void groups_lastNames_per_gender() {
		Map<Person.Gender, List<String>> lastNamesPerGender =personList.stream()
			.collect(Collectors.groupingBy(Person::getGender, Collectors.mapping(Person::getLastName, Collectors.toList())));
	}
	@Test
	void returns_number_of_a1_in_list(){
		long a1Number=arr.stream()
			.filter(a->a.equals("a1")).count();
		assertEquals(2,a1Number);
	}
	@Test
	void returns_first_collection_element_or_0_if_is_empty(){
		String firstOne=arr.stream()
			.findFirst()
			.orElse("0");
		assertTrue("a1".equals(firstOne));
	}
	@Test
	void returns_last_element_or_word_empty_if_is_empty(){
		String lastOne=arr.stream()
			.skip(arr.size()-1)
			.findAny()
			.orElse("empty");
	}
	@Test
	void find_a3_or_throw_the_error(){
		String result=arr.stream()
			.filter(a3->a3.equals("a3"))
			.findFirst()
			.orElseThrow(NoSuchElementException::new);
	}
	@Test
	void find_third_element_in_the_list(){
		String third=arr.stream()
			.skip(2)
			.findFirst().get();
		assertEquals("a3", third);
	}

}
