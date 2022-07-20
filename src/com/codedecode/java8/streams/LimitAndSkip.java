package com.codedecode.java8.streams;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkip {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,28,87,10,20,76,28,80,80,80);
		//suppose we want to print values only till index-7
		//list.stream().limit(7).forEach(x->System.out.println(x));
		
		//suppose we want to print values only after index-5 and wants to skip before 5.
		list.stream().skip(5).forEach(x->System.out.println(x));

	}

}
