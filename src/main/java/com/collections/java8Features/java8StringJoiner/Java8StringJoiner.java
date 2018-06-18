package com.collections.java8Features.java8StringJoiner;

import java.util.StringJoiner;

public class Java8StringJoiner {

    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");

        System.out.println(joinNames);

//        adding prefix and suffix

        StringJoiner joinNames2 = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames2.add("Rahul");
        joinNames2.add("Raju");
        joinNames2.add("Peter");
        joinNames2.add("Raheem");

        System.out.println(joinNames2);

        /**     StringJoiner Methods
         */
        StringJoiner joinNames3 = new StringJoiner(","); // passing comma(,) as delimiter

        // Prints nothing because it is empty
        System.out.println(joinNames3);

        // We can set default empty value.
        joinNames3.setEmptyValue("It is empty");
        System.out.println(joinNames3);


        // Adding values to StringJoiner
        joinNames3.add("Rahul");
        joinNames3.add("Raju");
        System.out.println(joinNames3);

        // Returns length of StringJoiner
        int length = joinNames3.length();
        System.out.println("Length: "+length);

        // Returns StringJoiner as String type
        String str = joinNames3.toString();
        System.out.println(str);

        // Now, we can apply String methods on it
        char ch = str.charAt(3);
        System.out.println("Character at index 3: "+ch);

        // Adding one more element
        joinNames3.add("Sorabh");
        System.out.println(joinNames3);

        // Returns length
        int newLength = joinNames3.length();
        System.out.println("New Length: "+newLength);


        /**Merge Two StringJoiner
        **/

        StringJoiner joinNames4 = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames4.add("Rahul");
        joinNames4.add("Raju");

        // Creating StringJoiner with :(colon) delimiter
        StringJoiner joinNames5 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames5.add("Peter");
        joinNames5.add("Raheem");

        // Merging two StringJoiner
        StringJoiner merge = joinNames4.merge(joinNames5);
        System.out.println(merge);
    }
}

