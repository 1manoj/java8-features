package com._1manoj.topic1lambda.basics;

public class Ex1GreetingUsualOne {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Ex1GreetingUsualOne greeterUsualOne = new Ex1GreetingUsualOne();

		HelloWorldGreeting hwGreeting = greeterUsualOne.new HelloWorldGreeting();
		greeterUsualOne.greet(hwGreeting);

		GoodMorningGreeting gmGreeting = greeterUsualOne.new GoodMorningGreeting();
		greeterUsualOne.greet(gmGreeting);
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
