package com.kh.practice.thread;

public class EmptyException extends Exception {
	
	public EmptyException(String message) {
		// message을 받아 부모생성자로 전달하는 생성자
		super(message);
	}
	
}
