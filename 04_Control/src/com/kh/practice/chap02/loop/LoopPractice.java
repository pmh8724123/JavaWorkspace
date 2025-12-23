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
			char ch = sc.next().charAt(0);
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			if (!(num2 > 0 || ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%')) {
				System.out.println("없는 연산자입니다. 다시 입력");
			}
			return;

		}

	}
}
