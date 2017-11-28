package infinitefdv;

/**
 *
 * @author Angel Rodrigues
 * @date 2017/11/27 Provides rentals for a week;
 */
public class ByWeekRental extends Rental {

    public ByWeekRental(int numberOfBikes, int weeks) throws NumberFormatException {
        if (numberOfBikes < 1 || weeks < 1) {
            throw new NumberFormatException();
        }
        setNumberOfBikes(numberOfBikes);
        setPrice(60.0);
        setTime(weeks);

    }
}
