package chapter_0_intro1_java_thread.demo02;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class PrintThreadFactory {
    public static void main(String[] args) {
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        threadFactory.newThread(new PrintRunnable("Good!")).start();
        threadFactory.newThread(new PrintRunnable("Nice!")).start();
    }
}
