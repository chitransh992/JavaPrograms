package ThreadClassAndRunnableExample;
class UsingRunnableInterface implements Runnable{
    public void run(){
        System.out.println("Thread is Running");

    }
}
public class RunnableInterfaceExample {
    public static void main(String[] args) {
        UsingRunnableInterface usingRunnableInterface = new UsingRunnableInterface();   //instantiate the object of UsingRunnableInterface class
        Thread thread = new Thread(usingRunnableInterface);                             //Create a thread object to pass Runnable object as parameter
        thread.start();
    }
}
