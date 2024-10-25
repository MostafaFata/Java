package qa;

public class SwitchABwithoutC {
    public static void main(String[] args) {

        // how to switch the value of two variables without a third one
        int a = 1;
        int b = 2;

        a = a + b; // 3
        b = a - b; // 1
        a = a - b; // 2

        System.out.println("a:" + a);
        System.out.println("b:" + b);



    }
}
