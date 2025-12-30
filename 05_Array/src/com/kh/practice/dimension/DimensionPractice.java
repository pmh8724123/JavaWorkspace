package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		String[][] arr = new String[3][3]; // 3행 3열 문자열 배열 선언 및 할당

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
//	출력결과
//	(0, 0)(0, 1)(0, 2)
//	(1, 0)(1, 1)(1, 2)
//	(2, 0)(2, 1)(2, 2)

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
//	출력결과
//	1 2 3 4 
//	5 6 7 8 
//	9 10 11 12 
//	13 14 15 16 

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
//	출력결과
//	16 15 14 13 
//	12 11 10 9 
//	8 7 6 5 
//	4 3 2 1 

//	4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//	아래의 내용처럼 처리하세요.

	public void practice4() {
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1); // 값 항목 난수
				arr[i][3] += arr[i][j]; // 0행의 합
				arr[3][j] += arr[i][j]; // 0열의 합
				arr[3][3] += arr[i][j] * 2; // 0행0열의 합
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
//	출력결과
//	5 3 2 10 
//	2 9 1 12 
//	1 1 10 12 
//	8 13 13 68 

//		★★★★★★★★★★★★(직접한거) 
//		/*int[][] arr = new int[4][4];
//		// 초기화 담당 1번
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				arr[i][j] = (int) (Math.random() * 10 + 1);
//			}
//		}
//		// 행의 합 2번
//		for (int i = 0; i < arr.length - 1; i++) {
//			int sum = 0;
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				sum += arr[i][j];
//			}
//			arr[i][3] = sum;
//		}
//
//		// 열의 합 3번
//		for (int i = 0; i < arr.length - 1; i++) {
//			int sum = 0;
//			for (int j = 0; j < arr[i].length - 1; j++) {
//				sum += arr[j][i];
//			}
//			arr[3][i] = sum;
//		}
//
//		// 가로 총합 담당 4번
//		int sum = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			sum += arr[i][3]; //
//		}
//
//		// 세로 총합 담당 5번
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			sum += arr[3][i]; // 50 21 18 11 100
//		}
//		// 가로세로 담당 6번
//		arr[3][3] += sum;
//
//		// 출력담당 7번
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//	}*/
//	출력결과 (난수라 출력시마다 다름)
//	6 6 5 17 
//	2 3 7 12 
//	3 3 1 7 
//	11 12 13 72 

//	2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
//	“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
//	크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
//	(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)

	public void practice5() {
		// 정수 입력 담당
		System.out.print("행 크기 : ");
		int row = sc.nextInt();

		System.out.print("열 크기 : ");
		int col = sc.nextInt();

		if (!(1 <= row && row <= 10 && 1 <= col && col <= 10)) {
			System.out.println("반드시 1~10사이의 정수를 입력해야합니다.");
			practice5();
			return;
		}

		char[][] arr = new char[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char)(int)(Math.random() * 26 + 65);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
//	출력결과
//	행 크기 : 5
//	열 크기 : 4
//	T M Q Y 
//	D Y P O 
//	Y H G Q 
//	J A G F 
//	Y D S O 
}
