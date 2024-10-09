package qa;

public class Q6 {
    public static void main(String[] args) {
        // remove white spaces from a sentence

        String sentence = "This is a sample sentence with spaces";

        char [] characters = sentence.toCharArray();

        StringBuilder spaceless = new StringBuilder();

        for (char character : characters ){
            if (!Character.isSpaceChar(character)){
                spaceless.append(character);
            }
        }

        System.out.println(spaceless);
    }
}
