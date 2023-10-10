package Interface;

class zAvonCycle implements Bicycle{
    void blowHorn(){

        System.out.println("Blowing Horn !!");
    }
    public void applyBrake(int decrement){

        System.out.println("Applying Brakes !!");
    }
    public void speedUp(int increment){

        System.out.println("Creating SpeedUP");
    }
}