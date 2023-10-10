import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadPool implements Runnable {
    private String name;

    public ThreadPool(String string) {
        name = string;
    }


    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    Date d = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm::ss");

                    System.out.println("Initialization time for a " + "task name" + "task name -" + name + " = " + simpleDateFormat.format(d));
                } else {
                    Date d = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");

                    System.out.println("Executing Time for task name -" + name + " = " + simpleDateFormat.format(d));
                }
                Thread.sleep(1000);
            }
            System.out.println(name + "complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
