public class Task {
    public static void main(String[] args){
        Car c1 = new Car("Kona",250);
        Car c2 = new Car("Ioniq",220);

        /* TODO
Create a racer with c1 */

        Racer r1 = new Racer(c1); //David
        Racer r2 = new Racer(c2); //Keith


        /* TODO
Create a Racer with c2*//* TODO:
Create two threads using "new Thread" and pass  one Runnable 
to each thread.  It is your job to figure out which are the Runnables.*/
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();

    }
}