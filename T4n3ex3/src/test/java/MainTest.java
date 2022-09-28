import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class MainTest {
    static int[] numbers1 = {1,2,3};
    static int[] numbers2 = {1,2,3};

    @Test
    public void N1EqualToN2() {
        assertThat(numbers1).isEqualTo(numbers2);
    }
}
