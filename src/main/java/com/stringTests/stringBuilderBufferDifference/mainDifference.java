package com.stringTests.stringBuilderBufferDifference;

/**
 *  Java program to demonstrate difference between
 *      - String,
 *      - StringBuilder
 *      - StringBuffer
 *
 *      Mutability Difference:
 *          String - immutable, StringBuilder and StringBuffer - mutable
 *              >> String is good for a map keys
 *              >> StringBuilder & StringBuffer are more efficient for operations like concat, find, replace etc etc
 *
 *      Thread-Safety Difference:
 *          StringBuffer is thread-safe when StringBuilder is not thread-safe
 *              >> So when the application needs to be run only in a single thread then it is better to use StringBuilder
 */
public class mainDifference {


    public static void concat1(String s1) {  // Concatenates to String
        System.out.println("s1 hash code before an attempt to change: " + s1.hashCode());
        s1 += "forgeeks";
        System.out.println("s1 hash code after an attempt to change: " + s1.hashCode());
    }

    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2) {

        s2.append("forgeeks");
    }

    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3) {

        s3.append("forgeeks");
    }

    public static void main(String[] args) {
        String s1 = "Geeks";
        System.out.println("s1 hash code: " + s1.hashCode());
        concat1(s1);  // s1 is not changed
        System.out.println("String: " + s1);
        System.out.println("s1 hash code: " + s1.hashCode());

        StringBuilder s2 = new StringBuilder("Geeks");
        concat2(s2); // s2 is changed
        System.out.println("StringBuilder: " + s2);

        StringBuffer s3 = new StringBuffer("Geeks");
        concat3(s3); // s3 is changed
        System.out.println("StringBuffer: " + s3);
    }
}

