package chapter_02_Immutable.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        new WriterThread(list).start();
        new ReaderThread(list).start();
    }
}
