package ThreadClassAndRunnableExample;

class UsingThreadClass extends Thread{
    public void run(){
        System.out.println("Thread is Running");
    }
}

public class ThreadClassExample {
    public static void main(String[] args) {
      UsingThreadClass usingThreadClass = new UsingThreadClass();
      usingThreadClass.start();
    }
}
