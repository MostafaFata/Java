package qa;

import java.util.Stack;

public class CheckBalance {

    // Check if opening and closing of a given expression is balanced
    public static void main(String[] args) {
        System.out.println(isBalance("{[()]}"));
    }

    public static boolean isBalance(String expression){

        char[] chars = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars){
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if(ch == ')' || ch == ']' || ch == '}'){
                if (stack.empty()){
                    return false;
                }
                stack.pop();
            }

        }

        return stack.empty();

    }

}
