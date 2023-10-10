//Usage of join() and isAlive() method in threads
public class ThreadExample4 implements Runnable{
    String name;
    Thread thread;

    ThreadExample4(String ThreadName){
        name = ThreadName;
        thread = new Thread(this,name);
        System.out.println("New Thread :"+thread);
    }
    public void run(){
        try{
            for(int i = 5;i>0;i--){
                System.out.println(name+":"+thread);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie){
            System.out.println(name+"Interrupted");
        }
        System.out.println(name+"Existing");
    }
}

class DemoJoin{
    public static void main(String[] args) {
        ThreadExample4 thread1 = new ThreadExample4("One");
        ThreadExample4 thread2 = new ThreadExample4("Two");
        ThreadExample4 thread3 = new ThreadExample4("Three");
        ThreadExample4 thread4 = new ThreadExample4("Four");

        thread1.thread.start();
        thread2.thread.start();
        thread3.thread.start();
        thread4.thread.start();

        System.out.println("Thread one is still alive :"+thread1.thread.isAlive());
        System.out.println("Thread two is still alive :"+thread2.thread.isAlive());
        System.out.println("Thread three is still alive :"+thread3.thread.isAlive());
        System.out.println("Thread four is still alive :"+thread4.thread.isAlive());

        try{
            System.out.println("Waiting for threads to finish :");
            thread1.thread.join();
            thread2.thread.join();
            thread3.thread.join();
            thread4.thread.join();
        }
        catch(InterruptedException ie){
            System.out.println("Main thread Exception");
        }
        System.out.println("Thread one is alive :"+thread1.thread.isAlive());
        System.out.println("Thread two is alive :"+thread2.thread.isAlive());
        System.out.println("Thread three is alive :"+thread3.thread.isAlive());
        System.out.println("Thread four is alive :"+thread4.thread.isAlive());

        System.out.println("Main thread Existing !!!");
    }
}
