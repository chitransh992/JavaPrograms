package SetNameExample;

public class TestNamingExample extends Thread{
    public void run(){
        System.out.println("Thread is Running");
    }
    public static void main(String[] args) {
        TestNamingExample testName = new TestNamingExample();
        System.out.println("Name of the Thread :"+testName.getName());
        testName.start();
        testName.setName("Amit Mishra");
        System.out.println("After Changing the name :"+testName.getName());
    }
}
