package qa;

import java.util.HashMap;
import java.util.HashSet;

public class MostFrequentChar {
    public static void main(String[] args) {
        System.out.println(mostFrequentChar("success"));
    }

    public static char mostFrequentChar(String str){

        char[] chars = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }

        int max = 0;
        char ch = Character.MIN_VALUE;
        for(char c : map.keySet()){
            if (map.get(c) > max){
                max = map.get(c);
                ch = c;
            }
        }

        return ch;



    }
}
