package qa;

import java.util.*;

public class SortingCollections {
    public static void main(String[] args) {

        // ArrayList and LinkedList are by default maintain the order of elements
        Integer[] numbers = {1, 3, 5, 2, 4};

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(numbers));
        // you can sort an ArrayList using the following
        System.out.println(arrayList);
        Collections.sort(arrayList); // sorts ascending
        System.out.println(arrayList);
        Collections.sort(arrayList, Collections.reverseOrder()); // ordering descending
        System.out.println(arrayList);

        System.out.println("---------------------");

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(numbers));
        System.out.println(linkedList);
        Collections.sort(linkedList); // sorting ascending
        System.out.println(linkedList);
        Collections.sort(linkedList, Collections.reverseOrder()); // sorting descending
        System.out.println(linkedList);

        System.out.println("---------------------");

        Character[] chars = {'a', 'x', 'b', 'm', 'k'};

        // HashSets by default do not maintain the order of elements
        HashSet<Character> hashSet = new HashSet<>(Arrays.asList(chars));
        System.out.println(hashSet);

        // to have a maintained order of elements in hashset use
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>(Arrays.asList(chars));
        System.out.println(linkedHashSet);

        // TreeSet is sorted by default
        TreeSet<Character> treeSet = new TreeSet<>(Arrays.asList(chars));
        System.out.println(treeSet);

        System.out.println("---------------------");
        // HashMap does not maintain the order of elements
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("firstname", "Mostafa");
        hashMap.put("lastname", "Fata");
        hashMap.put("gender", "male");
        hashMap.put("ethnicity", "asian");
        System.out.println(hashMap);

        // to keep the order of elements use:
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("firstname", "Mostafa");
        linkedHashMap.put("lastname", "Fata");
        linkedHashMap.put("gender", "male");
        linkedHashMap.put("ethnicity", "asian");
        System.out.println(linkedHashMap);

        // to have it sorted use:
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("firstname", "Mostafa");
        treeMap.put("lastname", "Fata");
        treeMap.put("gender", "male");
        treeMap.put("ethnicity", "asian");
        System.out.println(treeMap);



    }

}
