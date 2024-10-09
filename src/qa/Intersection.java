package qa;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        Integer [] a = {1, 2, 3, 4, 5, 4};
        int [] b = {4, 5, 6, 7};

        findIntersection(a, b);
    }

    public static void findIntersection(Integer [] a, int [] b){

        HashSet<Integer> setA = new HashSet<Integer>(Arrays.asList(a));


        HashSet<Integer> intersection = new HashSet<Integer>();
        for (int element : b){
            if (setA.contains(element)){
                intersection.add(element);
            }
        }

        System.out.println(intersection);

    }
}
