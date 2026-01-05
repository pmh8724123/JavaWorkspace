package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	// 현재 존재하는 멤버 수 반환
	public int existMemberNum() {

		int count = 0;

		for (Member mem : m) {
			// 객체가 초기화 된 경우
			if (mem != null) {
				count++;
			}
		}
		return count;
	}

	public boolean checkId(String inputId) {

		boolean isDup = false;
		for (Member mem : m) {
			// 객체배열에 저장된 Member객체의 id값과 사용자가 입력한 id값을 비교.
			if (mem != null && inputId.equals(mem.getId())) {
				isDup = true;
				break;
			}
		}
		return isDup;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		Member mem = new Member(id, name, password, email, gender, age);

		// 생성한 객체를 객체배열상 비어있는부분(null값인)에 저장
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) { // 빈공간
				m[i] = mem;
				break;
			}
		}

	}

	public String searchId(String id) {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchId() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력

		// Member객체 배열에서 id와 일치하는 회원의 정보를 찾은 후, 회원의 정보를 반환.
		for (Member mem : m) {
			if (mem != null && mem.getId().equals(id)) {
				return mem.toString(); // 회원정보 반환
			}
		}
		return null;
	}

	public Member[] searchName(String name) {
		Member[] m = new Member[SIZE];
		
		int index = 0;
		for(Member mem : this.m) {
			if(mem != null && mem.getName().equals(name)) {
				m[index++] = mem;
			}
		}
		// 찾고자 하는 회원이 한명도 없는 경우
		if(index == 0) {
			return null;
		}else {
			// 내가 찾은 회원이 1명인 경우 
			// [mem, null, null,null,null...]
			Member[] copy = Arrays.copyOf(m, index); // [mem, mem]
			return copy;
		}
	}
	

	public Member[] searchEmail(String email) {

		return;
	}

	public boolean updatePassword(String id, String password) {
		for (int i = 0; i < m.length; i++) {
			Member mem = m[i];
			if (mem != null && mem.getId().equals(id)) {
				mem.setPassword(password);
				return true;
			}

		}
		return false;
	}

	public boolean updateName(String id, String name) {

		return false;
	}

	public boolean updateEmail(String id, String email) {

		return false;
	}

	public boolean deleteOne(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i] = null; // 삭제처리
				return true; // 삭제완료
			}
		}
		return false;

	}

	public void delete() {
		// 전체 회원 삭제
		m = new Member[SIZE];
	}
	

	public Member[] printAll() {
		return m;
	}

}