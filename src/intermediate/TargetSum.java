package intermediate;

import java.util.Arrays;
import java.util.HashMap;

public class TargetSum {
    public static void main(String[] args) {

        // Given an array of integers, find two numbers that add up to a specific target.
        // eg. {2, 7, 11, 15} | target = 9 | result {2, 7}

        int[] numbers = {2, 6, 7, 10, 11};

        System.out.println(Arrays.toString(findSumPair(numbers, 9)));


    }

    public static int[] findSumPair(int[] numbers, int target){

        // create a hashmap to store each iteration after if condition
        HashMap<Integer, Integer> pair = new HashMap<>();

        // loop through the number
        for (int i = 0; i < numbers.length; i++){
            // find the difference between target and each element
            int complement = target - numbers[i];

            // check if difference is a number that already exists in the hashmap
            if (pair.containsValue(complement)){
                // if so, the difference and current iteration are the pair
                return new int[] {complement, numbers[i]};
            }

            // otherwise, add the iteration in hashmap for validation
            pair.put(i, numbers[i]);
        }

        // return an empty array if no pair found
        return new int[]{};

    }
}
