package com.codedecode.java8.predicate;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {

        // predicate to check the length of string
        Predicate<String> checkLength = s -> s.length() >= 5;
        System.out.println("Length of String greater than 5: "+checkLength.test("code decode"));

        // predicate to check the length of string which is even
        Predicate<String> checkEvenLength = s -> s.length() % 2 == 0;
        System.out.println("Length of String is: "+checkEvenLength.test("code decode"));

        // join predicate using and
        System.out.println("Length of string greater than 5 and is even: "+checkLength.and(checkEvenLength).test("code decode"));

        // join predicate using or
        System.out.println("Length of string greater than 5 or is even: "+checkLength.or(checkEvenLength).test("Salman"));

        //predicate using negate()
        System.out.println("Length of string not greater than 5: "+checkLength.negate().test("test"));

        //predicate using negate()
        System.out.println("Length of string not even: "+checkEvenLength.negate().test("qwdfghn"));


    }
}
