package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {

	}

	public void mainMenu() {

		while (true) {
			// MemberController(mc)클래스 안에 있는 멤버필드를 이용하여 최대 등록 가능한 회원 수가 몇 명인지 출력
			int memberNum = mc.existMemberNum();
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + memberNum + "명입니다.");

			if (memberNum != MemberController.SIZE) {
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");

			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			// 또한 현재 등록된 회원 수는 mc에 existMemberNum()의 반환 값으로 몇 명이 등록되어 있는지 출력

			// 현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
			// 현재 등록된 회원 수가 10명이 아닐 때
//      1. 새 회원 등록 ➔ insertMember()
//      2. 회원 검색 ➔ searchMember()
//      3. 회원 정보 수정 ➔ updateMember()
//      4. 회원 삭제 ➔ deleteMember()
//      5. 모두 출력 ➔ printAll()
//      9. 끝내기
//      메뉴 번호 : 
			switch (menuNum) {
			case 1:
				if (memberNum != MemberController.SIZE) {
					System.out.println("새 회원을 등록합니다.");
					insertMember();
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				}

			case 2:
				searchMember();
				break;

			case 3:
				updateMember();
				break;

			case 4:
				deleteMember();
				break;

			case 5:
				printAll();
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				break;
			}

			switch (menuNum) {

			case 2:
				searchMember();
				break;

			case 3:
				updateMember();
				break;

			case 4:
				deleteMember();
				break;

			case 5:
				printAll();
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}

		}
		// 현재 등록된 회원 수가 10명일 때
//      회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.
//      2. 회원 검색 ➔ searchMember()
//      3. 회원 정보 수정 ➔ updateMemner()
//      4. 회원 삭제 ➔ deleteMember()
//      5. 모두 출력 ➔ printAll()
//      9. 끝내기
//      메뉴 번호 :
		// 두 경우 모두 끝내기를 누르면 “프로그램을 종료합니다” 출력 후
		// 프로그램 종료하고 메뉴 번호에 없는 번호를 누를 시
		// “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 메뉴 반복

	}

	public void insertMember() {
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를 사용자에게 직접 입력 받되 아이디의 경우 기존 회원의 아이디와
		// 중복되지 않도록 mc의 checkId()메소드를 통해서 중복 검사를 함
		// 중복 검사를 한 결과 값에 따라 중복 값이 없으면 다음으로 넘어가고 있으면 “중복된 아이디입니다. 다시 입력해주세요.”라는 문구를 출력 후
		// 다시 아이디를 받도록 함
		System.out.print("아이디 : ");
		String id = sc.next();

		boolean isDup = mc.checkId(id);

		if (isDup) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요");
			insertMember();
			return;
		}

		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();

		// 성별의 경우 M이나 m, F나 f가 아니면 “성별을 다시 입력하세요.”를 출력 후 다시 성별을 입력하도록 함
		// 아이디부터 나이까지 모든 데이터를 받았으면 mc의 insertMember메소드의 매개변수로 넘김
		char gender = '\u0000';
		while (true) {
			System.out.print("성별(M/F) : ");
			gender = sc.next().toUpperCase().charAt(0);

			if (gender == 'M' || gender == 'F') {
				break;
			}
			System.out.println("성별을 다시 입력하세요.");
		}

		System.out.print("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, password, email, gender, age);
	}

	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴번호: ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			searchId();
			break;

		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			return;
		default:

		}
	}

//		1. 아이디로 검색하기 ➔ searchId()
//		2. 이름으로 검색하기 ➔ searchName()
//		3. 이메일로 검색하기 ➔ searchEmail()
//		9. 메인으로 돌아가기
//		메뉴 번호 :
	// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
	// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
	// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
	// mainMenu()로 돌아감

	// switch

	public void searchId(String id) {
		System.out.print("검색할 아이디 : ");
		String searchId = sc.next();

		String result = mc.searchId(searchId);

		if (result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	public void searchName(String name) {
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();

		Member[] result = mc.searchName(searchName);

		if (result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for (Member m : result) {
				System.out.println(m);
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	public void searchEmail() {

	}

	public void updateMember() {

	}

	public void updatePassword() {
		System.out.println("수정할 회원 id : ");
		String id = sc.next();

		System.out.print("수정할 회원 비밀번호 : ");
		String password = sc.next();

		boolean result = mc.updatePassword(id, password);
		if (result) {
			System.out.println("비밀번호 변경 성공");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void updateName() {

	}

	public void updateEmail() {

	}

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("번호 선택(1,2,9) : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			return;
		}

	}

	public void deleteOne() {
		System.out.print("삭제할 회원 아이디 : ");
		String id = sc.next();

		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0); // toUpperCase 대문자만

		if (ch != 'Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}

		boolean result = mc.deleteOne(id);
		if (result) {
			System.out.println("성공적으로 삭제하였습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0); // toUpperCase 대문자만

		if (ch != 'Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
		mc.delete();

	}

	public void printOne(Member result) {

	}

	public void printAll() {
		Member[] m = mc.printAll();
		int memberNum = mc.existMemberNum();
		if (memberNum == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}
		
		for(Member mem : m) {
			if(mem != null)
			System.out.println(mem);
		}
		
	}

}
