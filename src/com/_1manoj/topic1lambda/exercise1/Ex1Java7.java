package com._1manoj.topic1lambda.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com._1manoj.model.Person;

public class Ex1Java7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Manoj", "Borse", 33), new Person("Vishal", "Nai", 29),
				new Person("Maulik", "Oza", 31), new Person("Mukund", "Bhat", 39),
				new Person("Swaroop", "Godbole", 39));

		printPeople(people);
		System.out.println("\n\n");

		// Step-1: Sort List by Last Name.
		System.out.println("Step-1:	Sort List by Last Name.");
		System.out.println("Sorted.");
		System.out.println("\n\n");
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getLastName().compareTo(arg1.getLastName());
			}
		});

		// Step-2: Create a method that prints all elements in the list
		System.out.println("Step-2:	Create a method that prints all elements in the list");
		printPeople(people);
		System.out.println("\n\n");

		// Step-3: Create a method that prints all people that have last name beginning
		// with 'O'
		System.out.println("Step-3:	Create a method that prints all people that have last name beginning with 'O'");
		printPeopleLastNameBeginsWith(people);
		System.out.println("\n\n");

		System.out.println("Step-3:	Create a method that prints all people that have last name beginning with 'O'");
		printPeopleConditionaly(people, new Condition() {
			public boolean test(Person p) {
				return p.getLastName().startsWith("O");
			}
		});
		System.out.println("\n\n");

		System.out.println("Step-3:	Create a method that prints all people that have first name beginning with 'M'");
		printPeopleConditionaly(people, new Condition() {
			public boolean test(Person p) {
				return p.getFirstName().startsWith("M");
			}
		});
		System.out.println("\n\n");

	}

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
