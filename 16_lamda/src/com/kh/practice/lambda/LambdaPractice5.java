package com.kh.practice.lambda;

import java.util.function.BiFunction;

public class LambdaPractice5 {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> op = getOperator("+");
		System.out.println(op.apply(10, 5));

		op = getOperator("*");
		System.out.println(op.apply(10, 5));
	}

	public static BiFunction<Integer, Integer, Integer> getOperator(String type) {
		// 이부분 코드 구현
		BiFunction<Integer, Integer, Integer> bi = null;

		switch (type) {
		case "+" -> bi = (a, b) -> a + b;
		case "-" -> bi = (a, b) -> a - b;
		case "*" -> bi = (a, b) -> a * b;
		case "/" -> bi = (a, b) -> a / b;
		case "%" -> bi = (a, b) -> a % b;
		default -> throw new RuntimeException("존재하지 않는 연산자 입니다.");
		
		}
		return bi;
	}
}
