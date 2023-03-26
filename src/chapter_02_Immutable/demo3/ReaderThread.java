package chapter_02_Immutable.demo3;

import java.util.ConcurrentModificationException;
import java.util.List;

public class ReaderThread extends Thread{
    private final List<Integer> list;

    public ReaderThread(List<Integer> list) {
        super("ReaderThread");
        this.list = list;
    }

    public void run() {
        while (true) {
            synchronized (this) {
                for (int n : list) {
                    System.out.println(n);
                }
            }
        }
    }
}
