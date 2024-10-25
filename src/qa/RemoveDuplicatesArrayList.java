package qa;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesArrayList {
    // Write a Java program to remove duplicate elements from already constructed ArrayList
    public static void main(String[] args) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        duplicates.add(1);
        duplicates.add(1);
        duplicates.add(2);
        duplicates.add(2);
        duplicates.add(3);
        duplicates.add(3);
        System.out.println(duplicates);

        HashSet<Integer> nonduplicates = new HashSet<>(duplicates);
        System.out.println(nonduplicates);
    }
}
