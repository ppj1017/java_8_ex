package com.bong.s1;

import java.util.Scanner;

public class StudentService {
	// 학생 추가 메서드
	// 메서드 명 addStudent
	// 내용은
	// 학생인원수 입력
	// 학생수만큼
	// 이름입력
	// 번호입력
	// 메인의 1번
	
	public Student[] addStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생의 수를 입력하세요. ");
		int number = sc.nextInt();
		
		Student[] stu = new Student[number];
		
		for(int i = 0; i < number; i++) {
			Student student2 = new Student(); // 객체를 여기다 생성해야 하는 이유는 배열만큼 생성하고 값을 넣어줘야 하기 때문에
			System.out.println("학생의 이름을 입력하세요. ");
			student2.name = sc.next();
			
			System.out.println("학생의 번호를 입력하세요.");
			student2.num = sc.nextInt();

			stu[i] = student2;
		}
		return stu;
	}
	
}
