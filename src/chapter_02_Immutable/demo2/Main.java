package chapter_02_Immutable.demo2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        new WriterThread(list).start();
        new ReaderThread(list).start();
    }
}
