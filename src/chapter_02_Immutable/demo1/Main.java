package chapter_02_Immutable.demo1;

public class Main {
    public static void main(String[] args) {
        Person alice = new Person("Alice", "Alaska");
        new PrintThread(alice).start();
        new PrintThread(alice).start();
        new PrintThread(alice).start();
    }
}
