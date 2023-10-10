import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1
{
    static final int MAX_T = 3;

    public static void main(String[] args)
    {
        Runnable runnable1 = new ThreadPool("task 1");
        Runnable runnable2 = new ThreadPool("task 2");
        Runnable runnable3 = new ThreadPool("task 3");
        Runnable runnable4 = new ThreadPool("task 4");
        Runnable runnable5 = new ThreadPool("task 5");

        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        pool.execute(runnable1);
        pool.execute(runnable2);
        pool.execute(runnable3);
        pool.execute(runnable4);
        pool.execute(runnable5);

        pool.shutdown();
    }
}
