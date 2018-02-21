package com.bong.s2;

public class Food_Main {

	public static void main(String[] args) {
		Shef_Source shef = new Shef_Source();// 테스트 1
		Food_Source source = shef.makeSource(3);// 테스트 1
		
		Shef_Steak ss = new Shef_Steak(); //테스트 2
		Food_Steak fs = new Food_Steak(); //테스트 2
		Shef_Pasta sp = new Shef_Pasta(); //테스트 2
		Food_Pasta fp = new Food_Pasta(); //테스트 2
		Menu menu = new Menu(); //테스트 3
		
		if (source != null) {
			System.out.println(source.oil_name);
			System.out.println(source.spice_name);
		} // 테스트 1
		
		fs = ss.makeSteak(2); //테스트 2
		System.out.println(fs.name);
		System.out.println(fs.price);
		System.out.println(fs.source.oil_name);
		System.out.println(fs.source.spice_name);
		System.out.println();
		
		fp = sp.make_pasta(3); //테스트 2
		System.out.println(fp.name);
		System.out.println(fp.price);
		System.out.println(fp.source.oil_name);
		System.out.println(fp.source.spice_name);
		
		menu.order(); //테스트 3
	}

}
