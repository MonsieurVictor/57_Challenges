package com.collections.tasks.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 2;
        Integer[] list;
        for (Integer integer : list = new Integer[](1,2)) {
            integer = (int) Math.random();
        }

        search(1, list);
    }

        public static int search(Integer n, Integer[] list) {

            int index = -1;
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals(n)) {
                index = i;
                break;
                }
            }
            return index;
    }
}
