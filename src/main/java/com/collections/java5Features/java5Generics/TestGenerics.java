package com.collections.java5Features.java5Generics;

class MyGen<T>{
    T obj;
    void add(T obj){this.obj=obj;}
    T get(){return obj;}
}

public class TestGenerics {

    public void tryGenericClass () {
        MyGen<Integer> m = new MyGen<Integer>();
        m.add(2);
//m.add("vivek");//Compile time error
        System.out.println(m.get());
    }
}
