package qa;

import java.util.ArrayList;

public class mathSimple {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(numbers));
    }

    public static int sum(int[] nums){
        int eSum = 0;
        int oSum = 0;
        ArrayList<Integer> eNums = new ArrayList<>();
        ArrayList<Integer> oNums = new ArrayList<>();
        for (int num : nums){
            if(num%2 == 0){
                eNums.add(num);
                eSum += num;
            }else {
                oNums.add(num);
                oSum += num;
            }

        }

        System.out.println(eNums);
        System.out.println(oNums);

        return Math.max(eSum, oSum);


    }


}
