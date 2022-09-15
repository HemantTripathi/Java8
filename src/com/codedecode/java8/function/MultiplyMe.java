package com.codedecode.java8.function;

import java.util.function.Function;

public class MultiplyMe {
    public static void main(String[] args) {
        // in functions, it is not mandatory that it will only return boolean
        Function<Integer, Integer> function = a -> a*a;
        System.out.println("value after multiplication: "+function.apply(12));
    }
}
