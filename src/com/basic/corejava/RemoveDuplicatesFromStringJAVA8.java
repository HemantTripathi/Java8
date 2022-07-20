package com.basic.corejava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromStringJAVA8 {
	public static void main(String[] args) {
		String input = "sanjay mandal";
		
		String finalOutput = Arrays.asList(input.split("")).stream().distinct().collect(Collectors.joining());
		System.out.println(finalOutput);
	}

}
