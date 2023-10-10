public class ExecutorTask1 implements Runnable{

    private String stringName;

    ExecutorTask1(String no){
        stringName = no;
    }

    public void run(){

        System.out.println(Thread.currentThread().getName()+"Start Execution, Thread No :"+stringName);

        processThread();

        System.out.println(Thread.currentThread().getName()+"Stop Execution !!");
    }

    private void processThread(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
            System.out.println("Exception caught !!!!");
        }
    }

    public String toString(){
        return this.stringName;
    }

}
