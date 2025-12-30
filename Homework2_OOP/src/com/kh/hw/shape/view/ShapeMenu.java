package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);

	private TriangleController tc = new TriangleController();

	private SquareController scr = new SquareController();

	public void inputMenu() {
		while (true) {
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
				break;
			}
		}
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
				printInformation(3);
				break;
			case 9:

				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			}

		}

	}

	public void squareMenu() {
		while (true) {
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레"); // inputSize
			System.out.println("2. 사각형 면적"); // inputSize
			System.out.println("3. 사각형 색칠"); // inputSize
			System.out.println("4. 사각형 정보"); // printInformation
			System.out.println("9. 메인으로"); // inputMenu

			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				inputSize(4, 1);
				break;
			case 2:
				inputSize(4, 2);
				break;
			case 3:
				inputSize(4, 3);
				break;
			case 4:
				printInformation(4);
				break;
			case 9:

				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
				break;
			}
		}
	}

	public void inputSize(int type, int menuNum) {

		if (type == 3) {

			switch (menuNum) {
			case 1:
				System.out.print("삼각형 높이 : ");
				int height = sc.nextInt();

				System.out.print("삼각형 너비 : ");
				int width = sc.nextInt();

				System.out.println("삼각형 면적 : " + tc.calcArea(height, width));

				break;

			case 2:

				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();

				tc.paintColor(color);
				System.out.println("색이 수정되었습니다");

				break;

			default:

				break;

			}
		} else if (type == 4) {
			switch (menuNum) {
			case 1:
			case 2:
				System.out.println("높이 : ");
				double height = sc.nextDouble();

				System.out.println("너비 : ");
				double width = sc.nextDouble();
				if (menuNum == 1) {
					System.out.println("사각형 둘레 :" + scr.calcPerimeter(height, width));
				} else if (menuNum == 2) {
					System.out.println("사각형 면적 : " + scr.calcArea(height, width));
				}

				break;
			case 3:
				System.out.println("색깔을 입력하세요 : ");
				String color = sc.next();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");

				break;
			default:

				break;
			}
		}

	}

	public void printInformation(int type) {
		if (type == 3) {
			System.out.println(tc.print());
		} else if (type == 4) {
			System.out.println(scr.print());
		}

	}

}