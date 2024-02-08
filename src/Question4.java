public class Question4 {
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


    }
}
