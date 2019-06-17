package com.collections.lambda.lambdaTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 *   some lambda tests from http://code-exercises.com/programming/tags/java8-lambdas-streams/
 **/

public class LambdaTasks {

    private int i = 0;
    private Integer[] intList = {1, 34, 432, 32, 999, 42};
    private List<String> upperList = new ArrayList<>();
    private List<String> searchList = new ArrayList<>();
    private List<Integer> arrayList = new ArrayList<>();
    private List<Integer> oddList = new ArrayList<>();
    private List<Integer> evenOddList = new ArrayList<>();


    public static void main(String[] args) {
        LambdaTasks app = new LambdaTasks();
        app.start();
    }

    private void start() {

// find max value from Integer list
        System.out.println("findMax: " + findMax(intList));

// find average from arrayList using stream().mapToInt(i -> i).average().getAsDouble()

        arrayList.add(i++);
        arrayList.add(i++);
        arrayList.add(i++);
        arrayList.add(i++);
        System.out.println("average: " + average(arrayList));


        // String list to upper case conversion

        upperList.add("Hello");
        upperList.add("World");
        System.out.println("uppercase: " + upperCase(upperList));

        //returns the Nth odd element of a list. If the index of the element exceeds the list size, then return -1.

        oddList.add(1);
        oddList.add(2);
        oddList.add(3);
        oddList.add(4);
        oddList.add(5);
        oddList.add(6);
        oddList.add(7);
        System.out.println("Nth Odd element of a list: Odd elements are first, third, fifth etc..." + getNthOddElement(oddList, 3));


        // returns a list of all strings that start with the letter 'a' (lower case)
        // and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.

        searchList.add("aiwa");
        searchList.add("Ape");
        searchList.add("try");
        searchList.add("ass");
        searchList.add("art");
        System.out.println("With 'a' (lower case) and 3 letters: " + searchFilter(searchList));

        // returns a comma separated string based on a given list of integers.
        // Each element should be preceded by the letter 'e' if the number is even,
        // and preceded by the letter 'o' if the number is odd.
        // For example,if the input list is (3,44), the output should be 'o3,e44'.

        evenOddList.add(3);
        evenOddList.add(4);
        evenOddList.add(34);
        evenOddList.add(36);
        evenOddList.add(37);
        evenOddList.add(38);

        System.out.println(getCommaString(evenOddList));


    }

    private int findMax(Integer[] list) {
        int maxValue = list[0];

        for (Integer value : list) { // есть отличие int от Integer ?
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    private Double average(List<Integer> arrayList) {

        return arrayList.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }

    private List<String> upperCase(List<String> upperList) {

        return upperList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }


    public Integer getNthOddElement(List<Integer> list, Integer n) {

        int elementIndex = 2 * (n - 1);
        return elementIndex > list.size() - 1 ? -1 : list.get(elementIndex);
    }

    public List<String> searchFilter(List<String> searchList) {

        return searchList.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

    public String getCommaString(List<Integer> commaList) {

        return commaList.stream()
                .map(i -> i % 2 == 0 ? "even " + i : "odd " + i)
                .collect(joining(","));

    }
}

