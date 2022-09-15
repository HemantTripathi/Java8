package com.codedecode.java8.function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {

        Function<Integer,Integer> doubleIt = s -> 2*s;
        System.out.println("double it: "+ doubleIt.apply(2));

        Function<Integer,Integer> cubeIt = s -> s*s*s;
        System.out.println("triple it: "+cubeIt.apply(2));

        // using andthen
        System.out.println("This will double it first and then cube it:"+doubleIt.andThen(cubeIt).apply(2));

        //using compose
        System.out.println("This will cube it first and then square it: "+doubleIt.compose(cubeIt).apply(2));

    }
}
