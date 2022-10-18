package org.example.Executor;

import java.util.concurrent.Executor;

public class DemoExecutor implements Executor {
    @Override
    public void execute(Runnable command) {
        Thread newThread = new Thread(command);
        newThread.start();
    }
}
