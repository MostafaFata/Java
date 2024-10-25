package qa;

public class ChangeCaseManual {
    // convert an uppercase character to lowercase without using built in methods

    public static void main(String[] args) {
        // the difference between hashcode of an uppercase and lowercase is 32
        // e.g. hashcode for 'A' is: 65  and for 'a' is 97
        // to convert an uppercase letter to lowercase letter
        // we need to find the hashcode of the char and add 32 and convert it back to char

        System.out.println(convertLowercase('M'));
    }

    public static char convertLowercase(char ch){
        // first check if a given char is uppercase
        if (ch >= 'A' && ch <= 'Z'){
            ch += 32;
        }else if (ch >= 'a' && ch <= 'z'){
            ch -= 32;
        }


        return ch;
    }



}
