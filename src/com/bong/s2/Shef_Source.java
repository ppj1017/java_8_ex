package com.bong.s2;

public class Shef_Source {
	public Food_Source makeSource(int select) {
		Food_Source source = new Food_Source();//source = null
		switch(select) {
		case 1:
			// source = new Food_Source();
			source.oil_name = "Olive";
			source.spice_name = "Hub";
			break;
		case 2:
			// source = new Food_Source();
			source.oil_name = "Milk";
			source.spice_name = "Cheese";
			break;
		default :
				
		}
		
		/*Food_Source source = new Food_Source();
		source.oil_name = "Olive";
		source.spice_name = "Hub";*/
		
		// oil_name = "Milk";
		// spice_name = "Cheese";
		
		return source;
	}
}
