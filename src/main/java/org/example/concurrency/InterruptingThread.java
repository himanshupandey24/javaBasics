package org.example.concurrency;

public class InterruptingThread implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("InnerThread1 going to sleep at : " + System.currentTimeMillis()/1000);
            Thread.sleep(1000*1000);
        } catch (InterruptedException e) {
            System.out.println("InnerThread1 interrupted at :" + System.currentTimeMillis()/1000);
        }
    }
}
