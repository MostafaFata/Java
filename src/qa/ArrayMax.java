package qa;


public class ArrayMax {

    public static void main(String[] args) {
        // Write a program to find the largest number in an array in Java.
        int [] numbers = {1, 2, 10, 4, 0, 5};
        int max = numbers[0]; // assume that the first element of the array is the largest

        for(int num : numbers){
            if (num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
