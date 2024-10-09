public class Password {
    public static void main(String[] args) {
        // Strong Password Checker
        /*
        Password must:
            - be at least 8 characters
            - contain at least 1 Uppercase letter
            - contain at least 1 Lowercase letter
            - contain at least 1 digit
            - contain at least 1 special character
            - And no whitespace allowed
         */

        String password = "Mosti@229";

        // first check if the password includes whitespace
        if (password.contains(" ")){
            System.out.println("Invalid Password");
            return;
        }

        boolean isEightCharacters = password.length() >= 8;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++){
            Character ch = password.charAt(i);

            if (Character.isUpperCase(ch)){
                hasUppercase = true;
            }else if (Character.isLowerCase(ch)){
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }else {
                hasSpecialChar = true;
            }
        }

        boolean isStrongPassword = hasUppercase && hasLowercase && hasDigit && hasSpecialChar;

        if (isStrongPassword){
            System.out.println("The password is strong");
        }else {
            System.out.println("Weak password");
        }

        }

}
