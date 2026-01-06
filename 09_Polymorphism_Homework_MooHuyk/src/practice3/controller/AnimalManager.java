package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {
	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] arr = new Animal[5]; // [null,null,...]

		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		arr[0] = new Dog("꽃분이", "말티즈", 3);
		arr[1] = new Dog("꽃돌이", "진돗개", 15);
		arr[2] = new Cat("네로", "코숏", "부천", "검은색");
		arr[3] = new Cat("코코", "브숏", "목동", "회색");
		arr[4] = new Dog("콩순이", "푸들", 5);

		for (Animal ani : arr) {
			ani.speak();
		}

		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출

	}
}
