package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	Scanner sc = new Scanner(System.in);

	public void rps() {
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		int win = 0;
		int loss = 0;
		int draw = 0;

		System.out.print("가위바위보 : ");
		String rps = sc.next();

		if (rps.equals("exit")) {
			System.out.println((win + loss + draw) + "전 " + win + "승 " + draw + "무 " + loss + "패");
			break;
		}

		if (!(rps.equals("가위") || rps.equals("바위") || rps.equals("보"))) {
			System.out.println("잘못 입력하셨습니다.");
			continue;
		}

		String[] computers = { "가위", "바위", "보" };
		int random = (int) (Math.random() * 3);

		System.out.println("컴퓨터 : " + computers[random]);
		System.out.println(name + " : " + rps);

		// 두 값이 같은 경우
		if (computers[random].equals(rps)) {
			System.out.println("비겼습니다.");
			draw++;
		} else {
			if (computers[random].equals("가위") && rps.equals("보") 
					|| computers[random].equals("보") && rps.equals("바위")
					|| computers[random].equals("바위") && rps.equals("가위")) {
				System.out.println("졌습니다");
				loss++;
			} else {
				System.out.println("이겼습니다.");
				win++;
			}
		}
	}
}
