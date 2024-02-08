public class Question3 {
    public static void main(String[] args) {
        // Removing Duplicates from Strings
        String str = "ABCKLMMNAOPCCXXX";

        String result = ""; // to store the new string

        for (int i =0; i < str.length(); i++){ // loop thru the string
            String ch = ""+str.charAt(i); // convert it to character
            if (result.contains(ch)){ // check if result contains the character
                continue; // if does: skip and continue
            }
            result += ch; // adding the character
        }

        System.out.println(result);

    }
}
