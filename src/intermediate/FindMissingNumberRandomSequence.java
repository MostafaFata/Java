package intermediate;

public class FindMissingNumberRandomSequence {
    public static void main(String[] args) {

        // find the missing number from a random sequence of numbers
        // e.g. {70, 71, 72, 73, 74, 75, 76, 78, 79, 80}
        // output: 77

        int[] numbers = {70, 71, 72, 73, 74, 75, 76, 78, 79, 80};
        System.out.println(findMissingNumber(numbers));


    }

    public static int findMissingNumber(int[] numbers){

        // store the starting and ending numbers in the sequence
        int start = numbers[0];
        int end = numbers[numbers.length-1];

        // start a loop from starting number till ending number
        // increase by one in each iteration
        for (int i = start; i <= end; i++){
            // create a function to check if iteration exists in the sequence
            // if the number is not already in sequence, it is the missing number
            if (!checkNumberExists(numbers, i)){
                return i;
            }
        }
        return -1;
    }

    // helper method to check if number already exists in the sequence
    public static boolean checkNumberExists(int[] numbers, int i){
        for(int num : numbers){
            if(num == i){
                return true;
            }
        }
        return false;
    }
}
