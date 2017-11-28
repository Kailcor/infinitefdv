
package principalTest;

import infinitefdv.ByHourRental;
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
public class ByHourRentalTest {

    ByHourRental byHour;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();    
    @Test
    public void testZeroValues() {
        exception.expect(NumberFormatException.class);
        
        byHour = new ByHourRental(0, 2);
        byHour.rent();
        byHour = new ByHourRental(2, 0);
        byHour.rent();
        byHour = new ByHourRental(0, 0);
        byHour.rent();
    }

    @Test
    public void testNegativeValues() {
        exception.expect(NumberFormatException.class);
        
        byHour = new ByHourRental(-1, 2);
        byHour.rent();
        byHour = new ByHourRental(2, -1);
        byHour.rent();
        byHour = new ByHourRental(-1, -1);
        byHour.rent();
    }

    @Test
    public void testPrice() {
        byHour = new ByHourRental(2, 5);
        assertEquals(5.0, byHour.getPrice(), 0.01);
    }

    @Test
    public void testTime() {
        byHour = new ByHourRental(2, 8);
        assertEquals(8, byHour.getTime());
    }
}
