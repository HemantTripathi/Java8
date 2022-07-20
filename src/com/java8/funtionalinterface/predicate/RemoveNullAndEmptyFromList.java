package com.java8.funtionalinterface.predicate;

//Write a sample program to remove null and empty values from given list of string

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveNullAndEmptyFromList {
    public static void main(String[] args) {

        String [] names = {"Durga","",null,"Ravi","","Siva",null};

        Predicate<String> predicate = input->input != null && input.length() !=0 ;
        List<String> list = new ArrayList<>();

        for(String name : names)
            if(predicate.test(name))
                list.add(name);

        System.out.println("The valid list of names are: "+list);

    }
}
