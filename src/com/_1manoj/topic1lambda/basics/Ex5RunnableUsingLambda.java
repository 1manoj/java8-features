package com._1manoj.topic1lambda.basics;

public class Ex5RunnableUsingLambda {

	/*
	 * Here we can using Lambda Expression/Function with Runnable Interface is only
	 * because Runnable Interface has only ONE abstract method.
	 * 
	 * Note : Lambdas works only with Interfaces which have EXACTLY ONE abstract
	 * method.
	 * 
	 */

	public static void main(String[] args) {

		Thread normalThread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Inside Runable.");
			}
		});

		Thread usingLambda = new Thread(() -> System.out.println("Inside Lambda Runable."));

		normalThread.run();
		usingLambda.run();
	}
}
