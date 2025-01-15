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

    public static String removeChar(String str, Character ch){
        StringBuilder removed = new StringBuilder();

        for (int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c != ch){
                removed.append(c);
            }
        }

        return removed.toString();

    }

}
