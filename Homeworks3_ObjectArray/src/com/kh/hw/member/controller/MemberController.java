package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];

	// 현재 존재하는 멤버 수 반환
	public int existMemberNum() {

		int num = 0;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				num++;
			}
		}
		return num;
	}

	public boolean checkId(String inputId) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				String id = m[i].getId();
				if (id == inputId) {
					return true;
				}
			}
		}
		return false;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		Member mb = new Member(id, name, password, email, gender, age);
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = mb;
				return;
			}
		}

	}

	public Member searchId(String id) {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchId() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력
		for (int i = 0; i < m.length; i++) {
			String getId = m[i].getId();
			
			if(getId.equals(id))
			{
				return m[i]; // arr, brr, crr, ( arr -> id : dodle , name : 도헌 ..)
			}
		}
		
		return null;
	}

	public Member[] searchName(String name) {
		
		Member[] mArr = new Member[10];
		
		for (int i = 0; i < m.length; i++) {
			String getName = m[i].getName();
			
			if(getName.equals(name))	// arr, brr, crr 
			{
				mArr[i] = m[i];
			}
		}
		return mArr;
	}

	public Member[] searchEmail(String email) {

		return;
	}

	public boolean updatePassword(String id, String password) {

		return false;
	}

	public boolean updateName(String id, String name) {

		return false;
	}

	public boolean updateEmail(String id, String email) {

		return false;
	}

	public boolean delete(String id) {

		return false;
	}

	public void delete() {

	}

	public Member[] printAll() {

		for(int idx = 0 ; idx < m.length; idx++) {
			if(m[idx] != null) {
				return m;
			}
		}
		return null;
	}

}