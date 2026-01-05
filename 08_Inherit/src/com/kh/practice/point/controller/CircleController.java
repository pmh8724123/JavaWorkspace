package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {
//		1. setter 활용
//		c.setX(x);
//		c.setY(y);
//		c.setRadius(radius);
//		return "면적 : " + c + " / " + (Math.PI * radius * radius);

//	    2. 객체생성활용
		c = new Circle(x, y, radius);
		// 면적 : PI * 반지름 * 반지름
		double result = Math.PI * radius * radius;
		String str = c.toString();

		return "면적 : " + str + " / " + result;
	}

	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius); // 필드 초기화.
		// 둘레 : PI * 반지름 * 2
		double result = Math.PI * radius * 2;
		String str = c.toString();
		return "둘레" + str + " / " + result;
	}

}
