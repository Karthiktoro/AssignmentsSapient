package com.pratice;

public class MyString3 {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();
		sb.append("Shantanu").append(" Banerjee").append("Hyderabad ").append(500058);
		
		System.out.println(sb);
		
		sb.replace(0, 17, "Karthik");
	
		System.out.println(sb);
		sb.delete(8, 16);
		System.out.println(sb);
		
	}
	
		
	}


