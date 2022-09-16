package com.codedecode.java8.consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Integer> squareMe = s -> System.out.println("Value after square: "+ s*s);
        squareMe.accept(5);

        Consumer<Integer> cubeMe = s -> System.out.println("Value after cube: "+ s*s*s);
        cubeMe.accept(5);

        squareMe.andThen(cubeMe).accept(5);
    }
}
