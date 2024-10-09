public class ReversedString {
    public static void main(String[] args) {

        // Reversing a String

        String str = "this is a line of code";

        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        System.out.println(reversed);

    }
}
