package com.basic.corejava;

import java.util.Arrays;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String input = "sanjay mandal";
		char inputChar[] = input.toCharArray();
		int index = 0;
		for(int i=0; i<input.length();i++) {
			//logic to check if char is already present or not?
			int j;
			for(j=0;j<i;j++) {
				if(inputChar[i]==inputChar[j])
					break;
			}
			//if it is not present then add to the result
			if(j==i) {
				inputChar[index++] = inputChar[i];
			}	
		}	
		System.out.println(String.valueOf(Arrays.copyOf(inputChar, index)));	
	}
}
