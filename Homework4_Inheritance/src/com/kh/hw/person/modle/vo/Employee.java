package com.kh.hw.person.modle.vo;

public class Employee extends Person {
	private int salary; // 급여
	private String dept; // 부서
	
	public void Emloyee() {
		
	}

	public Employee() {
		
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
	
}
