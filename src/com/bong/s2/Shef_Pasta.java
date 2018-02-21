package com.bong.s2;

public class Shef_Pasta {
	// 메서드명 make_pasta
	// 1. 크림파스타 , 15000 , 소스 2번
	// 2. 로제파스타 , 20000 , 소스 1번
	// 3. 알리오올리오 , 30000 , 소스 1번
	
	public Food_Pasta make_pasta(int select) { // 파스타를 만드는데 소스는 쉐프가 만든 소스를 가지고 파스타를 만든다.
		Food_Pasta pasta = new Food_Pasta();
		Shef_Source ss = new Shef_Source();
		
		switch(select) {
		case 1: 
			pasta.name = "Cream Pasta";
			pasta.price = 15000;
			pasta.source = ss.makeSource(2);
			break;
		case 2: 
			pasta.name = "Rose Pasta";
			pasta.price = 20000;
			pasta.source = ss.makeSource(1);
			break;
		case 3: 
			pasta.name = "aglio e olio Pasta";
			pasta.price = 30000;
			pasta.source = ss.makeSource(1);
			break;
		default :
		
		}
		
		return pasta;
	}
}
