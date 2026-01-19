package com.kh.practice.lambda;

public class LambdaPractice2 {
	public static void main(String[] args) {
		Calculator<Integer> adder = (x, y) -> x * y;
		System.out.println(adder.operate(10, 20));

		Calculator<Integer> findMax = Math::max; // (x, y) -> Math.max(x, y);
		System.out.println(findMax.operate(10, 20));

		Calculator<String> combiner = (str1, str2) -> str1 + "-" + str2;
		System.out.println(combiner.operate("hello", "world"));

	}

	interface Calculator<V> {
		V operate(V v1, V v2);
	}
}
