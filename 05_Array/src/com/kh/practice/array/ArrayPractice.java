package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int arr[] = new int[10];
		// [0,0,0,0,0,0,0,0,0,0]

		// 배열의 길이만큼 반복 진행
		// i=> 0
		// i=> 1
		// i=> 2 . . .
		// i=> 9
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] + " ");
		}

	}

	/*
	 * int[] arr = new int[10];
	 * 
	 * int value = 10;
	 * 
	 * for (int i = 0; i < arr.length; i++) { arr[i] = value--;
	 * System.out.print(arr[i] + " ");
	 * 
	 * }
	 */

	public void practice2() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num]; // [0,0,0,0,0]

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	/*
	 * System.out.print("양의 정수 : "); int num = sc.nextInt(); int value = 1;
	 * 
	 * if (num < 0) { return; }
	 * 
	 * int[] arr = new int[num];
	 * 
	 * for (int i = 0; i < arr.length; i++) { arr[i] = value++;
	 * System.out.print(arr[i] + " "); }
	 * 
	 * }
	 */

	public void practice3() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

	}
	/*
	 * int[] arr = new int[10];
	 * 
	 * for (int i = 0; i < arr.length; i++) {
	 * 
	 * arr[i] = (int) (Math.random() * 10 + 1); System.out.print(arr[i] + " "); }
	 * 
	 * }
	 */

	public void practice4() {
		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (!(num >= 0 && num <= 6)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(arr[num] + "요일");
	}

	public void practice5() {
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		System.out.println("총합 : " + sum);
	}

	public void practice6() {
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] arr = str.toCharArray();

		System.out.print("문자열에 있는 문자 : ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i]; // 중복인지 검사하고자 하는 문자.

			// 문자 중복 검사
			// 현재 위치에서 앞쪽의 단어들 중 현재단어와 일치하는 값이 있는지 확인.
			boolean isDup = false;
			for (int j = 0; j < i; j++) {
				if (ch == arr[j]) {
					// 중복
					isDup = true;
					break;
				}
			}
			if (!isDup) {
				System.out.print(ch + ", ");
				count++;
			}
		}
		System.out.println("\n문자 개수: " + count);

	}

	public void practice7() {
		System.out.print("문자열 : ");
		String str1 = sc.next();

		System.out.print("문자 : ");
		char str2 = sc.next().charAt(0);

		char[] arr = str1.toCharArray(); // ["a",

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == str2) {
				count++;
			}
		}
		String ch = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == str2) {
				ch += i + " ";
			}
		}

		System.out.println(str1 + "에 " + str2 + "가 존재하는 위치(인덱스) : " + ch);
		System.out.println(str2 + " 개수 : " + count);

	}

	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		String star = "******-*******";
		char[] origin = str.toCharArray();
		char[] copy = star.toCharArray();

		System.arraycopy(origin, 0, copy, 0, 8);
		
		System.out.println(copy);
	}
	
}
