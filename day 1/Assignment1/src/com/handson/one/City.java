package com.handson.one;

public class City {	
	public String GetCityByCode(int a) {
		switch(a) {
			case 1 : return "Delhi";
			case 2 : return "NOIDA";
			case 3 : return "GUARGAON";
			case 4 : return "BANGALORE";
			default : return "INVALIDCODE";
	}}
	

	public static void main(String[] args) {
		City ref = new City();
		System.out.println(ref.GetCityByCode(1));
		System.out.println(ref.GetCityByCode(8));

	}

}
