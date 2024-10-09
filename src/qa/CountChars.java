package qa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    // write a java program to count the number of each character used in a word
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        Map<Character, Integer> characterMap = new HashMap<>();

        char [] characters = str.toCharArray();

        for (char character : characters ){
            Integer lookup = characterMap.get(character);
            if (lookup == null){
                characterMap.put(character, 1);
            }else {
                characterMap.put(character, lookup+1);
            }
        }

        System.out.println(characterMap);

    }
}
