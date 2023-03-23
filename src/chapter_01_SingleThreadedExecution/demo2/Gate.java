package chapter_01_SingleThreadedExecution.demo2;

public class Gate {
    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    public synchronized void pass(String name, String address) {
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    private synchronized void check(){
        if (name.charAt(0) != address.charAt(0)) {
            System.out.println("*************** Broken *************** " + toString());
        }
//        if (counter > 10000000) {
//            System.exit(-1);
//        }
    }
    @Override
    public String toString() {
        return "Gate{" +
                "counter=" + counter +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
