package com.collections.java8Features.java8ParallelArraySort;

/**
Java provides a new additional feature in Array class which is used to sort array elements parallel.
 New methods has added to java.util.Arrays package that use the JSR 166 Fork/Join parallelism common pool
 to provide sorting of arrays in parallel.The methods are called parallelSort()
 and are overloaded for all the primitive data types and Comparable objects.
*/

import java.util.Arrays;
public class Java8ParallelArraySort {
    public static void main(String[] args) {
        // Creating an integer array
        int[] arr = {5, 8, 1, 0, 6, 9};
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // Sorting array elements parallel
        Arrays.parallelSort(arr);
        System.out.println("\nArray elements after sorting");
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i + " ");
        }
       /** example2: Passing Start and End Index
        In the following example, we are passing starting and end index of the array. The first index is inclusive and end index is exclusive i.e. if we pass 0 as start index and 4 as end index, only 0 to 3 index elements will be sorted.
        It throws IllegalArgumentException if start index > end index.
        It throws ArrayIndexOutOfBoundsException if start index < 0 or end index > a.length.*/
        // Creating an integer array
        int[] arr2 = {5, 8, 1, 0, 6, 9, 50, -3};
        // Iterating array elements
        for (int i2 : arr2) {
            System.out.print(i2 + " ");
        }
        // Sorting array elements parallel and passing start, end index
        Arrays.parallelSort(arr2, 0, 4);
        System.out.println("\nArray elements after sorting");
        // Iterating array elements
        for (int i2 : arr2) {
            System.out.print(i2 + " ");
        }
    }
}
