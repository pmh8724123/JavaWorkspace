package com.kh.operator.func;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남는 사탕 개수 : " + (num2 % num1));

	}

	public void practice2() {

		System.out.print("이름 : " );
		String name = sc.next();

		System.out.print("학년(숫자만) : ");
		int num1 = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int num2 = sc.nextInt();

		System.out.print("번호(숫자만) : " );
		int num3 = sc.nextInt();

		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		String result = gender == 'M' ? "남학생" : "여학생";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double num4 = sc.nextDouble();

		System.out.println(num1 + "학년 " + num2 + "반 " + num3 + "번 " + name + result + "의 성적은 " + num4 + "이다.");

	}

	public void practice3() {
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String str = age <= 13 ? "어린이" :
			                     (age <= 19 ? "청소년" : "성인");
		System.out.println(str);
				
	}
	
	public void practice4() {
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		System.out.println(
				kor >= 40 && eng >= 40 && math >= 40
				&& avg >= 60.0 ? "합격" : "불합격"
				);
		
		
		
	}
	
	public void practice5() {
		System.out.println("주민번호를 입력하세요(-포함) : ");
		String str = sc.next();
		char gender = str.charAt(7); // 1남 | 2여
		System.out.println(gender == '1' || gender == '3'
				? "남자" : "여자");
		
		
	}
	
	public void practice6() {
		
	System.out.print("정수1 : ");
	int num1 = sc.nextInt();
	
	System.out.print("정수2 : ");
	int num2 = sc.nextInt();
	
	System.out.print("입력 : ");
	int result = sc.nextInt();
	System.out.println(
			(result <= num1) ||
				(result >= num2) ?
					"true" : "false"
			); 
	
	}
	
	public void practice7() {
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
				
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result =
				num1 == num2 &&
				num2 == num3;
		
		System.out.println(result ? "true" : "false");
				
		
	}
	
	public void practice8() {
		
		System.out.print("A사원의 연봉 : ");
		int Anum = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int Bnum = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int Cnum = sc.nextInt();
		
		double result1 = Anum * 1.4;
		System.out.println("A사원의 연봉/연봉+a : "
				+ Anum + "/" + result1 + 
					"\n" + 
						(result1 >= 3000 ? "3000 이상" : "3000 미만")
							);
		
		double result2 = Bnum * 1.0;
		System.out.println("B사원의 연봉/연봉+a : "
				+ Bnum + "/" + result2  
					+"\n"+ 
						(result2 >= 3000 ? "3000 이상" : "3000 미만")
							);
		
		double result3 = Cnum * 1.15;
		System.out.println("B사원의 연봉/연봉+a : "
				+ Cnum + "/" + result3  
					+"\n"+ 
						(result3 >= 3000 ? "3000 이상" : "3000 미만")
							);
		
	}
}