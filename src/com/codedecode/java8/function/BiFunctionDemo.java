package com.codedecode.java8.function;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionDemo {
    public static void main(String[] args) {
        // check sum of given 2 inputs greater then 5
        BiFunction<Integer,Integer,Boolean> biPredicate = (a, b)-> a+b%2 == 0;
        System.out.println("sum of given 2 inputs are even: "+ biPredicate.apply(6,8));
    }
}
