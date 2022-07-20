package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//approach-1 : sample program to sort the marks of students in DESC order
//sorted() => default natural sorting
public class SortEmployeeNamesUsingComparator {
	public static void main(String[] args) {
		List<String> employeelist = new ArrayList<>();
		employeelist.add("Hemant");
		employeelist.add("Ajay");
		employeelist.add("Vivek");
		employeelist.add("Ameer");
		employeelist.add("Krunal");
		employeelist.add("Meenal");
		employeelist.add("Sneha");
		
		List<String> sortedemployeeList=
				employeelist.stream().sorted((s1,s2)->s2.compareTo(s1))
				.collect(Collectors.toList());
		System.out.println("Sorted list of employees:\n"+sortedemployeeList);		
	}

}
