package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		while (true) {
			System.out.print("1이상의 숫자를 입력 : ");
			int num = sc.nextInt();

			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}

			if (num > 0) {
				break;
			}
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}

	public void practice2() {

		System.out.print("1이상의 숫자를 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			System.out.print(i + " ");
		}

		if (num <= 0) {
			System.out.println("1이상의 숫자를 입력해주세요");
			practice2();
		}

	}

	public void practice3() {

		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i; // 1부터 정수까지의 합
			System.out.print(i + (i != num ? " + " : " = "));
		}
		System.out.println(sum);
	}

	public void practice4() {

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (!(num1 > 0 && num2 > 0)) {
			System.out.println("1이상의 수를 입력해주세요.");
			practice4();
			return;
		}

		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;

		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}

	}

	public void practice5() {
		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num > 9) {
				System.out.println("9이하의 숫자만 입력해주세요.");
				continue;
			}

			for (int dan = num; dan <= 9; dan++) {
				System.out.println("======" + dan + "단  ======");
				for (int i = 1; i <= 9; i++) {
					System.out.println(dan + " X" + i + " =" + (dan * i));
				}

			}

		}
	}

	public void practice6() {
		System.out.print("시작 수 ");
		int num = sc.nextInt();

		System.out.print("공차 : ");
		int gong = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(num + " ");
			num += gong;
		}

	}

	public void practice7() {
		while (true) {
			System.out.print("연산자 : ");
			String str = sc.next();
			char ch = str.charAt(0);
			
			if(str == 'exit') {
				System.out.println("프로그램 종료");
			}
			
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			if(num2 == 0 && ch == '/' || ch == '%') {
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			}
			
			switch(ch) {
			case '+':
				System.out.println(num1 + ch + num2+" = "+ (num1+num2));
				break;
				
			case '+'
			
			break;
			
			case '-'
			
			break;
			
			case '*'
			
			break;
			
			
			case '/'
			
			break;
			
			case '%'
			
			break;

			}
		}

	}

	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int j = 1; j < num + 1; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int j = num; j > 0; j--) {
			for (int i = num; i > 0; i--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice10() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		// 소수는 1부터 n까지 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수
		// num = 5

		boolean isPrime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("소수가 아닙니다.");
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("소수입니다.");
		}
	}

	public void practice11() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		// 외부반복문 : 2~ 내가 입력한 값까지 반복.
		// 내부반복문 : 현재 값이 소수인지 아닌지 판단.

		// num = 5;

		int count = 0;
		// i -> 2,3,4,5
		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				System.out.print(i + " ");
			}
		}

		System.out.println("\n2부터 " + num + "까지 소수의 개수는 " + count + "개 입니다.");

	}

	public void practice12() {

		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			// 1. 2 혹은 3의 배수이면 출력.
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			// 2. 2와3의 공배수이면 갯수 카운팅
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}

		}
		System.out.println("\n count : " + count);

	}
}
