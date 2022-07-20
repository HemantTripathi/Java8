package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//approach-2 : sample program to sort the marks of students in DESC order using Comparator
//sorted(Comparator) => Customized sorting by overriding compare() method
public class SortStudentMarksDescending2 {
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
		
		List<Integer> sortedMarks=
				markslist.stream().sorted((i1,i2)->i2.compareTo(i1))
				.collect(Collectors.toList());
		System.out.println("Count of students who have failed using customizedsorting in "
				+ "DESC order:\n"+sortedMarks);

		
		
	}

}
