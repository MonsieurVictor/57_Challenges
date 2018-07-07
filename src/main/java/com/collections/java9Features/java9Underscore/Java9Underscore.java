package com.collections.java9Features.java9Underscore;

/**
 * In earlier versions of Java, underscore can be used as identifier and to create variable name also. But in Java 9 release,
 * underscore is a keyword and can't be used as an identifier or variable name.
   If we use the underscore character ("_") as an identifier, our source code can no longer be compiled.*/

public class Java9Underscore {
    public static void main(String[] args) {
    int __ = 10;
    System.out.println("UnderScoreExample.java:3: error: as of release 9, " +
            "'_' is a keyword, and may not be used as an identifier");
    }
}
