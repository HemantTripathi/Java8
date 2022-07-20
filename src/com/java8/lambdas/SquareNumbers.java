package com.java8.lambdas;

import com.java8.funtionalinterface.NumberSquareInterface;

public class SquareNumbers {
	public static void main(String[] args) {
		
		int number = 4;
		NumberSquareInterface squareInterface = a-> a*a;
		System.out.println("Square of "+number+" is:"+squareInterface.getSquare(number));
	}
}
