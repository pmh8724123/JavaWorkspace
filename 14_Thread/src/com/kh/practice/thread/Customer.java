package com.kh.practice.thread;

public class Customer extends Thread{
	private Data data;
	
	public Customer(Data data) {
		// Data 레퍼런스를 받는 생성자
		this.data = data;
	}
	
	public void run() {
		// Data가 가진 value 값을 10번 꺼내어 출력한다.
		int value = data.getValue();
		for(int i = 0; i < 10; i++) {
			
			System.out.println(value);
			try {
				// 한번 출력하고 0.1초 중지
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
