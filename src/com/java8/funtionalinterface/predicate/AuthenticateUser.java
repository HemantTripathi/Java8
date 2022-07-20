package com.java8.funtionalinterface.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

// Write a sample program to authenticate User
public class AuthenticateUser {
    public static void main(String[] args) {

        // 1. create User class with attributes as username and passwords
        // 2. Write predicate logic
        // 3. Get the input from Scanner class
        // 4. Print

        Predicate<User> userPredicate = input->input.getUsername().equalsIgnoreCase("hemant") &&
                input.getPassword().equalsIgnoreCase("tripathi");

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username  = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();

        User user = new User(username,password);
        if(userPredicate.test(user))
            System.out.println("Authentication Successful");
        else System.out.println("Authentication Failure");


    }
}
