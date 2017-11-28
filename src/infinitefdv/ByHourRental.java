
package infinitefdv;

/**
 *
 * @author Angel Rodrigues
 * @date 2017/11/27
 *
 */
public class ByHourRental extends Rental {

    public ByHourRental(int numberOfBikes, int hours) throws NumberFormatException {
        if (numberOfBikes < 1 || hours < 1) {
            throw new NumberFormatException();
        }
        setPrice(5.0);
        setTime(hours);
        setNumberOfBikes(numberOfBikes);

    }

}
