package com.codedecode.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Program to find the duplicate element from given list of Integers
// https://www.youtube.com/watch?v=oNdMigiwzlU

public class DuplicateElementFromInteger {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,28,87,10,20,76,28,80,80,80);
		Set<Integer> set = new HashSet<>();
		
		list.stream().filter(x->!set.add(x))
						.collect(Collectors.toSet())
						.forEach(x->System.out.println(x));
	}

}
