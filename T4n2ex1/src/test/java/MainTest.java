import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class MainTest extends TypeSafeMatcher<Integer>{
    private int lettersExpected;

    public MainTest(int lettersExpected) {
        this.lettersExpected =lettersExpected;
    }

    @Override
    protected boolean matchesSafely(Integer lenght ) {
        return  lenght != lettersExpected;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Lenght is expected to be 6");
    }

}
