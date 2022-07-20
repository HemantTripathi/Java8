package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//sample program to add grace marks of 5 to every student in the list with score <= 35
public class SortStudentMarks {
	public static void main(String[] args) {
		List<Integer> markslist = new ArrayList<>();
		markslist.add(29);
		markslist.add(34);
		markslist.add(76);
		markslist.add(87);
		markslist.add(45);
		markslist.add(92);
		markslist.add(11);
		markslist.add(31);
		markslist.add(78);
		markslist.add(39);
		
		List<Integer> sortedMarks=markslist.stream().sorted().collect(Collectors.toList());
		System.out.println("Count of students who have failed:\n"+sortedMarks);

		
		
	}

}
