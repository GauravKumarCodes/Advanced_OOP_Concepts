import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task {
    /* TODO
Declare a static ExecutorService named service */

    static ExecutorService service = null;

    public static void main(String[] args) {
        Car c1 = new Car("Kona", 250);
        Car c2 = new Car("Ioniq", 220);
          /* TODO
Create a Runnable with c1*/
        /* TODO
Create a Runnable with c2*/
        ;
        Racer r1 = new Racer(c1); //David
        Racer r2 = new Racer(c2); //Keith
        initExecutorService();
        try {
            service.execute(r1);
            service.execute(r2);
        } finally {
            if (service != null) service.shutdown();
        }
    }
    public static void initExecutorService() {
            service = Executors.newFixedThreadPool(3);
    }


        /* TODO
Submit both runnables to the ExecutorService and then request the ExecutorService to shutdown */

    }

/* TODO
Implement the initExecutorService method. This has to initialize service to a new FixedThreadPool with a minimum of 3 threads */





