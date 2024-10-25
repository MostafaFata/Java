package qa;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        // merge two arrays
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        // create a new array the length of both arrays combined
        int[] mergedArray = new int[array1.length + array2.length];

        // {1, 3, 5, 7, 0, 0, 0, 0}

        // adding elements from first Array
        for (int i =0; i < array1.length; i++){
            mergedArray[i] = array1[i];
        }

        // adding elements from second array
        for (int j=0; j < array2.length; j++){
            mergedArray[array1.length + j] = array2[j]; // consider the index number
        }

        // sort the array
        Arrays.sort(mergedArray);

        // print the array
        System.out.println(Arrays.toString(mergedArray));





    }
}
