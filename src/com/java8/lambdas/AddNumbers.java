package com.java8.lambdas;

import com.java8.funtionalinterface.SampleInterface;

public class AddNumbers {
	public static void main(String[] args) {
		
		SampleInterface interface1 = (a,b)-> System.out.println("Addition of numbers using Lambda:"+(a+b));
		interface1.add(10, 20);
		interface1.add(200, 300);
		
	}

}
