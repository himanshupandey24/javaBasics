package org.example.concurrency;

public class ThreadJoins implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Inner Thread working with daemon");
            try{
/*
            A thread can be made dormant for a specified period using the sleep method.
            However, be wary to not use sleep as a means for coordination among threads.
            It is a common newbie mistake.
            Java language framework offers other constructs for thread synchronization that’ll be discussed later.
*/
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
