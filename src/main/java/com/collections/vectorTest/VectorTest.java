package com.collections.vectorTest;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {
    // Java code illustrating add() method
    public static void main(String[] args) {

        // create default vector
        Vector v = new Vector();


        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);

        System.out.println("Vector is " + v);

        // create default vector
        Vector vBoolean = new Vector();


        vBoolean.add(0, 1);
        vBoolean.add(1, 2);
        vBoolean.add(2, "geeks");
        vBoolean.add(3, "forGeeks");
        vBoolean.add(4, 3);

        System.out.println("Vector is " + vBoolean);

        ArrayList arr = new ArrayList();
        arr.add(3);
        arr.add("geeks");
        arr.add("forgeeks");
        arr.add(4);


        // createn default vector
        Vector vAddAll = new Vector();


        // copying all element of array list int0 vector
        vAddAll.addAll(arr);

        // checking vector v
        System.out.println("vector v:" + vAddAll);







        ArrayList arrCollection = new ArrayList();
        arrCollection.add(3);
        arrCollection.add("geeks");
        arrCollection.add("forgeeks");
        arrCollection.add(4);


        // createn default vector
        Vector vCollection = new Vector();

        vCollection.add(2);
        // copying all element of array list int0 vector
        vCollection.addAll(1, arrCollection);

        // checking vector v
        System.out.println("vector v:" + vCollection);




        Vector vClear = new Vector();


        vClear.add(0, 1);
        vClear.add(1, 2);
        vClear.add(2, "geeks");
        vClear.add(3, "forGeeks");
        vClear.add(4, 3);

        System.out.println("Vector is: " + vClear);

        //clearing the vector
        vClear.clear();

        // checking vector
        System.out.println("after clearing: " + vClear);

    }
}
