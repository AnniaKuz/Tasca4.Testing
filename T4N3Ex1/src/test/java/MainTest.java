
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class MainTest {
        static int a = 1;
        static int b = 1;
        static int c = 2;

    @Test
    public void AIqualsToB(){
        assertThat(a).isEqualTo(b);
    }

    @Test
    public void BNotIqualsToC(){
        assertThat(b).isNotEqualTo(c);
    }
}
