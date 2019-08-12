package com.aeromexico.world.capacitacion.utils;

public class Ciudades {



	public static String origenDestino(String origen, String destino) {
		// TODO Auto-generated method stub
		String ori = origen.substring(0,3).toUpperCase().replace(" ", "");
		String des = destino.substring(0,3).toUpperCase().replace(" ", "");
		
		
		String response = ori  + " - " +  des;
		return response;
		
	}

}

