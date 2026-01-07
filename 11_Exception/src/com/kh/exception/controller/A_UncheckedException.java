package com.kh.exception.controller;

import java.util.Scanner;

public class A_UncheckedException {
	
	Scanner sc = new Scanner(System.in);
	/*
	 * UncheckedException
	 *  - RuntimeException처럼 프로그램 실행시 발생되는 예외들이 대표적인 Unchecked Exception계열의 예외들이다.
	 *  
	 *  - RuntimeException의 자식 클래스들
	 *    1. ArrayIndexOutOfBoundsException
	 *    2. NegativeArraySizeException
	 *    3. ClassCastException
	 *        - 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 *        - ex) p1이 Child2객체로 생성된 참조변수일 때,
	 *        		(Child) p1 등을 수행하는 경우
	 *    4. NullPointerException
	 *    	  - 참조변수가 null인 상황에서 특정 메서드 및 필드에 접근하려고 할 때 발생하는 예외
	 *    5. ArithmeticException
	 *    ...
	 *    
	 * => 이러한 RuntimeException과 관련한 예외는 충분히 예측가능한 상황이다.
	 * 	  예외 처리가 애초에 발생이 안되게끔, 대부분 조건문으로 해결이 가능하다.
	 *    즉, 굳이 예외처리(예외처리코드들)를 할 필요가 없다는 의미.
	 * */
	
	public void method1() {
		// ArithmeticException
		// - 나누기 연산시 0으로 나눌 때 발생

		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();

		System.out.println("두 번째 정수: ");
		int num2 = sc.nextInt();

		// 예외처리 방법 1) 조건문으로 애초에 예외가 발생하지 않게끔 처리한다. -> 에러가 안나게 하는 방법
//		if (num2 == 0) {
//			System.out.println("0으로 나눌 수 없습니다..");
//		} else {
//			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
//		}
		// 예외처리 방법 2) try~catch문으로 해결하기
		/*
		 * try ~ catch문
		 *  - 예외가 발생했을 경우를 대비해서 실행할 내용을 정의해 두는 문법
		 * [표현법]
		 * try {
		 * 	 // 예외가 발생할 수 있는 코드
		 * } catch(발생될 수 있는 예외 클래스) {
		 *   // 해당예외가 발생 시 실행할 구문.
		 * }
		 *  
		 * */
		try {
			// ArithmeticException이 발생할 수 있는 코드.
			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); // 오류를 로그로 출력하는 기능
		}
		
		System.out.println("프로그램 종료");

	}
}
