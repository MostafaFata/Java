package qa;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemovingDuplicates {
    public static void main(String[] args) {

        // removing duplicate characters from a string
        String string = "AAYYYBBCCDDEEFFGGHHXXXXCCCVVVVBBBB";
        System.out.println(removeDuplicates(string));
        System.out.println(removeDuplicatesUsingHashSet(string));

    }

    // method one: checking each character for duplication
    public static String removeDuplicates(String string){
        String clean = "";
        for (int i = 0; i < string.length(); i++){
            String ch = String.valueOf(string.charAt(i));
            if (!clean.contains(ch)){
                clean += ch;
            }
        }
        return clean;
    }

    // method two: using LinkedHashSet ** maintains the order of element
    public static String removeDuplicatesUsingHashSet(String string){
        char[] chars = string.toCharArray();

        LinkedHashSet<Character> nonDuplicates = new LinkedHashSet<>();

        for (char ch : chars){
            nonDuplicates.add(ch);
        }

        String clean = "";
        for (Character each : nonDuplicates){
            clean += each;
        }

        return clean.toString();

    }


}
