package com.basic.corejava;

import java.util.HashSet;

public class RemoveDuplicatesUsingHashset {
	public static void main(String[] args) {
		String input = "sanjay mandal";
		char inputChar[] = input.toCharArray();
		
		HashSet<Character> characters = new HashSet<>();
		for(char ch : inputChar) 
			characters.add(ch);
		
		for(char ch : characters)
			System.out.print(ch);
	}

}
