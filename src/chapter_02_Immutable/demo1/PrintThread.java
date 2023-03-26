package chapter_02_Immutable.demo1;

public class PrintThread extends Thread{
    private Person person;

    public PrintThread(Person person) {
        this.person = person;
    }
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " prints " + person);
        }
    }

}
