package com.collections.java8FuncInterface;

@FunctionalInterface
interface sayable{
    void say(String msg);
}
public class java8FuncInterface implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        java8FuncInterface fie = new java8FuncInterface();
        fie.say("Hello there");
    }
}