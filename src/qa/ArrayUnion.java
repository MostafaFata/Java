package qa;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayUnion {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 5};
        Integer[] arr2 = {3, 4, 5, 2};

        System.out.println(union(arr1, arr2));
    }

    public static HashSet<Integer> union(Integer[] arr1, Integer[] arr2){

        HashSet<Integer> union = new HashSet<>(Arrays.asList(arr1));

        for(Integer a : arr2){
            union.add(a);
        }

        return union;
    }
}
