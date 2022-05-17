package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {


    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "Zeeshan", "zeek@gmail.com", Arrays.asList("7017756457", "9045661878")),
                new Customer(102, "Sandeep","sandeep@gmail.com", Arrays.asList("9997452411", "8267851500")),
                new Customer(103, "Rohan", "rohan@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "Sachin", "sachin@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }


}