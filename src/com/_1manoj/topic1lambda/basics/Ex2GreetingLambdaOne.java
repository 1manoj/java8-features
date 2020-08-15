package com._1manoj.topic1lambda.basics;

public class Ex2GreetingLambdaOne {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Ex2GreetingLambdaOne greeterLambdaOne = new Ex2GreetingLambdaOne();

		HelloWorldGreeting hwGreeting = greeterLambdaOne.new HelloWorldGreeting();
//		greeterLambdaOne.greet(hwGreeting);

		GoodMorningGreeting gmGreeting = greeterLambdaOne.new GoodMorningGreeting();
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

		greeterLambdaOne.greet(hwGreeting);
		greeterLambdaOne.greet(gmGreeting);
		greeterLambdaOne.greet(gaGreeting);
		greeterLambdaOne.greet(geGreeting);

	}

	interface Greeting {
		public void perform();
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
