package chapter_05_ProdicerConsumer.demo1;

import java.util.Random;

public class MakerThread extends Thread{
    private final Table table;
    private final Random random;
    private static int id = 0;

    public MakerThread(String name, Table table, long seed) {
        super(name);
        this.table = table;
        random = new Random(seed);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                String cake = "[ Cake No." + nextId() + " by " + getName() + " ]";
                table.put(cake);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static synchronized int nextId() {
        return id++;
    }
}
