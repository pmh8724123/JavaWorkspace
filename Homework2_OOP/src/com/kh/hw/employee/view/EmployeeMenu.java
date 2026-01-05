package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.model.vo.Employee;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	// 메인 메뉴를 출력하는 기 본 생성자
	public EmployeeMenu() {
		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");

			// 메뉴 번호를 누르세요 :
			System.out.print("메뉴 번호를 누르세요 : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				//// 1. 사원 추가 ==> insertEmp()
				insertEmp();
				break;

			case 2:
				// 2. 사원 수정 ==> updateEmp()
				updateEmp();
				break;

			case 3:
				// 3. 사원 삭제 ==> deleteEmp()
				deleteEmp();
				break;

			case 4:
				// 4. 사원 출력 ==> printEmp()
				printEmp();
				break;

			case 9:
				// 9. 프로그램 종료 ==> “프로그램을 종료합니다.” 출력 후 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				return;

			// 번호를 잘못 입력했으면 잘못 입력했다는 안내가 뜸
			default:
				System.out.println("잘못 입력");
				break;
			}
		}
	}

	// 저장할 데이터를 사용자에게 받는 메소드
	public void insertEmp() {
		// 사원 번호 :
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt();

		// 사원 이름 :
		System.out.print("사원 이름 : ");
		String name = sc.next();

		// 사원 성별 :
		System.out.print("사원 성별 : ");
		char gender = sc.next().charAt(0);

		// 전화 번호 :
		System.out.print("전화 번호 : ");
		String phone = sc.next();

		// 추가 정보를 더 입력하시겠습니까?(y/n) :
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n): ");
		char ch = sc.next().charAt(0);

		// 추가적인 정보를 더 입력한다고 했을 시(y 또는 Y)
		if (ch == 'y' || ch == 'Y') {

			// 사원부서, 사원 연봉, 보너스율을 추가로 더 받고
			System.out.println("사원 부서 : ");
			String dept = sc.next();
			System.out.println("사원 연봉 : ");
			int salary = sc.nextInt();
			System.out.println("보너스율 : ");
			double bounus = sc.nextDouble();

			// 모든 데이터를 EmployeeController의 add메소드 인자로 보냄
			ec.add(empNo, name, gender, phone, dept, salary, bounus);

			// 추가정보를 입력하지 않겠다고 하면 기본정보만 add메소드 인자로 보냄
		} else if (ch == 'n' || ch == 'N') {
			ec.add(empNo, name, gender, phone);
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	// 수정할 데이터를 사용자에게 받는 메소드
	public void updateEmp() {
		while (true) {
			// 가장 최신의 사원 정보를 수정하게 됩니다.
			System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");

			// 사원의 어떤 정보를 수정하시겠습니까?
			System.out.println("사원의 어떤 정보를 수정하시겠습니까? ");

			// 1. 전화번호
			System.out.println("1. 전화 번호");

			// 2. 사원 연봉
			System.out.println("2. 사원 연봉");

			// 3. 보너스 율
			System.out.println("3. 보너스 율");

			// 9. 돌아가기
			System.out.println("9. 돌아가기");

			// 메뉴 번호를 누르세요 :
			System.out.print("메뉴 번호를 누르세요 : ");

			// 사용자가 수정하고 싶은 내용에 대한 번호를 입력하면
			int menuNum = sc.nextInt();

			// 수정할 XXX : 라고 안내문을 출력 후 사용자에게 값을 받고
			// 받은 값을 EmployeeController의 modify() 인자로 넣어 전달
			switch (menuNum) {

			case 1:
				System.out.print("수정할 전화번호 : ");
				String phone = sc.next();
				ec.modify(phone);
				break;
			case 2:
				System.out.print("수정할 사원 연봉 : ");
				String salary = sc.next();
				ec.modify(salary);
				break;

			case 3:
				System.out.print("수정할 보너스 율 : ");
				double bonus = sc.nextDouble();
				ec.modify(bonus);
				break;

			// 9번을 입력하면 “메인메뉴로 돌아갑니다” 출력 후 메인 메뉴로
			case 9:
				System.out.println("메인메뉴로 돌아갑니다");

				break;

			// 잘못 입력할 경우 “잘못 입력하셨습니다.” 출력 후 메인메뉴로
			default:
				System.out.println("잘못 입력하였습니다.");

				break;
			}

		}
	}

	// 데이터 삭제하는 메소드
	public void deleteEmp() {
		// 정말 삭제할 것인지 물어본 후 삭제하겠다고 하면
		while (true) {
			System.out.print("정말 삭제하시겠습니까? : (y/n)");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y') {

				// EmployeeController의 remove()메소드를 호출하여 반환 값에 따라 데이터 삭제에 실패하였는지 성공하였는지 출력
				Employee e = ec.remove();
				if (e == null) {
					System.out.println("데이터 삭제에 성공하였습니다.");
				} else {
					System.out.println("데이터 삭제에 실패!!");
				}
				return;
			} else if (ch == 'n' || ch == 'N') {
				return;
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
		}

	}

	// 데이터 출력하는 메소드
	public void printEmp() {
		// 사원정보가 있다면 사원정보 출력, 없다면 “사원 데이터가 없습니다”출력
		String Str = ec.inform();
		if (Str == null) {
			System.out.println("사원 데이터가 없습니다");
		} else {
			System.out.println(Str); // 사원정보
		}

	}

}
