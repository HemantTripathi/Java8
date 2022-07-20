package com.codedecode.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Sample program to find out occurrence of each words from given string
//https://www.youtube.com/watch?v=oNdMigiwzlU
public class CountOccuranceOfWords {
	public static void main(String[] args) {
		
		String input = "welcome to code decode and code decode welcome you";
		List<String> list = Arrays.asList(input.split(" "));
		
		Map<String,Long> map = list.stream().collect(Collectors
									.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);	
	}

}
