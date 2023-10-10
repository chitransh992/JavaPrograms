
//Creating a new thread and start it running
public class ThreadExample2 implements Runnable{   //creating a second thread
    Thread thread;

    ThreadExample2(){
        //creating a new second thread

        thread = new Thread(this,"Demo Thread");   //passing this is you want the new thread to use run method
        System.out.println("Child Thread :"+thread);
    }

    //entry point for the second thread

    public void run(){
        try{
            for(int i = 5;i>0;i--)
            {
                System.out.println("Child Thread: "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException ie){
            System.out.println("Child Thread Interrupted ");
        }
        System.out.println("Existing Child Thread");
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        ThreadExample2 thread2 = new ThreadExample2();   //creating new thread

        thread2.thread.start();   //starts the thread

        try{
            for(int i = 5;i>0;i--)
            {
                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("Main Thread is interrupted");
        }
        System.out.println("Existing Main Thread");
    }
}
