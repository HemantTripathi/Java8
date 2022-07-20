package com.java8.funtionalinterface.predicate;

// Write a sample program to find out if Software engineer is allowed into pub or not?

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FindEngineerAllowedIntoPUB {
    public static void main(String[] args) {

        // 1. need to create SoftwareEngineer class with 3 required parameters like name, age and if has GF
        // 2. create the list of objects of SoftwareEngineer
        // 3. use Predicate and put your logic
        // 4. use for loop to display the result

        SoftwareEngineer [] list = {
                new SoftwareEngineer("Hemant", 32, false),
                new SoftwareEngineer("Shivam", 17, true),
                new SoftwareEngineer("Subbu", 32, true),
                new SoftwareEngineer("Durga", 60, true),
                new SoftwareEngineer("Ravi", 15, false)
        };

        Predicate<SoftwareEngineer> engineerPredicate = input-> input.getAge()>=18 && input.isIshavinggf();
        for (SoftwareEngineer engineer : list){
            if (engineerPredicate.test(engineer))
                System.out.println(engineer);
        }

    }
}
