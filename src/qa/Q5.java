package qa;

import java.util.ArrayList;
import java.util.List;
// write a program to list out all odd numbers from a list of numbers
public class Q5 {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers){
            if(number%2 == 1){
                oddNumbers.add(number);
            }
        }

        System.out.println(oddNumbers);
    }
}
