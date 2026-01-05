package com.kh.hw.person.controller;

import com.kh.hw.person.modle.vo.Employee;
import com.kh.hw.person.modle.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int[] arr = new int[2];

		int scount = 0;
		int ecount = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				scount++;
			}
		}
		arr[0] = scount;

		for (int j = 0; j < e.length; j++) {
			if (e[j] != null) {
				ecount++;
			}
		}
		arr[1] = ecount;

		return arr;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

	}

	public Student[] printStudent() {

	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

	}

	public Employee[] printEmployee() {

	}
}
