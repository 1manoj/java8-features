package com._1manoj.topic2streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com._1manoj.model.Person;

public class Ex1StreamsBasics {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Manoj", "Borse", 33), 
				new Person("Vishal", "Nai", 29),
				new Person("Maulik", "Oza", 31), 
				new Person("Mukund", "Bhat", 39),
				new Person("Swaroop", "Godbole", 39)
				);

		System.out.println("\nPrints all people that have first name beginning with 'M'");

		System.out.println("\nUsing just Lambda");
		performPeopleConditionaly(
				people, 
				p -> p.getFirstName().startsWith("M"),
				p -> System.out.println(p)
				);

		/*
		 * stream()		| Get all the Person from people list and process sequentially
		 * filter()		| Filter out the one whose First Name begins with 'M' skip the rest
		 * forEach()	| Print the filtered stream ONE-BY-ONE
		 */
		System.out.println("\nUsing Lambda & Stream");
		people.stream()
		.filter(p -> p.getFirstName().startsWith("M"))
		.forEach(p -> System.out.println(p));
		
		System.out.println("\nCount: " +
		people.stream()
		.filter(p -> p.getFirstName().startsWith("M"))
		.count());

	}

	private static void performPeopleConditionaly(
			List<Person> people, 
			Predicate<Person> predicate,
			Consumer<Person> consumer
			) {
		for (Person p : people) {
			if (predicate.test(p))
				consumer.accept(p);
		}
	}
}