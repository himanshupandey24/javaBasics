package org.example.Executor;

public class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Running my own Task");
    }
}
