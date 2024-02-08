import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        // Solving Anagram Problems
        // Anagram means two different strings made of same letters but different orders

        String str1 = "heart";
        String str2 = "earth";

        // convert the strings to char arrays
       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // compare arrays
        if (Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}
