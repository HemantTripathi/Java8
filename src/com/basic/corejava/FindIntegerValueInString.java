package com.basic.corejava;

public class FindIntegerValueInString {
    public static void main(String[] args) {
        String sample = "abcd23ffedc";
        char[] chars = sample.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb); 
    }

}
