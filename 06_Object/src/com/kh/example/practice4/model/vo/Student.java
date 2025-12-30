package com.kh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	static {
		grade = 1;
	}

	{
		classroom = 5;
		name = "박무혁";
		height = 180;
		gender = 'M';

	}

	public void information() {
		System.out.println(grade + ", " + classroom + ", " + name + ", " + height + ", " + gender);
	}
}
