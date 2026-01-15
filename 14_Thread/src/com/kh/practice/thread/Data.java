package com.kh.practice.thread;

public class Data {
	private int value; // provider가 공급하고, customer가 소비/사용하는 데이터
	private boolean isEmpty = true;

	public Data() {

	}

	// value 기록메서드
	public void setValue(int value) {

		synchronized (this) {
			// value 값 기록 저장함 단, isEmpty 가 true 가 될때까지 대기
			if (!isEmpty) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// true가 되면 기록처리하고
			// isEmpty 값false로 바꾸고,
			isEmpty = false;
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value : " + value);
			this.value = value;
			notify();

			// 대기중인 스래드를 실행시킴 동기화 처리함
		}

	}

	public int getValue() {
		// value 값을 꺼냄 단, isEmpty 가 false가 될때까지 기다 림,
		synchronized (this) {
			if (isEmpty) {
				try {
					throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오..");
				} catch (EmptyException e) {
					String errMessage = e.getMessage();
					System.out.println(errMessage);
					try {
						wait(); // 값이 찰 때까지 대기..
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					} 
				}
			}

			// false 가 되면 value를 꺼내고,isEmpty를 true 로 바꾸고 대기상태의 스래드를 실행시킴
			isEmpty = true;
			System.out.println("get value : " + value);
			System.out.println("값을 꺼냈습니다. value가 비었습니다.");
			
			notify();
			return value;
		}
		// 값이 비었는데 꺼내려고 할 때 EmptyException 발생시킴. 동기화 처리함

	}

}
