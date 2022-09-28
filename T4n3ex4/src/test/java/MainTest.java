import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

/**
 * 1) 13>15 why static is not needed
 * 2) 20>22 why it doesn't work?
 */

public class MainTest {
    static ArrayList<Local> locals = new ArrayList<>();
    Restaurant rest1 = new Restaurant("DonJuan", true);
    Restaurant rest2 = new Restaurant("Pizzeria", false);
    Bar bar1  = new Bar("Mojito", true);
    Bar bar2 = new Bar("Day&Night", true);

    @BeforeTest
    public void addLocals(){
        locals.add(rest1);
        locals.add(rest2);
        locals.add(bar1);
    }

    @Test
    public void verifyOrderRest1(){
        assertThat(locals.indexOf(rest1)).isEqualTo(0);
    }

    /*@Test
    public void verifyOrder(){
        assertThat(locals).
                contains(rest1, atIndex(0)).
                contains(rest2,atIndex(1)).
                contains(bar1,atIndex(2));
    }
     */

    @Test
    public void verifyObjectsInAnyOrder(){
        assertThat(locals).
                contains(rest1).
                contains(rest2).
                contains(bar1);
    }

    @Test
    public void verifyBar2IsNotOnTheList(){
        assertThat(locals).doesNotContain(bar2);
    }
}
