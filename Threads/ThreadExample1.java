
//Example to control main Thread
public class ThreadExample1 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();    //currentThread() is used to get the reference of the current thread
                                                   //which is stored in thread

        System.out.println("Current Thread : "+thread);

        thread.setName("My Thread");          //setName() is used to change the internal name of the thread

        System.out.println("After Execution :"+thread);

       //the sleep can cause interrupted exception hence use try catch block

        try{
            for(int i = 5;i>0;i--)
            {
                System.out.println(i);
                Thread.sleep(1000);  //The sleep() is used to specify the delay period in milliseconds
            }
        }
        catch(InterruptedException ie){
            System.out.println("Main thread interrupted");
        }
    }
}
