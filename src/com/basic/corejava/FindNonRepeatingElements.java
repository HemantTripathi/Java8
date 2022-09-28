package com.basic.corejava;

public class FindNonRepeatingElements {
    public static void main(String[] args) {
        String inputStr = "abemdcffedc";
        //boolean flag = true;

        for (char i : inputStr.toCharArray()) {
            // if current character is the last occurrence in the string
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.print(i);
            }
        }
        /*
         * if (flag)
         * System.out.println("There is no non repeating character in input string");
         */
    }

}
