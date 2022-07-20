package com.codedecode.java8.streams;

import com.java8.funtionalinterface.MultiplyNumbersInterface;

public class MultiplyTwoNumbersUsingFuntionalInterface {
	public static void main(String[] args) {
		
		MultiplyNumbersInterface numberInterface = (a,b)-> a*b;
		System.out.println(numberInterface.multiply(7,6));	
	}

}
