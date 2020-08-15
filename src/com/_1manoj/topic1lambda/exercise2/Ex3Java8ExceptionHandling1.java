package com._1manoj.topic1lambda.exercise2;

import java.util.function.BiConsumer;

public class Ex3Java8ExceptionHandling1 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int key = 3;

		/*
		 * This is just for Addition.
		 */
		performAddition(arr, key);

		/*
		 * Above is just for Addition. What-if, you need to perform Subtraction, in that
		 * case, Multiplication or Division ?
		 * 
		 * Lets create a Lambda Function which takes a action to be performed.
		 */
		System.out.println("\n\nAddition via Lambda: ");
		performActionLambda(arr, key, (K, V) -> System.out.println(K + V));

		System.out.println("\n\nSubtraction via Lambda: ");
		performActionLambda(arr, key, (K, V) -> System.out.println(K - V));
		
		System.out.println("\n\nMultiplication via Lambda: ");
		performActionLambda(arr, key, (K, V) -> System.out.println(K * V));

		System.out.println("\n\nDivision via Lambda: ");
		performActionLambda(arr, key, (K, V) -> System.out.println(K / V));

	}

	static void performAddition(int[] arr, int key) {
		for (int i : arr) {
			System.out.println(i + key);
		}
	}

	static void performActionLambda(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : arr) {
			consumer.accept(i, key);
		}
	}
}
