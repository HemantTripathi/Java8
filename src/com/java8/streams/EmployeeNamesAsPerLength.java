package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//approach-1 : sample program to sort the marks of students in DESC order
//sorted() => default natural sorting
public class EmployeeNamesAsPerLength {
	public static void main(String[] args) {
		List<String> employeelist = new ArrayList<>();
		employeelist.add("Hemant Tripathi");
		employeelist.add("Ajay Gupta");
		employeelist.add("Vivek");
		employeelist.add("Amir Khan");
		employeelist.add("Krunal Pandya");
		employeelist.add("Meenal");
		employeelist.add("Sneha Bhamare");

		List<String> sortedemployeeList=
				employeelist.stream().sorted(
						(s1,s2)-> {
							int i1 = s1.length();
							int i2 = s2.length();
							if(i1>i2) return 1;
							else if(i2>i1) return -1;
							else return s1.compareTo(s2);
						}
					)
				.collect(Collectors.toList());
		System.out.println("Sorted list of employees:\n"+sortedemployeeList);		
	}

}
