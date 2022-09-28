import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;


public class MainTest {
    static ArrayList<Month> monthsTest = new ArrayList<>();

    @BeforeAll
    public static void monthsTest(){
        monthsTest.add(new Month("January"));
        monthsTest.add(new Month("February"));
        monthsTest.add(new Month("March"));
        monthsTest.add(new Month("April"));
        monthsTest.add(new Month("May"));
        monthsTest.add(new Month("June"));
        monthsTest.add(new Month("July"));
        monthsTest.add(new Month("August"));
        monthsTest.add(new Month("September"));
        monthsTest.add(new Month("October"));
        monthsTest.add(new Month("November"));
        monthsTest.add(new Month("December"));

    }

    @DisplayName("The size of the ArrayList is 12")
    @Test
    public void monthSizeShouldBeTwelve() {
        assertEquals(12, monthsTest.size());
    }

    @Test
    @DisplayName("August is on the 8th position")
    void augustShoudBeInIndexSeven() {
        assertEquals("August", monthsTest.get(7).getName());
    }

    @Test
    @DisplayName("This ArrayList is not Null")
    void monthIsNotNull(){
        assertTrue(monthsTest.size()>0);
    }

    @ParameterizedTest
    @CsvSource(value = {"0,January", "1,February", "2, March", "7,August", "11,December"}, delimiter = ',')
    public void checkMonthInCollection(int input, String expected ){
        assertEquals(expected, monthsTest.get(input).getName());

    }


}
