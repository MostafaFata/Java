package qa;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reversedNumber(123));
    }

    public static int reversedNumber(int number){

        int reversedNumber = 0;

        while(number !=0 ){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}
