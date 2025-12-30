package com.kh.example.practice5.model.vo;

public class Lotto {
	private int[] lotto;
	{
		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45 + 1);
			lotto[i] = random;

			for (int j = 0; j < i; j++) {
				// 중복
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}

			}
		}
	}

	public Lotto() {

	}

	public void information() {
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
//	출력결과
//	27 24 6 38 33 10 
}
