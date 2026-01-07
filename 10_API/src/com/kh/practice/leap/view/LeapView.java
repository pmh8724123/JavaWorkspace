package com.kh.practice.leap.view;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController lc = new LeapController();

	public LeapView() {
//		기본생성자로 이 안에 평년인지 윤년인지,
//		1년 1월 1일부터 지금까지 며칠이 지났는지 모두 출력
		int year = 2026;
		System.out.println(year +"년은"+ (lc.isLeapYear(year) == true ? "윤년" : "평년") + "입니다.");
		System.out.println("총 날짜 수 : "+lc.leapDate());
		// [결과값]
		// 2026년은 평년입니다.
		// 총 날짜 수 : 739125

	}
}
