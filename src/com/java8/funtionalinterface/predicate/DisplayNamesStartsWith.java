package com.java8.funtionalinterface.predicate;

import java.util.function.Predicate;

// sample program to find name starts with K from given String array using Predicates
public class DisplayNamesStartsWith {
	
	public static void main(String[] args) {
		
		String [] names = {"Sunny", "Kajal","Mallika","Katrina","Kareena"};

		Predicate<String> nameStartsWith = s->s.startsWith("K");

		for (String name: names) {
			if(nameStartsWith.test(name))
				System.out.println(name);
		}
	}

}
