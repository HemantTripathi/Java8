package com.java8.lambdas;

import com.java8.funtionalinterface.InterfaceLength;

public class FindLengthOfString {
	public static void main(String[] args) {
		
		InterfaceLength length = s-> s.length();
		System.out.println(length.getLength("Hello"));
	}

}
