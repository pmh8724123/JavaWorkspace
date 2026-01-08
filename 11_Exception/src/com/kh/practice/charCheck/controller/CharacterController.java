package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {

	}

	public int countAlpha(String s) throws CharCheckException {
		// 1. 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 2. 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고.
		// 체크할 문자열 안에 공백이 포함되어 있습니다.

		if (s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다");
		}
		char[] arr = s.toUpperCase().toCharArray();
		int count = 0;
		for (char ch : arr) {
			// 각 문자가 영문자인지 검사.
			// 'A' , 'Z'
			if (ch >= 'A' && ch <= 'Z') {
				count++;
			}
		}
		return count;
	}

}
