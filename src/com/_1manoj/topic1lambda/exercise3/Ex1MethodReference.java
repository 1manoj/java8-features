package com._1manoj.topic1lambda.exercise3;

/*
 * MethodReference shortcut syntax : ClassName::staticMethodName
 * MethodReference shortcut syntax : ClassInstance::instanceMethodName
 */
public class Ex1MethodReference {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("\nUsual Practise");
		printMessage();

		System.out.println("\nUsing Thread-Runnable");
		Thread t1 = new Thread(() -> printMessage());
		t1.start();
		t1.join(); // Had to write this because this was executing sometime later then expected.

		System.out.println("\nUsing Thread-Runnable | MethodReference shortcut");
		System.out.println("\nMethodReference shortcut syntax : ClassName::staticMethodName");
		System.out.println("\nMethodReference shortcut syntax : ClassInstance::instanceMethodName");
		Thread t2 = new Thread(Ex1MethodReference::printMessage);
		t2.start();
	}

	static void printMessage() {
		System.out.println("Hello");
	}

}
