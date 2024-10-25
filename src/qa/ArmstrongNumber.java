package qa;

public class ArmstrongNumber {
    // what is an Armstrong number:
    // a number that that is equal to the sum of its own digits raised to the power of the number of digits.
    // 1-digit: 0, 1, 2, ..., 9
    // 2-digit: None
    // 3-digit: 153, 370, 371, 407
    // 4-digit: 1634, 8208, 9474

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(9474));
    }

    public static boolean isArmstrong(int number){

        int numberOfDigits = String.valueOf(number).length();
        int originalNumber = number;
        int sum = 0;

        while(number > 0){
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, numberOfDigits);
            number /= 10; // Remove the last digit
        }

        return sum == originalNumber;
    }
}
