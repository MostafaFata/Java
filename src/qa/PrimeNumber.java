package qa;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }

    public static boolean isPrime(int number){

        // prime numbers are greater than 1
        if (number <= 1){
            return false;
        }else if (number == 2 || number == 3){
            return true;
        }

        // check if a number is divisible by 2 or any number
        // some of prime numbers are: 2, 3, 5, 7, 11, 13
        // 1 is not a prime number
        // zero is not a prime number
        // negative numbers can't be prime
        // The loop checks if the number is divisible by any integer
        // from 2 up to the square root of the number (for efficiency)
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
              //  System.out.println(Math.sqrt(number));
                return false;

            }
        }
       // System.out.println(Math.sqrt(number));
        return true;

    }
}
