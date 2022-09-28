import org.hamcrest.FeatureMatcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestHamcrest {

    @Test
    public void wordLenghtIsEqualToEight(){
        String word = "Mordor";
        int lettersExpected = 8;

        assertThat(word, is(createFeatureMatcher(lettersExpected)));
    }

    public static FeatureMatcher<String,Integer> createFeatureMatcher(Integer length){
        return new FeatureMatcher<String, Integer>(equalTo(length),"String length is ...","String length" ) {
            @Override
            protected Integer featureValueOf(String s) {
                return s.length();
            }
        };




    }


}
