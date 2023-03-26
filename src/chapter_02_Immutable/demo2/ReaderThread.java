package chapter_02_Immutable.demo2;

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
            try {
                for (int n : list) {
                    System.out.println(n);
                }
            } catch (ConcurrentModificationException e) {
                System.out.println("ConcurrentModificationException");
            }
        }
    }
}
