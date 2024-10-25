package qa;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateFibSeq {
    public static void main(String[] args) {

        System.out.println(fib(8));

    }

    public static ArrayList<Long> fib(int num){

        ArrayList<Long> seq = new ArrayList<>();
        seq.add(0L);
        seq.add(1L);

        for(int i =2; i < num; i++){
            seq.add(seq.get(i-1) + seq.get(i-2));
        }

        return seq;

    }
}
