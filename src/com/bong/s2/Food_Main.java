package com.bong.s2;

public class Food_Main {

	public static void main(String[] args) {
		Food_Pasta pasta = new Food_Pasta();
		pasta.name = "크림파스타";
		pasta.price = 15000;
		
		System.out.println(pasta.source);
		
		pasta.source = new Food_Source();
		
		System.out.println(pasta.source.oil_name);
		
		pasta.source.oil_name = "olive";
		pasta.source.spice_name = "hub";

		Food_Pasta pasta2 = new Food_Pasta();
		
		System.out.println(pasta2.source.oil_name);
		
		// 소스 : 오일, 향신료

	}

}
