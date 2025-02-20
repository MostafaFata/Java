package qa;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interview {

    public static void main(String[] args) {

        // find a missing number from a sequence of numbers starting from a random number
        // e.g. {70, 71, 72, 73, 74, 75, 77, 78, 79}

        int[] numbers = {70, 71, 72, 74, 75, 76, 78, 79, 80};
        System.out.println(findMissingNumber(numbers));






    }


    public static List<Integer> findMissingNumber(int[] numbers){

        int start = numbers[0];
        int end = numbers[numbers.length-1];

        List<Integer> missings = new LinkedList<>();

        for (int i = start; i <= end; i++){

            // need to check if element is in array
            if (!numberExists(numbers, i)){
                missings.add(i);
            }
        }

        return missings;


    }

    public static boolean numberExists(int[] numbers, int i){
        for(int num : numbers){
            if (num == i){
                return true;
            }
        }
        return false;
    }
















} // end of class
