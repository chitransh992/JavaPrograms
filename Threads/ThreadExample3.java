public class ThreadExample3 implements Runnable{
    String name;
    Thread thread;

    ThreadExample3(String threadName){
        name = threadName;
        thread = new Thread(this,name);
        System.out.println("New Thread :"+thread);
    }

    public void run(){
        try{
            for(int i = 5;i>0;i--){
                System.out.println(name+": "+i);
                thread.sleep(1000);
            }
        }
        catch(InterruptedException ie){
            System.out.println(name +"Interrupted");
        }
        System.out.println(name + "Existing");
    }
}
class MultiThreading{
    public static void main(String[] args) {
        ThreadExample3 thread1 = new ThreadExample3("One");
        ThreadExample3 thread2 = new ThreadExample3("Two");
        ThreadExample3 thread3 = new ThreadExample3("Three");

        thread1.thread.start();
        thread2.thread.start();
        thread3.thread.start();

        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException ie){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread Existing !!");
    }
}
