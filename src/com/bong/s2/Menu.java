package com.bong.s2;

import java.util.Scanner;

public class Menu {

	public void order() {
		Bill bill = new Bill();
		Scanner sc = new Scanner(System.in);
		
		// 스테이크 메뉴들
		System.out.println("1. 안심스테이크");
		System.out.println("2. 등심스테이크");
		System.out.println("3. 립 스테이크");
		// 파스타 메뉴들
		System.out.println("4. 크림 파스타");
		System.out.println("5. 로제 파스타");
		System.out.println("6. 알리오올리오");
		
		System.out.println("메뉴를 한 가지 선택해 주세요. ");
		System.out.println("=====================");
		
		int select = sc.nextInt();
		
		if(select > 0 && select <= 3) {
			System.out.println("스테이크를 선택하셨습니다.");
			Shef_Steak steak = new Shef_Steak();
			Food_Steak fs = new Food_Steak();
			
			fs = steak.makeSteak(select);
			bill.bill_steak(fs);
		} else if(select > 3 && select <= 6) {
			Shef_Pasta pasta = new Shef_Pasta();
			Food_Pasta fp = new Food_Pasta();
			
			fp = pasta.make_pasta(select-3);
			bill.bill_pasta(fp);
		} else {
			System.out.println("입력오류!!");
		}
		
	}
}
