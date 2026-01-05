package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
//		학생은 최대 3명까지 저장할 수 있습니다.
//		현재 저장된 학생은 M명입니다.
		int[] arr = pc.personCount();
		int M = arr[0]; 
		int N = arr[1];
		System.out.println("학생은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 "+M+"명입니다.");
//		사원은 최대 10명까지 저장할 수 있습니다.
//		현재 저장된 사원은 N명입니다.
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 "+N+"명입니다.");
//		// M과 N에 들어가는 숫자는 PersonController(pc)클래스에 있는
//		// personCount()메소드의 반환 값을 이용하여 출력

//		1. 학생 메뉴 ➔ studentMenu()
//		2. 사원 메뉴 ➔ employeeMenu()
//		9. 끝내기 ➔ “종료합니다.” 출력 후 종료
//		메뉴 번호 :
//		// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복

	}

	public void studentMenu() {

	}

	public void employeeMenu() {

	}

	public void insertStudent() {

	}

	public void printStudent() {

	}

	public void insertEmployee() {

	}

	public void printEmployee() {

	}

}
