package qa;

public class Q2 {
    public static void main(String[] args) {

        // Write a program to reverse a string in Java
        String str = "test";

        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){

            rev += str.charAt(i)+"";

        }

        System.out.println(rev);

    }


}
