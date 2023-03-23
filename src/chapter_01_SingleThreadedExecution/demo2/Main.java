package chapter_01_SingleThreadedExecution.demo2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Gate, hit CTRL+C ro exit.");
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bob", "Brazil").start();
        new UserThread(gate, "Chris", "Canada").start();
    }
}
