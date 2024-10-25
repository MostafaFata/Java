package qa;

import javax.swing.*;

public class RemoveSpaces {
    public static void main(String[] args) {
        // remove white spaces from a sentence

        String sentence = "This is a sample sentence with spaces";
        System.out.println(removeSpaces(sentence));
        System.out.println(removeSpacesUsingReplace(sentence));

    }

    // method one: loop and check each character
    public static String removeSpaces(String sentence){
        char [] characters = sentence.toCharArray();

        StringBuilder spaceless = new StringBuilder();

        for (char character : characters ){
            if (!Character.isSpaceChar(character)){
                spaceless.append(character);
            }
        }
        return spaceless.toString();
    }

    // method two: replace method
    public static String removeSpacesUsingReplace(String sentence){
      return sentence.replace(" ", "");

    }

}
