package qa;

public class DigitCombination {
    public static void main(String[] args){

        // Write a function that prints all 3 digit combination of numbers
        // from 1 to 5 ex: 1, 1, 1 to 5, 5, 5
        printNumbers(1, 5);

    }

    public static void printNumbers(int start, int end){
        for (int i= start; i <= end; i++){
            for (int j = start; j <= end; j++){
                for (int k = start; k <= end; k++){
                    System.out.println(i + ", " + j + ", " + k);
                }
            }
        }
    }

}
