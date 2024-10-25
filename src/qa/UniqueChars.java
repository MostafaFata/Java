package qa;

public class UniqueChars {
    public static void main(String[] args) {
        // Spotting Unique Characters in a String

        String str = "abcddeeffcayezz";
        String uniques = "";

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                uniques += ch;
            }
        }

        System.out.println(uniques);

        // the lastIndexOf() method is used
        // to find the last occurrence of a specified character
        // or substring within a string or an ArrayList.

    }
}
