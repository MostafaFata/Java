package qa;

import java.util.HashMap;

public class FirstNonRepeatedChar {
    // first non-repeated character in a string
    // eg. immunization >> u

    public static void main(String[] args) {

        String str = "immunization";

        // loop through string without converting it into an array
        for (int i =0; i < str.length(); i++){
            char c = str.charAt(i); // get each char
            if (str.indexOf(c) == str.lastIndexOf(c)){ // check if the repeatance by array index
                System.out.println(c);
                break; // on first occurance break the loop and stop
            }
        }


    }




}
