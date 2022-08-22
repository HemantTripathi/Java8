package com.java8.funtionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

     public void singleAbstractMethod();

     default public void defaultMethods(){
          System.out.println("Hello this is default methods");
     }


}
