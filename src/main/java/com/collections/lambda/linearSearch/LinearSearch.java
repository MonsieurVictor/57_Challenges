package com.collections.lambda.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 2;
        Integer[] list = new Integer[2];
//        list = new Integer[]{i1, i2};
        for (Integer value : list) {
            value = (int) Math.random();
        }

        System.out.println(search(1, list));
    }

        public static int search(int n, Integer[] list) {

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
