package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Convert Stream to Array and print using foreach loop
public class ConvertStreamIntoArray2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(24);
		list.add(41);
		list.add(87);
		list.add(45);
		list.add(23);
		
		Integer[] array = list.stream().toArray(Integer[]::new);
		Stream.of(array).forEach(System.out::println);
	}
}
