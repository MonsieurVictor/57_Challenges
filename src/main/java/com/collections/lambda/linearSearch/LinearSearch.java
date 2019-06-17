package com.collections.lambda.linearSearch;

/**Write a method that returns the index of the first occurrence of given integer in a list.
 Assume that the index of the first element in the list is zero.
 If the number does not exist return -1.
 */

public class LinearSearch {
    public static void main(String[] args) {
        Integer i1 = 2;
        Integer i2 = 1;
        Integer[] list = new Integer[]{i1, i2};

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
