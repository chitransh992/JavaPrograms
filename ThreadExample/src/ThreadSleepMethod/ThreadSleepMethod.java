package ThreadSleepMethod;

class sleepMethod extends Thread{
    public void run(){
        for(int i = 0;i<=5;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }

    }
}
public class ThreadSleepMethod {
    public static void main(String[] args) {
        sleepMethod object1 = new sleepMethod();
        object1.start();
    }
}
