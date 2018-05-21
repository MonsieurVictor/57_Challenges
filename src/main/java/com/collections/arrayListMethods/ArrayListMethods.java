package com.collections.arrayListMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This program represents ArrayList methods.
 *
 *  1. Prints the size of the ArrayList
 *  2. Sorts the ArrayList originList in ascending order
 *  3. Reverses the ArrayList originList
 *  4. Sorts the ArrayList originList in descending order
 *
 **/

public class ArrayListMethods {

    private ArrayList<Integer> originList = new ArrayList<>();
    private ArrayList<Integer> tempList = new ArrayList<>();

    private  void add_to_ArrayList(int x) {
        originList.add(x);
    }

    private ArrayList<Integer> sort_ArrayList_Asc(ArrayList<Integer> tempList) {
        this.tempList = tempList;
        Collections.sort(tempList);
        return tempList;
    }

    private ArrayList<Integer> reverse_ArrayList (ArrayList<Integer> tempList) {
        this.tempList = tempList;
        Collections.reverse(tempList);
        return tempList;
    }

    private int size_Of_ArrayList(ArrayList<Integer> tempList) {
        this.tempList = tempList;
        return tempList.size();
    }

    private ArrayList<Integer> sort_ArrayList_Desc(ArrayList<Integer> tempList) {
        /*this.tempList = tempList;
        Collections.sort(tempList);
        Collections.reverse(tempList);
        return tempList;*/
        return tempList.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
    }

    public void fillArrayList(int elementsQuantity) {
        int i =0;
        while (i < elementsQuantity) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter element " + i + ":");
            int element = sc.nextInt();
            add_to_ArrayList(element);
            i++;
        }
    }

    private void doMethods(int elementsQuantity) {

        fillArrayList(elementsQuantity);
        int size = size_Of_ArrayList(originList);

        System.out.println("Original list" + originList);
        System.out.print("Size = " + size + " ");
        printList("Reversed list: ", reverse_ArrayList(originList));
        printList("Sorted list descending: ", sort_ArrayList_Desc(originList));
        printList("Sorted list ascending: ", sort_ArrayList_Asc(originList));

    }

    private static void printList(String message, ArrayList<Integer> tempList) {
        System.out.print(message);
        for(int i: tempList){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        ArrayListMethods arrayListMethods = new ArrayListMethods();

        System.out.println("Please enter a quantity of elements 1<=T<=100:");

        Scanner sc = new Scanner(System.in);

        int elementsQuantity = sc.nextInt();

        arrayListMethods.doMethods(elementsQuantity);

        sc.close();
        }
    }
