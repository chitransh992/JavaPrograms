package ThreadSleepMethod;

class callMe{
   synchronized void call(String msg){
        System.out.println("{" +msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
            System.out.println("Interrupted !!");
        }
        System.out.println("}");
    }
}
public class ThreadSynchronization implements Runnable{
    String msg;
    callMe target;
    Thread thread;

    ThreadSynchronization(callMe targ,String string){
        msg = string;
        target = targ;
        thread = new Thread(this);
    }

    public void run(){
        target.call(msg);
    }

    public void deadlockStarts() {
    }
}
class Synch{
    public static void main(String[] args) {
        callMe target = new callMe();
        ThreadSynchronization object1 = new ThreadSynchronization(target,"Hello");
        ThreadSynchronization object2 = new ThreadSynchronization(target,"Synchronized");
        ThreadSynchronization object3 = new ThreadSynchronization(target,"World");

        object1.thread.start();
        object2.thread.start();
        object3.thread.start();

        try{
            object1.thread.join();
            object2.thread.join();
            object3.thread.join();
        }
        catch(InterruptedException e){
            System.out.println("Interrupted !!!");
        }
    }
}
