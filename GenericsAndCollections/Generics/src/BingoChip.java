import java.util.ArrayList;

public class BingoChip<T,S>{
        /* TODO
Implement this class.
Use the instructions and check how it is used in Task.java*/
        T first;
        S second;

    public BingoChip(T f, S s){
        first = f;
        second = s;
    }

    @Override
    public String toString(){
        return "Chip:" + first  + "-" + second;
    }



}