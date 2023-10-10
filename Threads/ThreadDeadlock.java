
class Class1{
    synchronized void foo(Class2 object){
        String name = Thread.currentThread().getName();

        System.out.println("Entered A's Foo");

        try{
            Thread.sleep(1000);
        }
        catch(Exception ie){
            System.out.println("A's Interrupted !!!");
        }
        System.out.println(name+"Trying to call B's Last");
        Class2.last();
    }
    static synchronized void last(){
        System.out.println("Inside A's last !!!!");
    }

}
class Class2{
    synchronized void bar(Class1 object1){
        String name = Thread.currentThread().getName();
        System.out.println(name+"Entered B's bar");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("B's Interrupted ");
        }
        System.out.println("Trying to call B's last !!!");
        Class1.last();
    }
    static synchronized void last(){
        System.out.println("Inside B's last !!!");
    }
}

public class ThreadDeadlock implements Runnable{
    Class1 obj1 = new Class1();
    Class2 obj2 = new Class2();
    Thread thread;

    ThreadDeadlock(){
        Thread.currentThread().setName("MainThread");
        thread = new Thread(this,"RacingThread");
    }

    void deadlockStarts(){
        thread.start();
        obj1.foo(obj2);
        System.out.println("Back to Main Thread");
    }
    public void run(){
        obj2.bar(obj1);
        System.out.println("Back to Other Thread");
    }

    public static void main(String[] args) {
        ThreadDeadlock threadDeadlock = new ThreadDeadlock();
        threadDeadlock.deadlockStarts();
    }

}
