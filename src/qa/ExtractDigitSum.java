package qa;

public class ExtractDigitSum {

    public static void main(String[] args) {
        //  Extract and Sum Digits in a given String
        String str = "A2B4C6D8E";

        int sum = 0;

        for (int i = 0; i < str.length(); i++){ // loop thru string
            char ch = str.charAt(i); // save each character inside a char
            if (Character.isDigit(ch)){ // check if character is digit
                sum += Integer.parseInt(""+ch); // add to sum after parsing the char to int
            }
        }

        System.out.println(sum);





    }
}
