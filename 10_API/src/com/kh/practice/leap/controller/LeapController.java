package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
//		연도가 윤년이면 true, 평년이면	false 리턴
//		(윤년: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수가 되는 해)
		Calendar cal1 = new GregorianCalendar();
		int year1 = cal1.get(Calendar.YEAR);

		if (year1 % 4 == 0 && (year1 % 100 != 0 || year1 % 400 == 0)) {
			return true;
		}
		return false;
	}

	public long leapDate() {
//		1년 1월 1일부터 오늘까지의 총 날 수를 계산
//		1년부터 현재 연도까지 각 연도가	윤년이면 총 날수에 366일을,평년이면 365일을 더함
//		해당 현재 연도가 윤년이면 2월을	29일로 평년이면 28일로 더함 
//		월의 날짜 수를 더함 
//		(31일: 1, 3, 5, 7, 8, 10, 12월
//		30일: 4, 6, 9, 11월)

		Calendar past = new GregorianCalendar(1, 0, 1);
		Calendar now = Calendar.getInstance(); // 현재시간

		long num1 = past.getTimeInMillis(); // 1년1월1일 ~ 1970년1월1일
		long num2 = now.getTimeInMillis(); // 1970년1월1일 ~ 2026년1월7일

		long total = (num2 - num1);

		int result = 0;

		for (int i = 1; i < now.get(Calendar.YEAR); i++) {
			if (this.isLeapYear(i)) {
				result += 366;
			} else {
				result += 365;
			}
		}
		return result;
	}
		// 강사님 코드
//		long total = 0;
//		for(int i = 1; i<c.get(Calendar.YEAR); i++) {
//			if(isLeapYear(i)) {
//				total += 366;
//			}else {
//				total += 365;
//			}
//			
//		}
//		int month = c.get(Calendar.MONTH);
//		for(int i = 0; i < month; i++) {
//			switch(i) {
//			case 1 , 3, 5, 7, 8, 10, 12 :
//				total += 31;
//				break;
//			case 4, 6, 9, 11 :
//				total += 30;
//				break;
//			case 2 :
//				total += isLeapYear(c.get(Calendar.YEAR)) ? 29 : 28;
//				break;
//			}
//		}
//		int date = c.get(Calendar.DATE);
//		total += date;
//		
//		return total;
	}
