package chapter_00_intro1_java_thread.demo02;

public class PrintRunnable implements Runnable{
    private String msg;
    public PrintRunnable(String msg) {
        this.msg = msg;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        new Thread(new PrintRunnable("Good!")).start();
        new Thread(new PrintRunnable("Nice!")).start();
    }
}
