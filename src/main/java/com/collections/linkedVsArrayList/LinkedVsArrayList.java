package com.collections.linkedVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *   This program compares the speed of ArrayList' and LinkedList' methods "get" and "add"
 **/

public class LinkedVsArrayList {

    private LinkedList <Integer> linkedList = new LinkedList<>();
    private ArrayList <Integer> arrayList = new ArrayList<>();
    private int size = 5000000;
    private int elementIndex = 100000;
    private int someNumber = 32;
    private String resultWord;

    private long getTime(){
        return System.currentTimeMillis();
    }

    private long getResultTime(long startTime) {
        return getTime() - startTime;
    }

    private String compareTime(long arrayTime, long linkedTime) {


        if(arrayTime - linkedTime > 0) {
            resultWord = "LinkedList";
        } else if (arrayTime - linkedTime == 0) {
            resultWord = "they are equal";
        } else resultWord = "ArrayList";
        return resultWord;
    }

    private void createLists(int size){

        for(int i = 0; i < size ; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    private void compareAdd() {
        createLists(size);

        long arrayListTime = getTime();
        arrayList.add(elementIndex, someNumber);

        long arrayResultTime = getResultTime(arrayListTime);

        System.out.println("Adding element #"+ elementIndex + " of ArrayList with size " + size
                + " = " + arrayResultTime + " seconds");

        long linkedListTime = getTime();
        linkedList.add(elementIndex, someNumber);

        long linkedResultTime = getResultTime(linkedListTime);

        System.out.println("Adding element #"+ elementIndex + " of LinkedList with size " + size
                + " = " + linkedResultTime + " seconds");

        System.out.println("Better is: " + compareTime(arrayResultTime,linkedResultTime));
        System.out.println();

    }

    private void compareGet() {

        createLists(size);

        long arrayListTime = getTime();
        arrayList.get(elementIndex);

        long arrayResultTime = getResultTime(arrayListTime);


        System.out.println("Getting element #" + elementIndex + " of ArrayList with size " + size
                + " = " +  arrayResultTime + " seconds");

        long linkedListTime = getTime();
        linkedList.get(elementIndex);

        long linkedResultTime = getResultTime(linkedListTime);


        System.out.println("Getting element #"+ elementIndex + " of LinkedList with size " + size
                + " = " + linkedResultTime + " seconds");

        System.out.println("Better is: " + compareTime(arrayResultTime,linkedResultTime));
        System.out.println();

    }

    public void start() {

        compareAdd();
        compareGet();
    }



    public static void main(String[] args) {
        LinkedVsArrayList linkedVsArrayList = new LinkedVsArrayList();
        linkedVsArrayList.start();
    }
}
