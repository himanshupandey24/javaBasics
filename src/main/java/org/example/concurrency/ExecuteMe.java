package org.example.concurrency;

public class ExecuteMe implements Runnable{
    @Override
    public void run() {
        System.out.println("Execute me which implemented Runnable");
    }
}
