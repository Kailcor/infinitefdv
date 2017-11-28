
package principalTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author Angel Rodrigues
 * Provides the execute of all test tasks.
 */
@RunWith(Suite.class)
@SuiteClasses({
    ByHourRentalTest.class,
    ByDayRentalTest.class,
    ByWeekRentalTest.class,
    FamilyRentalTest.class
})
public class InfiniteTest {

}
