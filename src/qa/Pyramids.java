package qa;

public class Pyramids {
    public static void main(String[] args) {

        printPyramid(10);

    }

    public static void printPyramid(int rows){
        for (int i = rows; i > 0; i--){
            for (int j =0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
