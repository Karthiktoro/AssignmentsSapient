package com.lambda;

import java.util.Arrays;
import java.util.List;

public class MyLambda2 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,3,5,6,8,9,23,45,667,887,90);
		Integer i = l.stream().max(Integer::compare).get();
		System.out.println(i);
		
		Integer k = l.stream().min(Integer::compare).get();
		System.out.println(k);
		
		l.stream().map(t->0+t).forEach(System.out::println);
	}

}
