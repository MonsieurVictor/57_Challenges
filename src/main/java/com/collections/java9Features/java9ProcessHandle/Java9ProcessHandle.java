package com.collections.java9Features.java9ProcessHandle;

/**
 * ProcessHandle helps to handle and control processes.
 * We can monitor processes, list its children, get information etc.
 * This interface contains static factory methods that return instances that are value-based,
 * immutable and thread-safe.
 **/

public class Java9ProcessHandle {
    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();     // Current processhandle
        System.out.println("Process Id: "+currentProcess.pid());    // Process id
        System.out.println("Direct children: "+ currentProcess.children()); // Direct children of the process
        System.out.println("Class name: "+currentProcess.getClass());       // Class name
        System.out.println("All processes: "+ProcessHandle.allProcesses()); // All current processes
        System.out.println("Process info: "+currentProcess.info());         // Process info
        System.out.println("Is process alive: "+currentProcess.isAlive());
        System.out.println("Process's parent "+currentProcess.parent());  // Parent of the process
    }
}

