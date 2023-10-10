public class InterThreadCommunication {
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while(!valueSet){
            try{
                wait();
            }
            catch(InterruptedException ie){
                System.out.println("Producer InterruptedException caught !!!");
            }
        }
        System.out.println("Got :"+n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n){
        while(valueSet){
            try{
                wait();
            }
            catch(InterruptedException ie){
                System.out.println("Consumer InterruptedException caught !!!");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put :"+n);
        notify();
    }
}

class Producer implements Runnable{
    InterThreadCommunication interThreadCommunication;
    Thread thread;

    Producer(InterThreadCommunication interThreadCommunication){
        this.interThreadCommunication = interThreadCommunication;
        thread = new Thread(this,"Producer");
    }

    public void run(){
        int i = 0;

        while(true){
            interThreadCommunication.put(i++);
        }
    }
}

class Consumer implements Runnable{
    InterThreadCommunication interThreadCommunication;
    Thread thread;

    Consumer(InterThreadCommunication interThreadCommunication){
        this.interThreadCommunication = interThreadCommunication;
        thread = new Thread(this,"Consumer");

    }
    public void run(){
        while(true){
            interThreadCommunication.get();
        }
    }
}

class ProducerConsumer{
    public static void main(String[] args) {
        InterThreadCommunication interThreadCommunication = new InterThreadCommunication();
        Producer producer = new Producer(interThreadCommunication);
        Consumer consumer = new Consumer(interThreadCommunication);

        producer.thread.start();
        consumer.thread.start();

            System.out.println("Press c and v to stop !!!");

    }

}
