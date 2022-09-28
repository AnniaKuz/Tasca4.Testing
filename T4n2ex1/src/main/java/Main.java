/**
 *
 * Define a personalized Matcher of Hamcrest that has The Matcher of lenght of the String
 * Use the class ->FeatureMatcher
 *
 * http://hamcrest.org/JavaHamcrest/javadoc/2.2/
 *
 * The constructor of FeatureMatcher has the following arguments in this order:
 *
 *
 * - The Matcher we want to cover
 * -The description of the funtion that we want to verify
 * - The description of the pissible mismatch
 * The only method that we have to overwrite is featureValueOg (T actual)
 * that returns the value that is going to pass to the method match()/ matchesSafely().
 * Use the personalized checking matcher to verify if the String "Mordor" has the lenght of 8.

 *
 */

public class Main {
    public static void main(String[] args) {
        String word = "Mordor";
        int lettersExpected = 8;

        System.out.println(compare(word, lettersExpected));
    }

    public static String compare(String word, int lettersExpected){
        String ans = "";
        if(word.length()!= lettersExpected){
            ans = "Lenght of the word '"+word+"' is not equal to " + lettersExpected + ".";
        }else{
            ans = "Lenght of the word '"+word+"' is equal to " + lettersExpected + ".";
        }
        return ans;
    }
}
