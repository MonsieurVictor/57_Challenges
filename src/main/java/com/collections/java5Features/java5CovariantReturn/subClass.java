package com.collections.java5Features.java5CovariantReturn;

public class subClass extends Java5CovariantReturn {

    subClass get(){
        return this;
    }

    void message(){
        System.out.println("welcome to covariant return type");
    }

    public static void main(String args[]){
        new subClass().get().message();
    }

}
