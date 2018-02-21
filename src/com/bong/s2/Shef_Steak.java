package com.bong.s2;

public class Shef_Steak {
	public Food_Steak makeSteak(int select) {
		// 1. 안심스테이크 , 30000 , 1번소스
		// 2. 등심스테이크 , 40000 , 2번소스
		// 3. 립스테이크 , 50000 , 1번소스
		Shef_Source shef_source = new Shef_Source();
		
		Food_Steak steak = new Food_Steak();
		switch(select) {
		case 1: 
			steak.name = "안심스테이크";
			steak.price = 30000;
			steak.source = shef_source.makeSource(1);
			break;
		case 2: 
			steak.name = "등심스테이크";
			steak.price = 40000;
			steak.source = shef_source.makeSource(2);
			break;
		case 3: 
			steak.name = "립스테이크";
			steak.price = 50000;
			steak.source = shef_source.makeSource(1);
			break;
		default :
				
		}
		
		/*Shef_Source s = new Shef_Source();
		
		Food_Steak steak = new Food_Steak();
		steak.name = "";
		steak.price = 40000;
		steak.source = s.makeSource(1);*/
		
		return steak;
	}
}
