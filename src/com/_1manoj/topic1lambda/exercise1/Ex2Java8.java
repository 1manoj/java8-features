package com._1manoj.topic1lambda.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com._1manoj.model.Person;

public class Ex2Java8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Manoj", "Borse", 33), new Person("Vishal", "Nai", 29),
				new Person("Maulik", "Oza", 31), new Person("Mukund", "Bhat", 39),
				new Person("Swaroop", "Godbole", 39));

		// printPeople(people);
		// No need to use above method, we can simply use Lambda and use Condition as
		// TRUE always to print all
		printPeopleConditionaly(people, p -> true);
		System.out.println("\n\n");

		// Step-1: Sort List by Last Name.
		System.out.println("Step-1:	Sort List by Last Name.");
		System.out.println("\n");
		System.out.println("Sorted.");
		System.out.println("\n\n");

		// All below methods are VALID
		// Method - 1
		Collections.sort(people, (Person arg0, Person arg1) -> {
			return arg0.getLastName().compareTo(arg1.getLastName());
		});
		// Method - 2 (more refined)
		Collections.sort(people, (Person arg0, Person arg1) -> arg0.getLastName().compareTo(arg1.getLastName()));
		// Method - 3 (more,more refined)
		Collections.sort(people, (arg0, arg1) -> arg0.getLastName().compareTo(arg1.getLastName()));

		// Step-2: Create a method that prints all elements in the list
		System.out.println("Step-2:	Create a method that prints all elements in the list");
		printPeople(people);
		printPeopleLastNameBeginsWith(people);
		System.out.println("\n\n");
		printPeopleConditionaly(people, p -> true);
		System.out.println("\n\n");

		// Step-3: Create a method that prints all people that have last name beginning
		// with 'O'
		System.out.println("Step-3:	Create a method that prints all people that have last name beginning with 'O'");
		printPeopleConditionaly(people, (p) -> p.getLastName().startsWith("O"));
		System.out.println("\n\n");

		System.out.println("Step-3:	Create a method that prints all people that have first name beginning with 'M'");

		printPeopleConditionaly(people, (p) -> p.getFirstName().startsWith("M"));
		System.out.println("\n\n");

	}

	@FunctionalInterface
	interface Condition {
		public boolean test(Person P);
	}

	private static void printPeopleConditionaly(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p))
				System.out.println(p);
		}
	}

	private static void printPeopleLastNameBeginsWith(List<Person> people) {
		for (Person p : people) {
			if (p.getLastName().startsWith("O"))
				System.out.println(p);
		}
	}

	private static void printPeople(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

}
