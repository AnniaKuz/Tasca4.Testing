
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;


public class MainTest {
    Product p1 = new Product("Table", 100);
    Product p2 = new Product("Table", 100);
    Product p3 = new Product("Table", 150);


    @Test
    public void compareP1P2(){
        assertThat(p1).isEqualTo(p2);
    }

    @Test
    public void compareP1andP2(){
        assertThat(p1).isNotSameAs(p2);
    }

    /*@Test
    public void compareP1andP2Fields(){
        assertThat(p1).isEqualToComparingFieldByField(p2);
    } */

    @Test
    public void compareP1andP3(){
        assertThat(p1).isNotEqualTo(p3);
    }

}
