package qa;

public class RemoveIndexPalindrome {
    public static void main(String[] args) {
        // check which index of element should be removed in order for the string to be palindrome
        // example: "racecarw" index 7 letter w

        String str = "racecmar";
        // the output should be 5 letter m
        System.out.println(removeIndexForPalindrome(str));
    }

    // we need another method to find the index
    public static int removeIndexForPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if (str.charAt(left) != str.charAt(right)){
                if (isPalindrome(str, left+1, right)){
                    return left;
                }else if(isPalindrome(str, left, right-1)){
                    return right;
                }else{
                    return -1;
                }
            }
            left++;
            right--;
        }

        return -1; // means already a palindrome
    }

    // check for palindrome normally
    public static boolean isPalindrome(String str, int left, int right){

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
