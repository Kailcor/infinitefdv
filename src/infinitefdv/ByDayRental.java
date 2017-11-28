package infinitefdv;

/**
 *
 * @author Angel Rodrigues
 * @date 2017/11/27
 * Provides the logic for Rentals by Day.
 */
public class ByDayRental extends Rental {

    public ByDayRental(int numberOfBikes, int days) throws NumberFormatException {
        if (numberOfBikes < 1 || days < 1) {
            throw new NumberFormatException();
        }
        setNumberOfBikes(numberOfBikes);
        setPrice(20.0);
        setTime(days);

    }

}
