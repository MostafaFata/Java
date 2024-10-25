package qa;

public class PrintVowels {
    public static void main(String[] args) {
        // extract vowels from a string and print
        String string = "University of Washington";

        System.out.println(printVowels(string));

    }
    public static String printVowels(String string) {
        String vowels = "";

        for (int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if (String.valueOf(ch).matches(".*[aeiouAEIOU].*")){
                vowels += ch;
            }
        }

        return vowels;

    }
}
