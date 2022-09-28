//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

public class MainTest {
    static int [] numbers = new int[3];

    @BeforeTest
    public void addElements() {
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
    }


    public void throwsException(){
        numbers[3] = 3;
    }

    @Test
    @DisplayName("Test array with ArrayIndexOutOfBoundsException")
    public void VerifyArrayIndexOutOfBoundsException(){
        assertThatThrownBy(() -> {
            throwsException();
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);

    }

}
