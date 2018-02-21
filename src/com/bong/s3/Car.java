package com.bong.s3;

public class Car {
	String color;
	String brand;
	int cc;
	
	public Car() {
		this("Red"); // 자신의 또다른 생성자를 호출
		// 생성자라인의 첫줄에 기술하지않으면 에러!!
	}
	
	public Car(String color) {
		this(color, "Audi");
	}
	
	public Car(String color, String brand) {
		this(color, brand, 3000);
	}
	
	public Car(String color, String brand, int cc) {
		this.color = color;
		this.brand = brand;
		this.cc = cc;
	}
	
	public void info() {
		System.out.println("Color : " + color); // this.color 로 써도 되지만 this는 생략가능하기 때문에 하지만 구별을 해야한다면 꼭 써주기!!
		System.out.println("brand : " + brand);
		System.out.println("CC : " + cc);
		this.make();
	}
	
	public void make() {
		System.out.println("자동차 제작 완료");
	}
}
