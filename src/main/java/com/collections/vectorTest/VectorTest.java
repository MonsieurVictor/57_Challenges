package com.collections.vectorTest;

import java.util.ArrayList;
import java.util.Vector;

/**
 * this program shows features of Vector class:
 * ThreadSafe and can show its capacity,
 * but adds 100% of capacity (ArrayList is 50%) and slower than ArrayList
 **/

public class VectorTest {
    // Java code illustrating add() method
    public static void main(String[] args) {

        // create default vector
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);
        System.out.println("Vector v: " + v);
        System.out.println("Vector v size: " + v.size());
        System.out.println("Vector v capacity: " + v.capacity());

        // create default vector
        Vector vIndex = new Vector();
        vIndex.add(0, 1);
        vIndex.add(1, 2);
        vIndex.add(2, 3);
        vIndex.add(3, 4);
        vIndex.add(4, 5);
        vIndex.add(5, 6);
        vIndex.add(6, 7);
        vIndex.add(7, 8);
        vIndex.add(8, 9);
        vIndex.add(9, 10);
        vIndex.add(10, 11);

        System.out.println("\nVector vIndex: " + vIndex);
        System.out.println("Vector vIndex size: " + vIndex.size());
        System.out.println("Vector vIndex capacity: " + vIndex.capacity());

        ArrayList arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add("geeks");
        arrayList.add("forGeeks");
        arrayList.add(4);
        Vector vAddAll = new Vector();
        vAddAll.addAll(arrayList);
        System.out.println("\nAdd arrayList to vAddAll: " + vAddAll);


        ArrayList arrCollection = new ArrayList();
        arrCollection.add(1);
        arrCollection.add(2);
        System.out.println("\narrCollection: " + arrCollection);
        Vector vCollection = new Vector();
        vCollection.add(3);
        System.out.println("vCollection: " + vCollection);
        arrCollection.addAll(1, vCollection);
        System.out.println("Adding vCollection to arrCollection to index \"1\"...");
        System.out.println("arrCollection: " + arrCollection);

        arrCollection.clear();
        System.out.println("\narrCollection after clearing: " + arrCollection);

    }
}
