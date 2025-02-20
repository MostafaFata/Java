package intermediate;

import java.util.HashMap;


public class FindDuplicateWords {
    public static void main(String[] args) {

        String sentence = "this is a sentence that repeats sentence two times";

        repeatedWords(sentence);

    }

    public static void repeatedWords(String sentence){
        String[] arr = sentence.split(" ");
      //  System.out.println(Arrays.toString(arr));

        HashMap<String, Integer> hashmap = new HashMap<>();

        for (String str : arr){
            if (hashmap.containsKey(str)){
                System.out.println(str);
            }else {
                hashmap.put(str, 1);
            }
        }
    }


}
