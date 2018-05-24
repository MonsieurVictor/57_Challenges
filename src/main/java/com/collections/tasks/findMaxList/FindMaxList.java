package com.collections.tasks.findMaxList;

public class FindMaxList {

    public static void main(String[] args) {

        Integer[] list = {1, 34, 432, 32, 999, 42};
        FindMaxList findMaxList = new FindMaxList();
        int maxValue = findMaxList.findMax(list);
        System.out.println(maxValue);
    }

    private int findMax(Integer[] list){
        int maxValue = list[0];
        for (int value: list) {
            if (value>maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
