import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        // Reversing an Array
        int[] myArray = {0, 5, 10, 15, 20};

        // define the length of the new array based on the length of original array
        int[] reversedArray = new int[myArray.length];

        // j is used to assign the reversedArray's index number
        for (int i = myArray.length-1, j=0; i >= 0; i--, j++){
            reversedArray[j] = myArray[i];
        }

        // print out the reversed array
        System.out.println(Arrays.toString(reversedArray));

    }
}
