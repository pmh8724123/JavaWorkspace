package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {

	public void upDown() {
		int random = (int) (Math.random() * 100 + 1);
		int count = 1;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1~100사의 임의이 난수를 맞춰보세요 : ");
			int num = sc.nextInt();

			if (num == random) {
				break;
			}
			if (!(num >= 1 && num <= 100)) {
				System.out.println("1~100 사이의 숫자를 입력하세요.");
				continue;
			}

			if (num > random) {
				System.out.println("DOWN !!");
			} else {
				System.out.println("UP !!");
			}

			count++;
		}
		System.out.println(count+"회만에 맞추셨습니다.");

	}
//	1~100사의 임의이 난수를 맞춰보세요 : 50
//	DOWN !!
//	1~100사의 임의이 난수를 맞춰보세요 : 25
//	UP !!
//	1~100사의 임의이 난수를 맞춰보세요 : 35
//	DOWN !!
//	1~100사의 임의이 난수를 맞춰보세요 : 30
//	UP !!
//	1~100사의 임의이 난수를 맞춰보세요 : 32
//	DOWN !!
//	1~100사의 임의이 난수를 맞춰보세요 : 31
//	6회만에 맞추셨습니다.

}
