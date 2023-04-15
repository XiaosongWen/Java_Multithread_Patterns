package chapter_05_ProdicerConsumer.demo1;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);
        new MakerThread("MakerThread-1", table, 3141592).start();
        new MakerThread("MakerThread-2", table, 2653589).start();
        new MakerThread("MakerThread-3", table, 3238462).start();
        new EatThread("EatThread-1", table, 1234567).start();
        new EatThread("EatThread-2", table, 2345678).start();
        new EatThread("EatThread-3", table, 3456789).start();
    }
}
