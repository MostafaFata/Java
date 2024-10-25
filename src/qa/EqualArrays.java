package qa;

import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        // check if two arrays are equal
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 4, 1, 2};

        // first sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));


        // if arrays are multi dimensional
        String[][] info1 = {{"firstname", "lastname"}, {"Mostafa", "Fata"}};
        String[][] info2 = {{"firstname", "lastname"}, {"Mostafa", "Fata"}};

        System.out.println(Arrays.deepEquals(info1, info2));
    }
}
