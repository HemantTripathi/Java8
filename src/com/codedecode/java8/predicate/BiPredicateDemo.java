package com.codedecode.java8.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        // check sum of given 2 inputs greater then 5
        BiPredicate<Integer,Integer> biPredicate = (a, b)-> a+b >= 5;
        System.out.println("sum of given 2 inputs greater then 5: "+ biPredicate.test(5,6));
    }
}
