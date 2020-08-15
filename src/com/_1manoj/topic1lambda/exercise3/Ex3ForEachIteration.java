package com._1manoj.topic1lambda.exercise3;

import java.util.Arrays;
import java.util.List;

import com._1manoj.model.Person;

public class Ex3ForEachIteration {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Manoj", "Borse", 33), new Person("Vishal", "Nai", 29),
				new Person("Maulik", "Oza", 31), new Person("Mukund", "Bhat", 39),
				new Person("Swaroop", "Godbole", 39));

		System.out.println("\nUsing for Loop/Iteration");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		System.out.println("\nUsing for-in loop");
		for (Person p : people) {
			System.out.println(p);
		}

		System.out.println("\nUsing for-each lambda");
		people.forEach(p -> System.out.println(p));

		System.out.println("\nUsing for-each lambda -> MethodReference");
		people.forEach(System.out::println);
	}

}
