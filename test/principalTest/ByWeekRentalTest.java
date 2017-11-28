
package principalTest;

import infinitefdv.ByWeekRental;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Kail Alexander
 */
public class ByWeekRentalTest {

    ByWeekRental byWeek;
    @Rule
    public ExpectedException exception = ExpectedException.none(); 
    @Test
    public void testZeroValues() {
        exception.expect(NumberFormatException.class);
        
        byWeek = new ByWeekRental(0, 3);
        byWeek.rent();
        byWeek = new ByWeekRental(3, 0);
        byWeek.rent();
        byWeek = new ByWeekRental(0, 0);
        byWeek.rent();
    }

    @Test
    public void testNegativeValues() {
        exception.expect(NumberFormatException.class);
        
        byWeek = new ByWeekRental(-1, 3);
        byWeek.rent();
        byWeek = new ByWeekRental(2, -1);
        byWeek.rent();
        byWeek = new ByWeekRental(-1, -1);
        byWeek.rent();
    }

    @Test
    public void testPrice() {
        byWeek = new ByWeekRental(2, 6);
        assertEquals(60.0, byWeek.getPrice(), 0.01);

    }

    @Test
    public void testTime() {
        byWeek = new ByWeekRental(2, 7);
        assertEquals(7, byWeek.getTime());
    }
}
