package com.codedecode.java8.streams;

import com.java8.funtionalinterface.FunctionalInterfaceDemo;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterface = Test :: testImplementation;
        functionalInterface.singleAbstractMethod();




    }

    static class Test {
        public static void testImplementation() {
            System.out.println("Test");
        }

    }
}

