package qa;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbers {
    public static void main(String[] args) {
        // extract numbers from a given sentence
        String sentence = "This is a random sentence that contains number 20 and 234 and price of $98";

        System.out.println(extractNumbers(sentence));
    }

    public static List<Integer> extractNumbers(String sentence){

        // use the following regular expression to match numbers (integer or decimal)
        String regex = "\\b\\d+\\b"; // or use this "\\b[0-9]+\\b"
                        /*
                        *   \b Word boundary to ensure we capture whole numbers
                        *   \d means if digit, or you can use [0-9]
                        *   + means one or more occurrences
                        */

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        List<Integer> numbers = new ArrayList<>();

        while (matcher.find()){
            String numberString = matcher.group();
            // matcher.group returns the entire matched subsequence found by the previous match operation.
            numbers.add(Integer.parseInt(numberString));
        }

        return numbers;

    }
}
