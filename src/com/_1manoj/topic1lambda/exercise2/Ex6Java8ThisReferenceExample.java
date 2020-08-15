package com._1manoj.topic1lambda.exercise2;

/*
 * Java8 Lambda ARE NOT EQUAL TO Java7 Anonymous Class
 * 
 * In Anonymous, this reference is changed/refers to current Anonymous Class Instance
 * unlike Anonymous Class, this reference in Lambda does not override and its the same as it was in outer scope.
 * 
 */
public class Ex6Java8ThisReferenceExample {

	interface Process {
		void process(int i);
	}

	void doProcess(int i, Process p) {
		p.process(i);
	}

	void execute() {

		// What is 'this' here in outer scope ?
		System.out.println("this: " + this);
		doProcess(10, i -> {
			System.out.println("i: " + i);

			// This will work here, because as said Lambda does not override 'this' keyword
			// but uses the 'this' as it was in outer scope.
			System.out.println("this: " + this);
		});
	}

	public static void main(String[] args) {

		Ex6Java8ThisReferenceExample exerciseJava8ThisReferenceExample = new Ex6Java8ThisReferenceExample();

//		System.out.println("this: " + this); // this keyword will not work here either
		// Java7 Way
		exerciseJava8ThisReferenceExample.doProcess(10, new Process() {
			@Override
			public void process(int i) {
				System.out.println("i: " + i);
				System.out.println("this: " + this);
			}
		});

		// Java8 Lambda Way
		exerciseJava8ThisReferenceExample.doProcess(10, i -> {
			System.out.println("i: " + i);
			// System.out.println("this: " + this); // this keyword is not allowed here
		});

		exerciseJava8ThisReferenceExample.execute();
	}
}
