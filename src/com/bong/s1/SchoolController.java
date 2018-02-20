package com.bong.s1;

import java.util.Scanner;

public class SchoolController {
	// 메서드명 start
	// 리턴은 없음
	// 내용은
	// 1. 학 생 등 록
	// 2. 성 적 입 력
	// 3. 성 적 조 회
	// 4. 전 체 조 회
	// 5. 프로그램종료

	public void start() {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		while (true) {
			System.out.println("1. 학 생  등 록 ");
			System.out.println("2. 성 적  입 력 ");
			System.out.println("3. 성 적  조 회 ");
			System.out.println("4. 전 체  조 회 ");
			System.out.println("5. 프로그램종료 ");

			System.out.println("번호를 입력하세요. ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("학생 등록을 선택하셨습니다. ");
				break;
			case 2:
				System.out.println("성적 입력을 선택하셨습니다. ");
				break;
			case 3:
				System.out.println("성적 조회를 선택하셨습니다. ");
				break;
			case 4:
				System.out.println("전체 조회를 선택하셨습니다. ");
				break;
			case 5:
				System.out.println("프로그램 종료를 선택하셨습니다. ");
				System.exit(1);
				break;
			default:
				System.out.println("번호를 잘못입력하셨습니다. 다시 입력해주세요. ");
			}
		}
	}
}
