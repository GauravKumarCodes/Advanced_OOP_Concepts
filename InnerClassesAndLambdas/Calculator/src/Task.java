import java.util.ArrayList;
import java.util.List;

public class Task {
/* TODO */
//Create a public static inner class called Triplet with generics for a first, second and third element. All variables should be publec.
    public static class Triplet<T1, T2, T3>{
        public T1 t1;
        public T2 t2;
        public T3 t3;
        public Triplet(T1 t1, T2 t2, T3 t3){
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
        }
    }
    public static String result = "";
    public static void main(String[] args){
        Calculator c = new Calculator();
        List<Triplet<Double,Double,String>> t = new ArrayList<>(); //ArrayList implementing List interface
        t.add(new Triplet<>(3.4,5.2,"+"));
        t.add(new Triplet<>(2.3,1.23,"-"));
/* TODO */
//Add the code to add a multiplication of 4.5 x 5.4, a division by zero, and divide 56.0/28.0
        t.add(new Triplet<>(4.5,5.4,"*"));
        t.add(new Triplet<>(55.2,0.0,"/"));
        t.add(new Triplet<>(56.0,28.0,"/"));

        t.forEach((triplet)-> result+= c.compute(triplet.t1, triplet.t2, triplet.t3)+"\n");


                /* TODO */
//Utilizing a lambda expression, use the calculator to compute the operation specified in each Triplet with the corresponding numbers.);
        System.out.println(result);
    }
}