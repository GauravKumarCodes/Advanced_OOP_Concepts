//import apple.laf.JRSUIConstants;

public class Racer implements Runnable { /* TODO
Add something here so that you can pass this Racer to the constructor of Thread*/


        Car c;
        int distance = 1000; // this is a racer that is going to run 1000 miles.

    /* TODO 
Create a constructor that receives a Car objec and initializes c.*/

        public Racer(Car car){
             this.c = car;
        }

    /* TODO 
Override one method.  This is the task the thread will perform... You have to determine which method this is.
Check the method description. */
        @Override
        public void run(){
            while (c.odometer < distance) {
                if (c.miles > 0) {
                    c.move(1);
                }
                else {
                    c.charge();
                    System.out.println("Charging " +c.name);
                    try {
                        Thread.sleep((long) c.maxMiles);
                    }
                    catch(InterruptedException e){
                       System.out.println("STOP");
                    }
                }
            }

        }
}
