package chapter_00_intro1_java_thread.demo01;

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.print("Good!");
        }
    }
}
