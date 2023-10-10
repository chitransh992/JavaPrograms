public class ThreadGroupExample implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadGroupExample threadGroupExample = new ThreadGroupExample();
        ThreadGroup threadGroup = new ThreadGroup("Parent Thread Group");

        Thread thread1 = new Thread(threadGroup,threadGroupExample,"One");
        thread1.start();
        Thread thread2 = new Thread(threadGroup,threadGroupExample,"Two");
        thread2.start();

        System.out.println("Thread Group Name :"+threadGroup.getName());
    }
}
