package com.bong.s3;

public class Member {
	String name;
	int age;
	
	public Member() {
		System.out.println("생성자 실행");
		System.out.println("멤버변수의 초기화 담당");
		name = "bong";
		age =25;
		// 멤버변수의 초기화 담당 
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}
}
