package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		String[][] arr = new String[3][3]; // 3행 3열 문자열 배열 선언 및 할당

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}

	}

//	4행 4열짜리 정수형 배열을 선언 및 할당하고
//	1) 1 ~ 16까지 값을 차례대로 저장하세요.
//	2) 저장된 값들을 차례대로 출력하세요.
	public void practice2() {
		int[][] arr = new int[4][4];
		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

//	4행 4열짜리 정수형 배열을 선언 및 할당하고
//	1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//	2) 저장된 값들을 차례대로 출력하세요
	public void practice3() {
		int[][] arr = new int[4][4];
		int value = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

//	4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//	아래의 내용처럼 처리하세요.
	public void practice4() {
		int[][] arr = new int[4][4];
		int value = (int) (Math.random() * 10 + 1);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr)
			}
		}
	}
}
