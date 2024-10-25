package qa;

public class SecondBiggestElement {
    public static void main(String[] args) {
        // find the second biggest element in an array

        int[] numbers = {1, 2, 10, 13, 20, -4, 3, -10, 11, 40};
        int max = numbers[0];
        int secondMax = numbers[0];


        for (int n : numbers){
            if(n > max){
                secondMax = max;
                max = n;
            }else if(n > secondMax){
                secondMax = n;
            }

        }

        System.out.println(secondMax);

    }
}
