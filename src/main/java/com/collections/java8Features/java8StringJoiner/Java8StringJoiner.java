package com.collections.java8Features.java8StringJoiner;

import java.util.StringJoiner;

public class Java8StringJoiner {

    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");

        System.out.println(joinNames);

//        adding prefix and suffix

        StringJoiner joinNames2 = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames2.add("Rahul");
        joinNames2.add("Raju");
        joinNames2.add("Peter");
        joinNames2.add("Raheem");

        System.out.println(joinNames2);
    }
}

