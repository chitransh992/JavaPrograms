// If child class has same method as declared in parent class, it is known as method overriding
/*                Rules:--
                1> The method must have same name as parent class
                2> The method must have same parameters as in parent class
                3> Must be in IS-A relationship
 */


package methodOverriding;
class bike{
    void run(){
        System.out.println("Bike is running");
    }
}
class vehicle extends bike {

    @Override
    void run() {
        System.out.println("Vehicle is running");
    }

    public static void main(String[] args) {
        vehicle b = new vehicle();
        b.run();

    }
}
