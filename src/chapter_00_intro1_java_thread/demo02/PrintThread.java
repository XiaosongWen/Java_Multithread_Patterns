package chapter_00_intro1_java_thread.demo02;

public class PrintThread extends Thread {
    private String msg;
    public PrintThread(String msg) {
        this.msg = msg;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        new PrintThread("Good!").start();
        new PrintThread("Nice!").start();
    }
}
