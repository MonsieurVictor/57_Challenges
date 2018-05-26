package com.collections.lambda.basicStream;

import java.util.ArrayList;
import java.util.List;

/**
 * represents the simple output from ArrayList using lambda
 **/

public class BasicStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.stream().filter(element -> {
            System.out.println(element);
            return element.equals("two");
        }).count() ;

        list.stream().forEach(x -> System.out.println(x) );
    }
}
