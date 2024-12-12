package qa;

public class PalindromeNumber {
    public static void main(String[] args) {

        // check if a number is palindrome
        // means it is the same if reversed
        // e.g. 121, 2552
        System.out.println(isPalindrome(2552));


    }

    public static boolean isPalindrome(int number){

        int originalNumber = number;
        int reversedNumber = 0;

        // first check if the number is negative and return false
        if (number < 0) {
            return false;
        }

        while(number != 0){
            // find the last digit of the number
            int digit = number % 10;

            // multiply the reversed number by 10 and add the digit
            reversedNumber = reversedNumber * 10 + digit;

            // divide the number by 10
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
