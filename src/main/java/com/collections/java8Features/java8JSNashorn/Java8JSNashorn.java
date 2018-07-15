package com.collections.java8Features.java8JSNashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class Java8JSNashorn {
    public static void main(String[] args) throws Exception{
    // Creating script engine
    ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
    // Reading Nashorn file
    ee.eval(new FileReader("js/nashorn.js"));


        // Creating script engine
        ScriptEngine ee2 = new ScriptEngineManager().getEngineByName("Nashorn");
        // Evaluating Nashorn code
        ee2.eval("print('Hello Nashorn');");


        // Creating script engine
        ScriptEngine ee3 = new ScriptEngineManager().getEngineByName("Nashorn");
        // Reading Nashorn file
        ee3.eval(new FileReader("js/nashorn3.js"));
        Invocable invocable = (Invocable)ee3;
        // calling a function
        invocable.invokeFunction("functionDemo1");
        // calling a function and passing variable as well.
        invocable.invokeFunction("functionDemo2","Nashorn");
    }
}
