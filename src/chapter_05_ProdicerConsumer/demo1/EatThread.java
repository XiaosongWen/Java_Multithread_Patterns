package chapter_05_ProdicerConsumer.demo1;

import java.util.Random;

public class EatThread extends Thread{
    private final Table table;
    private final Random random;

    public EatThread(String name, Table table, long seed) {
        super(name);
        this.table = table;
        random = new Random(seed);
    }

    @Override
    public void run() {
        try {
            while (true) {
                String cake = table.take();
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
