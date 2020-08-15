package com._1manoj.topic1lambda.basics;

/*
 * Annotation : @FunctionalInterface
 * is used to annote the given Interface is used as a Lambda Functional Interface
 * and must have ONLY ONE ABSTRACT METHOD
 * It can have multiple implementation methods in Interface itself, as allowed in JAVA8
 * but Abstract Method must be ONLY ONE
 */

public class Ex3GreetingFunctionalInterface {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Ex3GreetingFunctionalInterface greeterFunctionalInterface = new Ex3GreetingFunctionalInterface();

		HelloWorldGreeting hwGreeting = greeterFunctionalInterface.new HelloWorldGreeting();
//		greeterLambdaOne.greet(hwGreeting);

		GoodMorningGreeting gmGreeting = greeterFunctionalInterface.new GoodMorningGreeting();
//		greeterLambdaOne.greet(gmGreeting);

		// anonymous Inner Class
		Greeting gaGreeting = new Greeting() {
			public void perform() {
				System.out.println("Good Afternoon, World.");
			}
		};

		Greeting geGreeting = () -> System.out.println("Good Evening, World.");

		hwGreeting.perform();
		gmGreeting.perform();
		gaGreeting.perform();
		geGreeting.perform();

		System.out.println("\n");

		greeterFunctionalInterface.greet(hwGreeting);
		greeterFunctionalInterface.greet(gmGreeting);
		greeterFunctionalInterface.greet(gaGreeting);
		greeterFunctionalInterface.greet(geGreeting);

	}

	@FunctionalInterface
	interface Greeting {
		public void perform();
		// public void anotherMethod();
	}

	class HelloWorldGreeting implements Greeting {
		@Override
		public void perform() {
			// TODO Auto-generated method stub
			System.out.println("Hello World");
		}
	}

	class GoodMorningGreeting implements Greeting {
		@Override
		public void perform() {
			// TODO Auto-generated method stub
			System.out.println("Good Morning, World.");
		}
	}
}
