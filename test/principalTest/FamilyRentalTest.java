
package principalTest;

import infinitefdv.ByDayRental;
import infinitefdv.ByHourRental;
import infinitefdv.ByWeekRental;
import infinitefdv.FamilyRental;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Angel Alexander
 */
public class FamilyRentalTest {

    ByHourRental byHour;
    ByDayRental byDay;
    ByWeekRental byWeek;
    FamilyRental familyRental;
    int hours;
    int days;
    int weeks;
    int numberOfBikes;

    @Before
    public void setUp() {

        numberOfBikes = 1;
        hours = 3;
        days = 2;
        weeks = 1;

        byHour = new ByHourRental(numberOfBikes, hours);
        byDay = new ByDayRental(numberOfBikes, days);
        byWeek = new ByWeekRental(numberOfBikes, weeks);
        
        familyRental = new FamilyRental();
        familyRental.addRental(byHour);
        familyRental.addRental(byDay);
        familyRental.addRental(byWeek);
    }
    // Test if all the calculation for rent in FamilyRental are right!
    @Test
    public void testIfFamilyRentWorks() {
        
        double totalByHour = byHour.getPrice() * byHour.getTime() * byHour.getNumberOfBikes();
        double totalByDay = byDay.getPrice() * byDay.getTime() * byDay.getNumberOfBikes();
        double totalByWeek = byWeek.getPrice() * byWeek.getTime() * byWeek.getNumberOfBikes();
        double total = (totalByHour + totalByDay + totalByWeek) * 0.7;

        assertEquals(total, familyRental.rent(), 0);
    }
    
    @Rule
    public ExpectedException exception = ExpectedException.none();    
    //Test if we exceeds max promotion number of rentals (5).
    @Test
    public void testExceedsMaxPromotion() {
        exception.expect(NumberFormatException.class);
        familyRental.addRental(new ByDayRental(3,3));
        
       
    }
}
