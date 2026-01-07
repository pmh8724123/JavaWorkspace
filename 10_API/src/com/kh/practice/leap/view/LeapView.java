package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController lc = new LeapController();

	public LeapView() {
//		기본생성자로 이 안에 평년인지 윤년인지,
		Calendar cal1 = new GregorianCalendar();
		int year1 = cal1.get(Calendar.YEAR);
		
		boolean result = lc.isLeapYear(year1);
		char ch = '';
		
		if(result == true) {
			result = "윤";
		}
		result = lc.isLeapYear(0);

		System.out.println(year1 + "년은 " + lc.isLeapYear(year1) + "입니다.");
//		1년 1월 1일부터 지금까지 며칠이 지났는지 모두 출력
		System.out.println("총 날짜 수 : " + lc.leapDate(null));

	}
}
