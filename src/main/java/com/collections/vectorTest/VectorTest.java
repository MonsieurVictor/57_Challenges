package com.collections.vectorTest;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {
    // Java code illustrating add() method
        public static void main(String[] args)
        {

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

        }
    }
}
