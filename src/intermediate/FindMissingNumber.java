package intermediate;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(missingNum(nums));

    }

    // to find a missing number in a sequence follow this formula
    // missing number = expected sum - actual sum
    // expected sum = n(n+1)/2
    // n is the largest in the array

    public static int missingNum(int[] numbers){
        int missing = 0;

        // find the largest element in array
        int max = 0;
        int actualSum = 0;
        for(int num : numbers){
            if (num > max){
                max = num;
            }
            actualSum += num;
        }

        // find the expected sum
        int expectedSum = (max * (max+1))/2;

        // find the missing number
        missing = expectedSum - actualSum;

        return missing;
    }

}
