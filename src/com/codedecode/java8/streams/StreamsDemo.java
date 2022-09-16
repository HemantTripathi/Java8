package com.codedecode.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<>();
        dataList.add(10);
        dataList.add(20);
        dataList.add(34);
        dataList.add(40);
/*
        List<Integer> newList = new ArrayList<>();
        newList = dataList.stream().filter(x -> x>=15).collect(Collectors.toList());
        //System.out.println(newList);
        newList.forEach(x-> System.out.println(x));

        // above 4 lines of code can further be reduced
*/
        dataList.stream().filter(x -> x>=15).forEach(x-> System.out.println(x));

    }
}
