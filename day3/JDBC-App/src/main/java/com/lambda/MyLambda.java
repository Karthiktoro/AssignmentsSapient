package com.lambda;

import java.util.Arrays;
import java.util.List;


public class MyLambda {

	public static void main(String[] args) {
		//List<Integer> l = Arrays.asList(2,45,6,7,8,23,43,56,90,12,63);
		//l.stream().filter(t->t%2==0).forEach(System.out::println);
		
		List<String> l = Arrays.asList("Shantanu","John","Peter","Robin","Kirthi","Soham","Jonny","Sheetal","Shankar");
		//l.stream().filter(emp->emp.length()>5).forEach(System.out::println);
		//add "Hello" prefix to those who's name starts with Sh;
		//calculate the length of each name and print them;

		//l.stream().filter(emp->emp.startsWith("Sh")).map(emp->"Hello  "+emp).forEach(System.out::println);
		l.stream().map(t-> t +" "+ t.length()).forEach(System.out::println);
		
		
		
	}

}
