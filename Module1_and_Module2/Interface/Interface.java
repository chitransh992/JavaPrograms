package Interface;

interface Bicycle {
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}



public class Interface {
    public static void main(String[] args) {
        AvonCycle myCycle = new AvonCycle();
        myCycle.applyBrake(1);
        System.out.println(myCycle.a);


    }
}
