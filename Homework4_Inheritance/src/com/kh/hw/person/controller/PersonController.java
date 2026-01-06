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
		for (Student std : s) {
			if (std != null) {
				scount++;
			}
		}
		arr[0] = scount;

		for (Employee emp : e) {
			if (emp != null) {
				ecount++;
			}
		}
		arr[1] = ecount;

		return arr;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		Student smem = new Student(name, age, height, weight, grade, major);

		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = smem;
				break;
			}
		}
	}

	public Student[] printStudent() {
		// 객체배열에 저장된 학생 데이터를 출력하는 메소드
		return s;

	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		Employee emem = new Employee(name, age, height, weight, salary, dept);

		for (int i = 0; i < s.length; i++) {
			if (e[i] == null) {
				e[i] = emem;
				break;
			}
		}
	}

	public Employee[] printEmployee() {
		return e;
	}
}
