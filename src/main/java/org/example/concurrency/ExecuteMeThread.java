package org.example.concurrency;

public class ExecuteMeThread extends Thread{
//    The con of the ExecuteMeThread extends Thread is that one is forced to extend the Thread class
//    which limits code’s flexibility.
//    Passing in an object of a class implementing the Runnable interface may be a better choice in most cases.
    @Override
    public void run(){
        System.out.println("Execute me which extended threads");
    }
}
