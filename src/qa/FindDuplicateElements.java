package qa;

import java.util.HashSet;

public class FindDuplicateElements {
    public static void main(String[] args) {

        // find the duplicate elements in an array
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 5, 7};

        // create a hashSet to store a single instance of each element
        HashSet<Integer> uniques = new HashSet<>();

        // create another hashSet to store duplicates
        HashSet<Integer> duplicates = new HashSet<>();

        // loop through the array of numbers
        for(int num : numbers){
            // check if number is already added in unique hashset
            if (!uniques.add(num)){ // this returns false if element already exists
                duplicates.add(num); // add the element that already exists in unique to duplicates
            }

        }

        System.out.println(duplicates);

    }
}
