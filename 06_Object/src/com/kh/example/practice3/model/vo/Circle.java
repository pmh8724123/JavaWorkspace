package com.kh.example.practice3.model.vo;

public class Circle {
	private final static double PI = 3.14;
	private static int radius = 1;

	// 기본생성자
	public Circle() {

	}

	public void incrementRadius() {
		radius += 1;
//		getAreaOfCircle(); // 둘레 2 * PI * radius
//		getSizeOfCircle(); // 넓이 PI * radius * radius
//		radius++;
//		getAreaOfCircle(); // 둘레 2 * PI * radius
//		getSizeOfCircle(); // 넓이 PI * radius * radius
	}

	public void getAreaOfCircle() {
		// 원둘레
		System.out.println(2 * PI * radius);
	}

	public void getSizeOfCircle() {
		// 원넚이
		System.out.println(PI * radius * radius); 
	}

}