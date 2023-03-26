package chapter_02_Immutable.demo3;

import java.util.List;

public class WriterThread extends Thread{
    private final List<Integer> list;

    public WriterThread(List<Integer> list) {
        super("WriterThread");
        this.list = list;
    }

    public void run() {
        int i = 0;
        while (true){
            list.add(i++);
            list.remove(0);
        }
    }
}
