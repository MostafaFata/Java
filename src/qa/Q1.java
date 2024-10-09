package qa;


public class Q1 {

    public static void main(String[] args) {
        // Write a program to find the largest number in an array in Java.
        int [] numbers = {1, 2, 10, 4, 0, 5};
        int max = numbers[0]; // assume that the first element of the array is the largest

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){ // compare the max value against each element in the array
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
