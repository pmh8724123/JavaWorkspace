package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
// 멤버 변수
	Shape s;

	public double calcArea(double height, double width) {

		// 매개변수로 넘어온 값을 Shape의 매개변수 있는 생성자에 넣어 Shape의 필드들 초기화하고
		s = new Shape(3, height, width);

		// 면적 계산법을 통해 계산된 값 반환
		double result = height * width / 2;
		return result;
	}

	public void paintColor(String color) {
		// setter를 통해 매개변수로 넘어온 값으로 변경
		s.setColor(color);
	}

	public String print() {

		String value = s.information();
		return value;
	}

}