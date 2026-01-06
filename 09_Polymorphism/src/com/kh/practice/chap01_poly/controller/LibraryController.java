package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null; // null로 명시초기화
	private Book[] bList = new Book[5]; // 크기 5 할당

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member myInfo() {
		 
		return  mem;
	}

	public Book[] selectAll() {

		return null;
	}

	public Book[] searchBook(String keyword) {

		return null;
	}

	public int rentBook(int index) {

		return 0;
	}

}
