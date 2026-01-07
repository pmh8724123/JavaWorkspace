package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null; // null로 명시초기화
	private Book[] bList = new Book[5]; // 크기 5 할당

	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member myInfo() {

		return mem;
	}

	public Book[] selectAll() {

		return bList;
	}

	public Book[] searchBook(String keyword) {
		// 검색 결과를 담아줄 새로운 Book 객체 배열 생성
		// 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당

		Book[] searchBookList = new Book[5];

		int index = 0;
		for (Book b : bList) {
			if (b.getTitle().contains(keyword)) {
				// keyword가 포함된 도서.
				searchBookList[index++] = b;

			}
		}

		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		// 전달받은 keyword를 포함하고 있으면 → HINT : String 클래스의 contains() 참고
		// 검색결과의 도서목록에 담기 → HINT : count 이용

		// 해당 검색결과의 도서목록 주소 값 리턴

		return bList;
	}

	public int rentBook(int index) {
		int result = 0;

		Book b = bList[index];
		if (b instanceof AniBook && mem.getAge() < ((AniBook) b).getAccessAge()) {
			result = 1;
		}
		
		else if (b instanceof CookBook && ((CookBook)b).isCoupon()) {
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;
		}
		return result;
	}

}
