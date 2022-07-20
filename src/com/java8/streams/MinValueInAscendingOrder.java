package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//sample program to get the minimum marks of student using min()
public class MinValueInAscendingOrder {
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
		
		Integer minimumMarks = markslist.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Lowest marks by student using min():"+minimumMarks);
		
		Integer maximumMarks = markslist.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Highest marks by student using max():"+maximumMarks);
	}

}
