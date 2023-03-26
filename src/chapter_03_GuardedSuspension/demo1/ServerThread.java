package chapter_03_GuardedSuspension.demo1;

import java.util.Random;

public class ServerThread extends Thread{
    private final RequestQueue requestQueue;
    private final Random random;
    public ServerThread(RequestQueue requestQueue, String name, long seed) {
        super(name);
        this.requestQueue = requestQueue;
        random = new Random(seed);
    }
    public void run() {
        for (int i = 0; i < 10000; i++) {
            final Request request = requestQueue.getRequest();
            System.out.println(Thread.currentThread().getName() + " handles " + request);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
    }
}

