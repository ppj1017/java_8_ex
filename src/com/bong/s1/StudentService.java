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
		int check_number;
		
		System.out.println("학생의 수를 입력하세요. ");
		int number = sc.nextInt();
		
		Student[] stu = new Student[number];
		
		for(int i = 0; i < number; i++) {
			Student student1 = new Student(); // 객체를 여기다 생성해야 하는 이유는 배열만큼 생성하고 값을 넣어줘야 하기 때문에
			System.out.println("학생의 이름을 입력하세요. ");
			student1.name = sc.next();
			
			System.out.println("학생의 번호를 입력하세요.");
<<<<<<< HEAD
			student1.num = sc.nextInt();

			stu[i] = student1;
=======
			check_number = sc.nextInt();
			
			/*for(int j = 1; j < number; j++) {
				Student student3 = new Student();
				stu[j-1] = student3;
				if(check_number == stu[j-1].num) {
					System.out.println("같은 번호가 존재합니다. 다른번호를 입력해주세요. ");
					check_number = sc.nextInt();
					j = 0;
				}
			}*/
			student2.num = check_number;
			stu[i] = student2;
>>>>>>> parent of f824bef... SchoolInformation
		}
		return stu;
	}
	
	// 메서드명 addPoint
	public Student[] addPoint(Student[] stu) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < stu.length; i++) {
			//Student student2 = new Student(); // 매개변수를 그대로 받아서 입력해주면 되는것이므로 새롭게 생성할 필요가 없다.
			// 새롭게 입력한다는건 교실에 이름넣는 학생과 성적받는 학생 따로 입력한다는 것!!! 즉, 이름과 번호 객체, 성적 객체 이렇게 2개를 생성하는 것인셈
			System.out.println(i+1 + "번째 학생의 국어점수를 입력하세요. ");
			stu[i].kor = sc.nextInt();
			
			/*System.out.println(stu[i].name + "의 국어점수를 입력하세요. ");
			stu[i].kor = sc.nextInt();*/
			
			System.out.println(i+1 + "번째 학생의 영어점수를 입력하세요. ");
			stu[i].eng = sc.nextInt();
			
			System.out.println(i+1 + "번째 학생의 수학점수를 입력하세요. ");
			stu[i].math = sc.nextInt();
			
			stu[i].total = stu[i].kor + stu[i].eng + stu[i].math;
			stu[i].ave = stu[i].total / 3.0;
			
			//stu[i] = student2; // 마찬가지로 새롭게 입력받은게 아니므로
		}
		
		return stu;
	}
	
}
