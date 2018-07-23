package com.collections.java5Features.java5Annotations;

import java.util.ArrayList;

public class TestAnnotation {

    @SuppressWarnings("unchecked")

    public static void main(String args[]){

       /** @Override annotation assures that the subclass method is overriding the parent class method.
       If it is not so, compile time error occurs.
       Sometimes, we does the silly mistake such as spelling mistakes etc.
       So, it is better to mark @Override annotation that provides assurity that method is overridden.*/

        Animal a= new Java5Annotations();
        a.eatSomething();

        /**@SuppressWarnings annotation: is used to suppress warnings issued by the compiler.*/

        ArrayList list=new ArrayList();
        list.add("sonoo");
        list.add("vimal");
        list.add("ratan");

        for(Object obj:list)
            System.out.println(obj);

        /** @Deprecated annoation marks that this method is deprecated so compiler prints warning.
        It informs user that it may be removed in the future versions.
        So, it is better not to use such methods.*/

        A a3=new A();
        a3.n();
    }
}

