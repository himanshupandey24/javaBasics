package org.example.concurrency;

public class concurrencyRunner {
    public static void main(String[] args) {
        ExecuteMe execute = new ExecuteMe();
        ExecuteMeThread executeMeThread = new ExecuteMeThread();
        Thread t1 = new Thread(execute);
        t1.start();
        executeMeThread.start();
        //executeMeThread.join();
        ThreadJoins threadJoins = new ThreadJoins();
        Thread innerThread = new Thread(threadJoins);
        /*
        A daemon thread runs in the background but as soon as the main application thread exits,
        all daemon threads are killed by the JVM.
        Setting daemon as true for a thread will tell JVM to kill that thread as soon as Main thread finishes its
        execution
        If we want our main thread to wait for inner thread to finish its execution that will call join method
        on inner thread
        */
        innerThread.setDaemon(true);
        innerThread.start();
//        try {
//            innerThread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //Interrupting Thread Example
        InterruptingThread interruptingThread = new InterruptingThread();
        Thread innerThread1 = new Thread(interruptingThread);
        innerThread1.start();
        System.out.println("Main Thread going to sleep at :" + System.currentTimeMillis()/1000);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        innerThread1.interrupt();
        System.out.println("Main Thread exiting at : " + System.currentTimeMillis()/1000);


    }
}
