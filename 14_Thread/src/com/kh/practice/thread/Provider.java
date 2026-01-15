package com.kh.practice.thread;

import java.util.Random;

public class Provider extends Thread {
	private Data data;

	public Provider(Data data) {
		this.data = data;
		// Data 레퍼런스를 받는 생성자
	}

	@Override
	public void run() {
		// Data의 value에 1부터 100사이의 정수를 기록하는 작업 10번 실행한다.
		for (int i = 0; i < 10; i++) {
			int random = new Random().nextInt(100) + 1;
			data.setValue(random);
			
			try {
				// 한번 기록하고 0.1초 중지
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
