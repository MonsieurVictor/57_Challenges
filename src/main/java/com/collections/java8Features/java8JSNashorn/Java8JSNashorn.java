package com.collections.java8Features.java8JSNashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

    /**
    Nashorn is a JavaScript engine. It is used to execute JavaScript code dynamically at JVM (Java Virtual Machine).
    Java provides a command-line tool jjs which is used to execute JavaScript code.
    You can execute JavaScript code by using jjs command-line tool and by embedding into Java source code.
    */

public class Java8JSNashorn {
    public static void main(String[] args) throws Exception{


    /**  Example: Executing by Using Terminal
    Following is the step by step process to execute JavaScript code at the JVM.
    1) Create a file hello.js.
    2) Write and save the following code into the file.
            var hello = function(){
        print("Hello Nashorn");
    };
    hello();
    3) Open terminal
    4) Write command jjs hello.js and press enter.
    After executing command, you will see the below output.
            Output:
    Hello Nashorn*/

    // Creating script engine
    ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
    // Reading Nashorn file
    ee.eval(new FileReader("js/nashorn.js"));


    /** You can embed your JavaScript code in Java source file.
    Java compiler will not complaint but it is not good practice when you have large source code.
    In the following example, we are evaluating JavaScript code.
    */
    // Creating script engine
    ScriptEngine ee2 = new ScriptEngineManager().getEngineByName("Nashorn");
    // Evaluating Nashorn code
    ee2.eval("print('Hello Nashorn');");

    /**
    You can call JavaScript function inside the Java file. In the followed example, we are calling JavaScript functions.
    Example: Calling function inside Java code
    File: hello.js
    var functionDemo1 = function(){
    print("This is JavaScript function");
    }
    var functionDemo2 = function(message){
    print("Hello "+message);
    }
     */

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
