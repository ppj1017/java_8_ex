package com.bong.s1;

import java.util.Scanner;

public class StudentView {
	// 학생들의 정보를 출력
	// 메서드 명 view
	// 메인의 4번

	public Student[] view(Student[] stu) {
		System.out.println("학생들의 정보입니다. ");

		for (int i = 0; i < stu.length; i++) {
			System.out.println("이름 : " + stu[i].name);
			System.out.println("번호 : " + stu[i].num);
			System.out.println("국어점수 : " + stu[i].kor);
			System.out.println("영어점수 : " + stu[i].eng);
			System.out.println("수학점수 : " + stu[i].math);
			System.out.println("총점수 : " + stu[i].total);
			System.out.println("평균 : " + stu[i].ave + "\n");
		}

		return stu;
	}

	public void viewStudent(Student[] stu, int search_num) { // 처음에 했던 방식은 인덱스번호를 출력, 지금은 인덱스 안 번호를 체크후 출력
		int i = 0;
		for(i = 0; i < stu.length; i++) {
			if(search_num == stu[i].num) {
				break;
			} 
		}
		System.out.println("이름 : " + stu[i].name);
		System.out.println("번호 : " + stu[i].num);
		System.out.println("국어점수 : " + stu[i].kor);
		System.out.println("영어점수 : " + stu[i].eng);
		System.out.println("수학점수 : " + stu[i].math);
		System.out.println("총점수 : " + stu[i].total);
		System.out.println("평균 : " + stu[i].ave + "\n");

	}
}
