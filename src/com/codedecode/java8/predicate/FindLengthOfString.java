package com.codedecode.java8.predicate;

import java.util.function.Predicate;

public class FindLengthOfString {
    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.length() > 5;
        System.out.println("String with length greater than 5  : "+predicate.test("Hemant Tripathi"));

    }


}
