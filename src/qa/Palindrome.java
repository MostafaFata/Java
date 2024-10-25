package qa;

public class Palindrome {
    public static void main(String[] args) {
        // How to Solve qa.Palindrome Problems
        // qa.Palindrome: a string that reads the same forwards and backwards.

        String str = "LevEl";
        // reversed string method
        System.out.println(isPalindrome(str));
        // left right method
        System.out.println(Palindrome(str));


    }

    // method 1: reversed string method
    public static boolean isPalindrome(String string){
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length()-1; i >= 0; i--){
            reversed.append(string.charAt(i));
        }

        return string.equalsIgnoreCase(reversed.toString());

    }

    // method 2: left right comparison
    public static boolean Palindrome(String string){
        string = string.toLowerCase();

        int left = 0;
        int right = string.length()-1;

        while (left < right){
            if (string.charAt(left) != string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
