package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
//		연도가 윤년이면 true, 평년이면	false 리턴
//		(윤년: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수가 되는 해)
		Calendar cal1 = new GregorianCalendar();
		int year1 = cal1.get(Calendar.YEAR);

		if (year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0) {
			return true;
		}

		return false;

	}

	public long leapDate(Calendar c) {
//		1년 1월 1일부터 오늘까지의 총 날 수를 계산
		Calendar past = new GregorianCalendar(1, 0, 1);// 과거시간
		past.set(1, 0, 1);
		
		Calendar now = Calendar.getInstance(); // 현재시간
		
		long num1 = past.getTimeInMillis();
		long num2 = now.getTimeInMillis();
		
		long diff = (num1 - num2);
		System.out.println(diff);
		
		return diff;
		
		
		
		
		
		
		
//		1년부터 현재 연도까지 각 연도가	윤년이면 총 날수에 366일을,평년이면 365일을 더함
		
//		해당 현재 연도가 윤년이면 2월을	29일로 평년이면 28일로 더함 
		
//		월의 날짜 수를 더함 
//		(31일: 1, 3, 5, 7, 8, 10, 12월/
//		30일: 4, 6, 9, 11월)
	}
}
