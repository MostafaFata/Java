package qa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        /*
           1. The username consists of 8 to 30 characters inclusive.
           2. The username can only contain alphanumeric characters, underscores, dollar sign, hash, exclamation mark (_$#!).
           3. Alphanumeric characters describe the character set consisting of lowercase characters [a – z], uppercase characters [A – Z], and digits [0 – 9].
           4. The first character of the username must be an alphabetic character, i.e., either a lowercase character [a – z] or uppercase character [A – Z].
         */

        final String REGEX = "^[a-zA-Z][a-zA-Z0-9_$#!]{7,29}$";

        String username = "mostafa_fata229";

        System.out.println(isUsernameValid(username, REGEX));

        // masked credit card number
        // example : 1234-5678-9012-3456 regex and replace XXXX-XXXX-XXXX-3456

        String input = "1234-5678-9012-3456";
        System.out.println(maskedCreditCard(input));

    }

    public static boolean isUsernameValid(String username, String regex){

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        return matcher.matches();

    }

    public static String maskedCreditCard(String input){

        String regex = "[0-9]{4}-[0-9]{4}-[0-9]{4}-";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

            return matcher.replaceAll("XXX-XXX-XXX-");



    }
}

/*
Regular Expressions:
        [abc]           A single character of: a, b, c
        [a-z]           A single character in a range: a to z
        a|b             Match either a or b
        \d              A digit: 0-9
        [0-9]           A digit: 0-9
        \D              A non digit
        \w              A word character: [a-zA-Z_0-9]
        \W              not a word character
        \s              Find a whitespace character
        \S              non-whitespace
        \b              checks for boundaries e.g. extracting whole number
        .               Any single character
        a{3}            Exactly 3 of a: aaa
        a{3,}           3 or more of a
        a{2,4}          between 2 or 4 of a:  aa, aaa, aaaa
        ^               the beginning of a line
        $               the end of a line
        *               match zero or more occurrences
        +               match one or more occurrences
        ?               match zero or one occurrences
 */
