

public class Palindrome {
    public static void main(String[] args) {
        // How to Solve Palindrome Problems
        // Palindrome: a string that reads the same forwards and backwards.

        String str = "leVEL";
        String rts = "";

        for (int i = str.length()-1; i >=0; i--){
            rts += str.charAt(i);
        }

        if (str.equalsIgnoreCase(rts)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
