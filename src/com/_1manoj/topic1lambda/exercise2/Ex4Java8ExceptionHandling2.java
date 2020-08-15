
package com._1manoj.topic1lambda.exercise2;

import java.util.function.BiConsumer;

public class Ex4Java8ExceptionHandling2 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int key = 0;

//		  This works perfect. but Suppose now the Key itself is 0, in that case, it
//		  would throw an ArithmeticException: / by zero
//		  
//		  Now we have to handle this exception to let our program to progress further.
//		  
//		  There are multiple ways to do so,
//		  Way_1 > We can handle Exception in Lambda Function
//					Problem > We cannot keep on adding multiple catch blocks for infinite times.
//		  Way_2 > We can handle Exception in Calling Function itself.
//					Problem > It defeats the purpose of Lambda, it suppose to oneliner and easy to understand.
//		  Way_3 > We can handle Exception in another Lambda Function which will act as a WrapperLambda Function
//					BENEFIT > If we are using Lambda from some imported Library/JAR, obviously we cannot change its implementation.
//							  But we can create a Wrapper to implement the behaviour as per our requirement.
//		  Way_4 > We can handle Exception in Lambda Function in many other ways.....

		System.out.println("\n\nDivision via Lambda: ");
//		Way_2 > We can handle Exception in Calling Function itself.
//		performActionLambda(arr, key, (K, V) -> {
//			try {
//				System.out.println(K / V);
//			} catch (ArithmeticException e) {
//				System.out.println("handle ArithmeticException in Anonymous Class/Block...");
//			}
//		});

		performActionLambda(arr, key, wrapperLambda((K, V) -> System.out.println(K / V)));

	}

	static void performActionLambda(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : arr) {
			consumer.accept(i, key);
		}
	}

//	Way_3 > We can handle Exception in another Lambda Function which will act as a WrapperLambda Function
//	static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
//		return (K, V) -> {
//			try {
//				consumer.accept(K, V);
//			} catch (ArithmeticException e) {
//				System.out.println("handle ArithmeticException in wrapperLambda()...");
//			}
//		};
//	}

	static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (K, V) -> {
			try {
				consumer.accept(K, V);
			} catch (ArithmeticException e) {
				System.out.println("handle ArithmeticException in wrapperLambda()...");
			}
		};
	}

//	Way_1 > We can handle Exception in Lambda Function
//	static void performActionLambda(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
//		for (int i : arr) {
//			try {
//				consumer.accept(i, key);
//			} catch (ArithmeticException e) {
//				System.out.println("handle ArithmeticException in performActionLambda()...");
//			}
//		}
//	}
}
