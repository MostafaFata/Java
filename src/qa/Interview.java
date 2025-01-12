package qa;

import java.util.*;

public class Interview {

    public static void main(String[] args) {

        // reverse a linkedList

        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        LinkedList<Integer> reversedList = new LinkedList<>();

        list.descendingIterator().forEachRemaining(reversedList::add);

        System.out.println(reversedList);
    }









} // end of class
