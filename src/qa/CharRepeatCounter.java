package qa;

import java.util.HashMap;

public class CharRepeatCounter {
    // find the number of characters repeated in a given string
    public static void main(String[] args) {

        String str = "merillamel";

        char[] chars = str.toCharArray();

        HashMap<Character, Integer> counter = new HashMap<>();
        for (char ch : chars){
            if (counter.containsKey(ch)){
                counter.put(ch, counter.get(ch) + 1);
            }else {
                counter.put(ch, 1);
            }
        }

        System.out.println(counter);


    }


}
