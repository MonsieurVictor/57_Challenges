package com.collections.java5Features.java5CovariantReturn;

public class additionalClass extends Java5CovariantReturn {

    additionalClass get(){
        return this;
    }

    void message(){
        System.out.println("welcome to covariant return type");
    }

    public static void main(String args[]){
        new additionalClass().get().message();
    }

}
