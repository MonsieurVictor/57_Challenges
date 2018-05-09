package com.collections.arrayListMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This program represents ArrayList methods.
 *
 *  Input: The first line of input contains an integer T denoting the number of test cases .
 *  Then T test cases follow. The first line of input contains an integer Q denoting the no of queries .
 *  Then in the next line are Q space separated queries .
 *
 *  Constraints:
 *  1<=T<=100
 *  1<=Q<=100
 *
 *  A query can be of five types:
 *  1. a x (Adds an element x to the ArrayList A at the end )
 *  2. b (Sorts the ArrayList A in ascending order )
 *  3. c (Reverses the ArrayList A)
 *  4. d (prints the size of the ArrayList)
 *  5. e (prints space separated values of the ArrayList)
 *  6. f  (Sorts the ArrayList A in descending order)
 *
 *  Output:
 *  The output for each test case will  be space separated integers denoting the results of each query .
 *
 **/


public class ArrayListMethods {
    /*
     * inserts an element x at the back of the ArrayList A
     */
    void add_to_ArrayList(ArrayList<Integer> A, int x) {
        // Your code here
        A.add(x);
    }

    /* sort the ArrayList A in ascending order */
    void sort_ArrayList_Asc(ArrayList<Integer> A) {
        // Your code here
        Collections.sort(A);
    }

    /* reverses the ArrayList A */
    void reverse_ArrayList(ArrayList<Integer> A) {
        // Your code here
        Collections.reverse(A);
    }

    /* returns the size of the ArrayList A */
    int size_Of_ArrayList(ArrayList<Integer> A) {
        // Your code here
        return A.size();
    }

    /* sorts the ArrayList A in descending order */
    void sort_ArrayList_Desc(ArrayList<Integer> A) {
        // Your code here
        // Collections.reverseOrder(Collections.sort(A));
        Collections.sort(A);
        Collections.reverse(A);
    }

    /*
     * prints space separated elements of ArrayList A
     */
    void print_ArrayList(ArrayList<Integer> A) {
        // Your code here
        for (Integer i : A) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter an integer 1<=T<=100:");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayListMethods arrayListMethods = new ArrayListMethods();
        while (t-- > 0) {
            System.out.println("Enter Q space separated queries");
            int q = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < q; i++) {
                System.out.println("Enter query " + i + ":");
                String s = sc.next();
                if (s.length() == 1) {
                    char x = s.charAt(0);
                    if (x == 'a') {
                        int data = sc.nextInt();
                        arrayListMethods.add_to_ArrayList(list, data);
                    }
                    if (x == 'b') {
                        arrayListMethods.sort_ArrayList_Asc(list);
                    }
                    if (x == 'c') {
                        arrayListMethods.reverse_ArrayList(list);
                        }
                        if (x == 'd') {
                            int size = arrayListMethods.size_Of_ArrayList(list);
                            System.out.print(size + " ");
                        }
                        if (x == 'e') {
                            arrayListMethods.print_ArrayList(list);
                        }
                        if (x == 'f') {
                            arrayListMethods.sort_ArrayList_Desc(list);
                        }
                    }
                }
            }
            sc.close();
//        for (int i =0; i < arrayListMethods.size_Of_ArrayList(list); i++)
        System.out.println(arrayListMethods);
        }
    }
