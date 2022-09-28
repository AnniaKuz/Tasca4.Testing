import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class MainTest {
    static ArrayList<String> letters = new ArrayList<>();
    CalculoDNI dni = new CalculoDNI();

    @BeforeAll
    public static void lettersDNI() {
        letters.add("T");
        letters.add("R");
        letters.add("W");
        letters.add("A");
        letters.add("G");
        letters.add("M");
        letters.add("Y");
        letters.add("F");
        letters.add("P");
        letters.add("D");
        letters.add("X");
        letters.add("B");
        letters.add("N");
        letters.add("J");
        letters.add("Z");
        letters.add("S");
        letters.add("Q");
        letters.add("V");
        letters.add("H");
        letters.add("L");
        letters.add("C");
        letters.add("K");
        letters.add("E");
    }

    @Test
    @DisplayName("71000212V is correct DNI")
    void thisDNIisCorrect() {
        assertEquals("V", dni.calculateLetter("71000212"));
    }
}
