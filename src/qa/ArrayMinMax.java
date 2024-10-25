package qa;

import java.util.Arrays;

public class ArrayMinMax {
    // find the smallest and largest numbers in an array
    public static void main(String[] args) {
        int[] numbers = {10, 2, 3, 11, 100, 40, 22};
        findMinMax(numbers);
        findMaxMin(numbers);
    }

    // method one: using sort
    // not the sufficient way
    // O(n) or linear time complexity
    public static void findMinMax(int[] numbers){
        Arrays.sort(numbers);
        System.out.println("Min:" + numbers[0]);
        System.out.println("Max:" + numbers[numbers.length-1]);
    }

    // method two: using loop
    // more efficient way
    public static void findMaxMin(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers){
            if (num > max){
                max = num;
            }else if (num < min){
                min = num;
            }
        }
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
    }
}
