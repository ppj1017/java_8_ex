package com.bong.s2;

public class Food_Main {

	public static void main(String[] args) {
		Shef_Source shef = new Shef_Source();
		Food_Source source = shef.makeSource(3);
		Shef_Steak ss = new Shef_Steak();
		Food_Steak fs = new Food_Steak();
		
		if (source != null) {
			System.out.println(source.oil_name);
			System.out.println(source.spice_name);
		}
		
		fs = ss.makeSteak(2);
		System.out.println(fs.name);
		System.out.println(fs.price);
		System.out.println(fs.source.oil_name);
		System.out.println(fs.source.spice_name);
	}

}
