package com.kh.practice.book.view;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;

	public BookMenu() {
		// 파일이 없을 때 만들어주기 위해 BookController(bc)에 makeFile() 호출
		// 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입
		bc.makeFile();
		bArr = bc.fileRead();
	}

	public void mainMenu() {
//		1. 도서 추가 저장 ➔ fileSave()
//		2. 저장 도서 출력 ➔ fileRead()
//		9. 프로그램 끝내기 ➔ “프로그램 종료” 출력 후 종료
//		메뉴 번호 :
		// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		while (true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}

	}

	public void fileSave() {
//			도서 명 :
//			저자 명 :
//			도서 가격 :
//			출판 날짜(yyyy-mm-dd) :
//			할인율 :
		// 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();

		System.out.print("도서 가격 : ");
		int price = sc.nextInt();

		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String date = sc.next();

		String[] arr = date.split("-");

		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);

		Calendar cal = new GregorianCalendar(year, month - 1, day);

		System.out.print("할인율 : ");
		double discount = sc.nextDouble();

		// 각 요소와 새로 만든 Calendar를 Book 객체에 담고
		Book b = new Book(title, author, price, cal, discount);

		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i] == null) {
				bArr[i] = b;
				break;
			}
		}
		bc.fileSave(bArr);

	}

	public void fileRead() {
		// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i] != null) {
				System.out.println(bArr[i]);
			}
		}
	}
}
