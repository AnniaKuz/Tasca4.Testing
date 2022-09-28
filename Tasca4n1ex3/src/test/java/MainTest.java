import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    static int [] numbers = new int[3];

    @BeforeAll
    public static void testNumbers(){
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;

    }

    @Test
    @DisplayName("catching Exception")
    void testArrayIndexOutOfBoundsException(){
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> numbers[3] = 3);
    }
}
