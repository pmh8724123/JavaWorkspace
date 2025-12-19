package com.kh.practice1.func;

import java.util.Scanner;
// 계산 공식) 면적 : 가로 * 세로
//          둘레 : (가로 + 세로)*2
public class VariablePractice3 {

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double dNum1 = sc.nextDouble();
		
		System.out.print("세로 : ");
		double dNum2 = sc.nextDouble();
				
		System.out.println("면적 : " + dNum1 * dNum2);
		
		System.out.println("둘레 : " + (dNum1 + dNum2) * 2);
						
		
	}
}
