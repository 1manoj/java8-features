package com._1manoj.topic1lambda.basics;

public class Ex4TypeInferenceLambda {

	public static void main(String[] args) {

		Ex4TypeInferenceLambda typeInferenceLambda = new Ex4TypeInferenceLambda();

		lambdaInterface s1 = (String s) -> s.length();
		lambdaInterface s2 = (s) -> s.length();
		lambdaInterface s3 = s -> s.length();

		System.out.println(s1.getLength("Hello World"));
		System.out.println(s2.getLength("Hello World"));
		System.out.println(s3.getLength("Hello World"));
		System.out.println(typeInferenceLambda.getLength("Hello World"));
		System.out.println(typeInferenceLambda.getLengthLambda(s1));

	}

	public int getLength(String s) {
		return s.length();
	}

	public int getLengthLambda(lambdaInterface s) {
		return s.getLength("Hello World");
	}

	interface lambdaInterface {
		public int getLength(String s);
	}
}
