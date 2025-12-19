package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
	
	
	System.out.print("±¹ : ");
	double kor = sc.nextDouble();
	
	System.out.print("¿µ : ");
	double eng = sc.nextDouble();

	System.out.print("¼ö : ");
	double math = sc.nextDouble();
	
	int total = (int)(kor + eng + math);
	int avg = total / 3;
	System.out.println("ÃÑÁ¡ : " + total);
	System.out.println("Æò±Õ : " + avg);
	
	}
}
