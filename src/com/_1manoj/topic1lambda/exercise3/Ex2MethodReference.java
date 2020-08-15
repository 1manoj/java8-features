package com._1manoj.topic1lambda.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com._1manoj.model.Person;

public class Ex2MethodReference {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Manoj", "Borse", 33), new Person("Vishal", "Nai", 29),
				new Person("Maulik", "Oza", 31), new Person("Mukund", "Bhat", 39),
				new Person("Swaroop", "Godbole", 39));

		// performPeopleConditionaly(people, p -> true, p -> System.out.println(p));
		performPeopleConditionaly(people, p -> true, System.out::println);
	}

	private static void performPeopleConditionaly(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p))
				consumer.accept(p);
		}
	}
}
