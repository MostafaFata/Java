package qa;

public class CheckVowels {
    public static void main(String[] args) {
        // Write a Java program to check if a vowel is present in a string.
        String str = "Hello";
        boolean isVowel = false;

            if(str.matches(".*[aeiou].*")){
                isVowel = true;
            }

        System.out.println(isVowel);
    }
}
