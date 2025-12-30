package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);

	private SquareController scr = new SquareController();

	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형"); // inputSize
		System.out.println("4. 사각형"); // inputSize
		System.out.println("9. 프로그램 종료"); // return

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();

		switch (menuNum) {
		case 3:
			triangleMenu();
			break;
		case 4:
			squareMenu();
			break;
		case 9:
			System.out.println("프로그램 종료");
			return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
		
		}

	public void triangleMenu() {
		while (true) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적"); // inputSize
			System.out.println("2. 삼각형 색칠"); // inputSize
			System.out.println("3. 삼각형 정보"); // inputSize
			System.out.println("9. 메인으로"); // inputMenu

			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				inputSize(3, 1);
				break;
			case 2:
				inputSize(3, 2);
				break;
			case 3:
				inputSize(3, 3);
				break;
			case 9:
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			}
		}

	}

	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레"); // inputSize
		System.out.println("2. 사각형 면적"); // inputSize
		System.out.println("3. 사각형 색칠"); // inputSize
		System.out.println("4. 사각형 정보"); // printInformation
		System.out.println("9. 메인으로"); // inputMenu

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();

		if (!(menuNum == 1 || menuNum == 2 || menuNum == 3 || menuNum == 4 || menuNum == 9)) {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			squareMenu();
			if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
			}
		}
	}

	public void inputSize(int type, int menuNum) {
		System.out.println("===== 삼각형 =====");
	}

	public void printInformation(int type) {

	}

}
