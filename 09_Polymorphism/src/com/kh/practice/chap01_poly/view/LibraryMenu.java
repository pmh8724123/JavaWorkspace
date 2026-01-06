package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후
		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);

		// Member 객체 생성
		Member mem = new Member(name, age, gender);

		// LibraryController의 insertMember() 메소드에 전달
		lc.insertMember(mem);
		

//		 ==== 메뉴 ==== // 무한 반복 실행
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
//		1. 마이페이지 
//		2. 도서 전체 조회 
//		3. 도서 검색 
//		4. 도서 대여하기 
//		9. 프로그램 종료하기
//		메뉴 번호 : 

			switch (menu) {
			case 1:
				// LibraryController의 myInfo() 호출하여 출력
				System.out.println(lc.myInfo());
				break;
			case 2:
				// LibraryMenu의 selectAll() 호출
				selectAll();
				break;
			case 3:
				// LibraryMenu의 searchBook() 호출
				searchBook();
				break;
			case 4:
				// LibraryMenu의 rentBook() 호출
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				break;
			}
		}
	}

	public void selectAll() {
		// LibraryController의 selectAll()메소드 호출하여 결과 값 Book[] 자료형 bList에 담기
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
		// ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
	}

	public void searchBook() {

	}

	public void rentBook() {

	}

}
