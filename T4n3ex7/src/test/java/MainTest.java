import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    Optional op = null;

    @Test
    public void verifyOpIsNull(){
        assertThat(op).isNull();
    }
}
