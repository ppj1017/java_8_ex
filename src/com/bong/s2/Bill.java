package com.bong.s2;

public class Bill {
	// Steak
	
	public void bill_steak(Food_Steak steak) {
		System.out.println("===영수증 내역서===");
		System.out.println("메뉴 : " + steak.name);
		System.out.println("가격 : " + steak.price + "원");
		System.out.println("** 첨가된 소스");
		System.out.println("소스1 : " + steak.source.oil_name);
		System.out.println("소스2 : " + steak.source.spice_name);
		System.out.println("==============");
	}
	
	// Pasta
	public void bill_pasta(Food_Pasta pasta) {
		System.out.println("===영수증 내역서===");
		System.out.println("메뉴 : " + pasta.name);
		System.out.println("가격 : " + pasta.price + "원");
		System.out.println("** 첨가된 소스");
		System.out.println("소스1 : " + pasta.source.oil_name);
		System.out.println("소스2 : " + pasta.source.spice_name);
		System.out.println("==============");
	}
}
