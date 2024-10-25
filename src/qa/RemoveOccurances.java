package qa;

public class RemoveOccurances {
    public static void main(String[] args) {
        String test = "abcabcabc";
        System.out.println(remove(test, 'a'));
    }

    public static String remove(String str, Character ch){

        return str.replace(ch+"", "");
        // return str.replace(String.valueOf(ch), "");

    }

}
