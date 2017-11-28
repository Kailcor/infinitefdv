
package principalTest;

import infinitefdv.ByDayRental;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import java.lang.NumberFormatException;

/**
 *
 * @author Angel Rodrigues
 */
public class ByDayRentalTest {

    ByDayRental byDay;

    public ByDayRentalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     *
     */
    @Rule
    public ExpectedException exception = ExpectedException.none();    
    
    @Test
    public void testZeroValues() {
        exception.expect(NumberFormatException.class);
        
        byDay = new ByDayRental(0, 2);
        byDay.rent();
        byDay = new ByDayRental(2, 0);
        byDay.rent();
        byDay = new ByDayRental(0, 0);
        byDay.rent();
    }

    @Test
    public void testNegativeValues() {
        exception.expect(NumberFormatException.class);
        
        byDay = new ByDayRental(-1, 2);
        byDay.rent();
        byDay = new ByDayRental(2, -1);
        byDay.rent();
        byDay = new ByDayRental(-1, -1);
        byDay.rent();
    }

    @Test
    public void testPrice() {
        byDay = new ByDayRental(2, 5);
        assertEquals(20.0, byDay.getPrice(), 0.01);

    }

    @Test
    public void testTime() {
        byDay = new ByDayRental(2, 8);
        assertEquals(8, byDay.getTime());
    }
}
