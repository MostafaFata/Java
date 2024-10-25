package qa;

import java.util.Arrays;

public class ReverseStringPreservingSpace {
    public static void main(String[] args) {

        // Write a program to reverse the given string while preserving the position of spaces.
        // Create a string to store results. Mark the space position of the given string in this string.
        // Insert the character from the input string into the result string in reverse order.
        // While inserting the character check if the result string already contains a space at index ‘j’ or not. If it contains, we copy the character to the next position.
        String string = "This is my Java Program";
        System.out.println(reverseString(string));

    }

    public static String reverseString(String string){
        String result = "";

        char[] originalString = string.toCharArray();
        char[] resultString = new char[originalString.length];

        // loop through the original string and store spaces in original position in result array
        for (int i = 0; i < originalString.length; i++){
            if (Character.isSpaceChar(originalString[i])){
                resultString[i] = originalString[i];
            }
        }

        int j = resultString.length-1;
        for (int i = 0; i < originalString.length; i++){ // loop through original string in ascending order
            if (!Character.isSpaceChar(originalString[i])){ // ignore spaces from original string
                // if result string contains space in the mentioned index number that we already assigned
                if (Character.isSpaceChar(resultString[j])){
                    j--; // do another increment or ignore adding
                }
                resultString[j] = originalString[i]; // add it to result string
                    j--; // decrement the counter
            }

        }

        System.out.println(Arrays.toString(resultString));




        return result;

    }
}
