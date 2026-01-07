package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
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
				System.out.println("잘못입력했습니다.");
			}
		}
	}

	public void selectAll() {
		Book[] bList = lc.selectAll();
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번도서 : " + bList[i]);
		}
	}

	public void searchBook() {
		// “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.next();

		// LibraryController의 searchBook() 에 전달
		Book[] searchBookList = lc.searchBook(keyword);
		for (Book b : searchBookList) {
			if (b != null)
				System.out.println(b);
		}

	}

	public void rentBook() {
		// 도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll() 메소드 호출
		selectAll();

		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
		// LibraryController의 rentBook() 에 전달

		if (result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");

		}
	}

}
