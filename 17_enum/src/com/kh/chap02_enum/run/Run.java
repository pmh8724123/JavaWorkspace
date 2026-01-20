package com.kh.chap02_enum.run;

import com.kh.chap02_enum.model._enum.CarColor;

public class Run {
	public static void main(String[] args) {
		System.out.println(CarColor.BLACK);
		System.out.println(CarColor.BLACK.getColor());
		System.out.println(CarColor.valueOf("BLACK"));
		System.out.println(CarColor.valueOf(0));
		System.out.println(CarColor.valueOf(2));
		// System.out.println(CarColor.valueOf(5)); // RuntimeException 발생
		CarColor.RED.printTest(); // 빨간색입니다.

	}
}
