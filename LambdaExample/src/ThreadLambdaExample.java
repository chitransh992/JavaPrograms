public class ThreadLambdaExample {
    public static void main(String[] args) {
        //Without using Lambda Expression
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is Running");
            }
        };
        Thread thread1 = new Thread(r1);
        thread1.start();

        //With using Lambda Expression
        Runnable r2 = ()->System.out.println("Thread2 is Running");;
        Thread thread2 = new Thread(r2);
        thread2.start();

    }
}
