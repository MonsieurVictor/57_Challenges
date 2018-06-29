package com.collections.java9Features.java9SafeVarArgs;
import java.util.ArrayList;
import java.util.List;

/** It is an annotation which applies on a method or constructor that takes varargs parameters.
 * It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
 * It was included in Java7 and can only be applied on
 * Final methods
 * Static methods
 * Constructors
 * From Java 9, it can also be used with private instance methods.
 **/



public class Java9SafeVarArgs {

    // Applying @SaveVarargs annotation

    @SafeVarargs
    private void display(List<String>... products) { // Not using @SaveVarargs
        for (List<String> product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {

        UnsafeVarArgs unsafeVarArgs = new UnsafeVarArgs();
        List<String> unsafeList = new ArrayList<String>();
        unsafeList.add("Unsafe Laptop");
        unsafeList.add("Unsafe Tablet");
        unsafeVarArgs.display(unsafeList);

/**    It produces warning messages at compile time, but compiles without errors.


       To avoid it, we should use @SaveVarargs notation to the method, as we did in the following example.
 */

        Java9SafeVarArgs safeVarArgs = new Java9SafeVarArgs();
        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablet");
        safeVarArgs.display(list);
    }

    private static class UnsafeVarArgs {
        private void display(List<String>... products) { // Not using @SaveVarargs
            for (List<String> product : products) {
                System.out.println(product);
            }
        }
    }
}
