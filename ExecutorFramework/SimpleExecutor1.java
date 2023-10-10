import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class SimpleExecutor1 {
    public static void main(String[] args) {
     ExecutorService executorService = Executors.newFixedThreadPool(5);

     for(int i = 0;i<5;i++){
         Runnable task = new ExecutorTask1(" "+i);
         executorService.execute(task);

     }
     executorService.shutdown();
     while(!executorService.isTerminated()){
     }
        System.out.println("All Threads Finished");
    }
}
