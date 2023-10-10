package RunTimePolymorphism;

public class Splender extends Bike {
    void run()
    {
        System.out.println("Splender is Running !!");
    }

    public static void main(String[] args) {
        Bike b = new Splender();
        b.run();
    }
}
