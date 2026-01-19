package com.kh.practice.lambda;

public class LambdaPractice1 {
	public static void main(String[] args) {
		String[] arr = { "java", "lambda", "hi", "functional", "wow" };
		printStrings(arr, (str) -> str.length() <= 3);
		printStrings(arr, (str) -> str.contains("a"));
		printStrings(arr, (str) -> str.startsWith("w"));
		printStrings(arr, (str) -> (str.contains("a") && (str.length() % 2 == 0)));

	}

	public static void printStrings(String[] arr, StringChecker checker) {
		for (String str : arr) {
			if (checker.check(str)) {
				System.out.println(str);
			}
		}
	}

	@FunctionalInterface
	interface StringChecker {
		boolean check(String str);
	}

}
