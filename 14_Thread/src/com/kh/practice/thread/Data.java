package com.kh.practice.thread;

public class Data {
	private int value;
	private boolean isEmpty = true;

	public Data() {

	}

	// value 기록메서드
	public void setValue(int value) {

		synchronized (this) {
			// value 값 기록 저장함 단, isEmpty 가 true 가 될때까지 대기
			if (isEmpty == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			// true가 되면 기록처리하고
			// isEmpty 값false로 바꾸고,
			this.value = value;
			isEmpty = false;

			// 대기중인 스래드를 실행시킴 동기화 처리함
			notify();
		}

	}

	public int getValue() {
		// value 값을 꺼냄 단, isEmpty 가 false가 될때까지 기다 림,
		synchronized (this) {
			if (isEmpty == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}

			// false 가 되면 value를 꺼내고,isEmpty를 true 로 바꾸고 대기상태의 스래드를 실행시킴
			notify();
			isEmpty = true;
			return value;
		}
		// 값이 비었는데 꺼내려고 할 때 EmptyException 발생시킴. 동기화 처리함

	}

}
