import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {
    ArrayList<T> objects;
    public Bag(){ //
        /* TODO 
Initialize the objects variable*/
     objects = new ArrayList<T>();

    }
    /* TODO 
code the add method described. It should be public and not 
return anything. Just take in a parameter and  throw an 
exception. Read the documentation for this.*/
    public void add(T element) throws BagException{

        if(element == null){
            throw new BagException("Cannot add null to a Bag");
        };

        objects.add(element);

    }



 /* TODO 
Code the drawOne method here. It should not take any
parameters. It should return a generic object. More on the
task description.*/
 public T drawOne(){
     Random r = new Random();
     int low = 0;
     int high = objects.size();
     int result = r.nextInt(high-low) + low;

     //T temp = objects.get(result);
     //objects.remove(result);
     return objects.get(result);

 }



    public ArrayList drawMany(int howMany){
/* TODO
howMany is the number of elements to draw. 
Create an ArrayList of the generic type and "drawOne" as
many times as you need, putting the element drawn in the ArrayList.
Then return it. */

        int counter = 0;
        ArrayList<T> drawn = new ArrayList<T>();
        while (counter < howMany) {
            drawn.add(drawOne());
            counter++;
        }
        return drawn;
    }

    public void add(T element,double prob) throws BagException{ //needs gu
        /* TODO 
Check that the probability is between 0 and 1. Otherwise
throw an exception. */        // This is a way to add elements in a given proportion.
        if(prob < 0 || prob>1){
            throw new BagException("Probability should be between 0 and 1");
        };
        int tot = (int)Math.round(objects.size()*prob);
        for(int i=0;i<tot;i++){
            System.out.println("Adding "+i);
            objects.add(element);

        }
    }
}
