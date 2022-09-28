
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class MainTest {
    static Map<Integer, String> myMap = new HashMap<Integer, String>();

    @BeforeTest
    public void add() {
        myMap.put(1, "A");
        myMap.put(2, "B");
    }
    @Test
    public void myMapHasSomething(){
        assertThat(myMap).containsKey(1);
    }
}
