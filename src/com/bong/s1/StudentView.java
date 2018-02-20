package com.bong.s1;

import java.util.Scanner;

public class StudentView {
	// 학생들의 정보를 출력
	// 메서드 명 view
	// 메인의 4번
	
	public Student[] view(Student[] stu) {
		System.out.println("학생들의 정보입니다. ");
		
		for(int i = 0; i < stu.length; i++) {
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
	
	public Student[] pointView(Student[] stu) {
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		System.out.println("조회할 학생의 번호를 입력하세요. ");
		int num = sc.nextInt();
		
		for(int i = 0; i < stu.length; i++) {
			if(stu[i].num == num) {
				System.out.println("이름 : " + stu[i].name);
				System.out.println("번호 : " + stu[i].num);
				System.out.println("국어 : " + stu[i].kor);
				System.out.println("영어 : " + stu[i].eng);
				System.out.println("수학 : " + stu[i].math + "\n");
				check = !check;
			}
		}
		if(check) {
			System.out.println("해당 번호의 학생이 없습니다. ");
		}
		
		return stu;
	}
}
