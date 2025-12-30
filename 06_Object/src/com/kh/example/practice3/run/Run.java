package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.getAreaOfCircle(); // 원둘레 출력
		c.getSizeOfCircle(); // 원 넓이 출력
		
		c.incrementRadius(); // 반지름 1 증가 
		
		c.getAreaOfCircle(); // 원둘레 출력
		c.getSizeOfCircle(); // 원 넓이 출력
		
	}
}
