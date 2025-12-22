package com.kh.chap01.ControlPractice;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.print("입력");
			break;
		case 2 :
			System.out.print("수정");
			break;
		case 3 :
			System.out.print("조회");
			break;
		case 4 :
			System.out.print("삭제");
			break;
		case 7 :
			System.out.print("프로그램이 종료됩니다.");
			return;
			// 메서드 내 어디서든 사용가능
			// 현재 위치에서 매서드를 "종료"시키는 키워드
			// break;
		}
		System.out.println(" 메뉴입니다.");
	}
		/*
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("조회"+"메뉴입니다.");
		}else if (num == 2) {
			System.out.println("수정"+"메뉴입니다.");
		}else if (num == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if (num == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else if (num == 7) {
			System.out.println("종료 메뉴입니다.");
		}else {
			System.out.println("기타");
		}
		*/
		
		
	
	
	public void practice2() {
		
		System.out.print("숫자를 한 개 입력하세요  : ");
		int num = sc.nextInt();
		
		
		//양수인지 아닌지
		// 가드조건문
		// - 조건을 만족하지 않으면 즉시 종료하는 패턴
		if(!(num > 0)) {
			System.out.println("양수만 입력하세요");
			return;
		}
		// 홀수인지 짝수인지
		if(num % 2 == 1) {
			System.out.println("홀수다");
		}else {
			System.out.println("짝수다");
		}
			
	}
		//중첩 if문 구조
		
		/*if (num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		} else if (num % 2 == 1){
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	*/
	public void practice3() {
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("국어 : ");
		int math = sc.nextInt();
		
		System.out.print("국어 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(!(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60)) {
			System.out.println("불합격 입니다.");
			return;
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("축하합니다, 합격입니다!");
		
		/*System.out.println("ex 1.");
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		System.out.println("합계 : " + sum);
		double avg = sum/3;
		System.out.println("평균 : " + avg);
		if(kor >= 40 && eng >= 40 && math >= 40	&& avg >= 60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println("ex 2.");
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum/3;

		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
		*/
	}
	
	public void practice4() {
		
		System.out.print("1 ~ 12사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		String season = "";
		switch(num) {
		case 1 , 2 , 12 :
			season = "겨울";
			break;
		case 3 , 4 , 5 :
			season = "봄";
			break;
		case 6 , 7 , 8 :
			season = "여름";
			break;
		case 9 , 10 , 11 :
			season = "가을";
			break;
		default :
			season = "해당하는 계절이 없습니다.";
			System.out.println(num+"월은 잘못 입력된 달입니다.");
			return;
		}
		System.out.println(num+"월은 "+season+"입니다.");
		
		/*System.out.println("ex 1.");
		System.out.print("1~12 사이의 정수 입력 : ");
		
		int month = sc.nextInt();
		String season = "";
		switch(month) {
		case 12 : case 1 : case 2 :
			season = "겨울";
			break;
		case 3 : case 4 : case 5 :
			season = "봄";
			break;
		case 6 : case 7 : case 8 :
			season = "여름";
			break;
		case 9 : case 10 : case 11 :
			season = "가을";
			break;
			default :
				System.out.println(month+"은 잘못 입력된 달입니다.");
		}
		System.out.println(month+"월은"+ season +"입니다.");
		*/
		}
	
	public void practice5() {
		String realId = "moomoo";
		String realPwd = "Moo1234";
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("PW : ");
		String pwd = sc.next();
		
		if(!id.equals(realId)) {
			System.out.println("아이디가 틀렸다");
			return;
		}
		
		if(!pwd.equals(realPwd)) {
			System.out.println("비밀번호가 틀렸다");
			return;
		}
		
		System.out.println("로그인 성공");
	
	}
	
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String A1 = sc.next();
		String B1 = "회원관리";
		String B2 = "게시글 관리 게시글 작성";
		String B3 = "댓글 작성 게시글 조회";
		
		switch (A1) {
		case "관리자" :
			System.out.println(B1+", "+B2+", "+B3);
			break;
		
		case "회원" :
			System.out.println(B2+", "+B3);
			break;
			
		case "비회원" :
			System.out.println(B3);
			break;
			
		default :
			System.out.println("X");
		}
	}
	
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double num1 = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double num2 = sc.nextDouble();
		
		double result = num2 / (num1 * num1);
		System.out.println("BMI 지수 : "+result);
		
		if (result <= 18.5 && result > 0){
			System.out.println("저체중");
		}else if(result >= 18.5 && result < 23.0) {
			System.out.println("정상체중");
		}else if(result >= 23.0 && result < 25.0) {
			System.out.println("과체중");
		}else if(result >= 25.0 && result < 30.0) {
			System.out.println("비만");
		}else if(result > 30.0) {
			System.out.println("고도 비만");
		}else {
			System.out.println("오류");
		}
		
		
	}
	
	public void practice8() {
		
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		int operate = sc.nextInt();
		
		double result = num1 + operate + num2;
		
		if (result > 0 && operate == '+') {
			
		}
		
		System.out.println(result);
		
		
	}
}

