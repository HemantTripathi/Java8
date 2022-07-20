package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Sample program to get the even numbers from List using Stream API.
//We can also manipulate the same by changing in filter with condition as filter(i->i%2!=0) to 
//get the odd numbers from the list
public class DisplayEvenNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(324);
		list.add(341);
		list.add(867);
		list.add(345);
		list.add(123);
		list.add(578);
		list.add(534);
		list.add(391);

		List<Integer> finalList  = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(finalList);
		
	}
	
}
