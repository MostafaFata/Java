public class ArrayMaxMin {
    public static void main(String[] args) {
        // Find Maximum and Minimum in an Array

        int[] numbers = {10, 4, -5, 0, 20, 1};

        int max = numbers[0]; // assume the first element of the array is the max
        int min = numbers[0]; // assume the first element of the array is the min

        for (int each : numbers){
            if (each > max){ // compare against each element in array
                max = each;
            }

            if (each < min){
                min = each;
            }
        }

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);


    }
}
