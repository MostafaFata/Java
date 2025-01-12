package qa;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {

        // reverse a linkedList using Jav

        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

        LinkedList<Integer> reversedList = new LinkedList<>();

        list.descendingIterator().forEachRemaining(reversedList::add);
        // descendingIterator() method is used to iterate over a collection in reverse order
        // Use the forEachRemaining() method to iterate over the remaining elements in descending order.

        System.out.println(reversedList);

    }
}
