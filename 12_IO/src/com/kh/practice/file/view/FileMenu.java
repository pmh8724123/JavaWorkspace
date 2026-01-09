package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		while(true) {
			System.out.print("***** My Note ***** \r\n"
					+ "1. 노트 새로 만들기  ➔ fileSave() \r\n"
					+ "2. 노트 열기  ➔ fileOpen() \r\n"
					+ "3. 노트 열어서 수정하기 ➔ fileEdit() \r\n"
					+ "9. 끝내기  ➔ “프로그램을 종료합니다.” 출력 후 종료 \r\n"
					+ "메뉴 번호 :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램종료");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	
	public void fileSave() {
		StringBuilder sb = addText();		
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) :");
			String fileName = sc.nextLine();
			
			boolean isFileExist = fc.checkName(fileName);
			
			if(!isFileExist) {
				fc.fileSave(fileName,sb);
				return;
			}
			
			System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				fc.fileSave(fileName, sb);
			}else {
				continue;
			}
			
			break;
		}
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
		boolean exists = fc.checkName(fileName);
		
		if(!exists) {
			System.out.println("없는 파일입니다.");
			return;
			//throw new RuntimeException("존재하지 않는 파일입니다."); 
		}
		System.out.println(fc.fileOpen(fileName));
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		boolean exists = fc.checkName(fileName);
		
		if(!exists) {
			System.out.println("없는 파일입니다.");
			return;
		}
		
		StringBuilder sb = addText();
		fc.fileEdit(fileName, sb);
	}
	
	private StringBuilder addText() {
		StringBuilder sb = new StringBuilder();
		while(true) {
			System.out.print("파일에 저장할 내용을 입력하세요. \r\n"
					+ "ex끝it  이라고 입력하면 종료됩니다. \r\n"
					+ "내용 : ");
			String str = sc.nextLine();
			if(str.equals("ex끝it")) {
				break;
			}
			sb.append(str+"\n"); // 내가 입력한 값을 StringBuilder에 기록
		}
		return sb;
	}
}







