package qa;

import java.util.Arrays;
import java.util.HashSet;

public class Q7 {
    public static void main(String[] args) {

        // Solution to converting an array to a HashSet without looping:

        // using foreach loop
        int [] numbers1 = {1, 2, 3, 4, 5, 6, 3, 4, 1, 1, 2};

        HashSet<Integer> numberSet = new HashSet<>();
        for (int num1 : numbers1){
            numberSet.add(num1);
        }
        System.out.println(numberSet);


        // using Arrays.asList()
        Integer [] numbers = {1, 2, 3, 4, 5, 6}; // use Integer wrapper class instead of int

        HashSet<Integer> nums = new HashSet<>(Arrays.asList(numbers));

        System.out.println(nums);

        Character [] alphabets = {'A', 'B', 'C', 'A', 'D', 'B'};
        HashSet<Character> alphabetSet = new HashSet<>(Arrays.asList(alphabets));
        System.out.println(alphabetSet);

    }
}
