package com._1manoj.topic1lambda.exercise2;

public class Ex5Java8ClosureExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

//		process(a, new Perform() {
//			@Override
//			public void doProcess(int a) {
//				a = 100;
//				// b = 100;
//				System.out.println(a + b);
//			}
//		});

//		process(a, a -> {
//			a = 100;
//			// b = 100;  // Will Not Work
//			System.out.println(a + b);
//		});

		process(a, i -> System.out.println(a + b));

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	static void process(int a, Perform p) {
		p.doProcess(a);
	}

	interface Perform {
		void doProcess(int a);
	}
}
