
package infinitefdv;

import java.lang.NumberFormatException;
import java.util.ArrayList;

/**
 *
 * @author Angel Rodrigues 
 * 
 * Provides a promotion on rentals. It combine 3 or more
 * rentals and give a discount.
 */
public class FamilyRental extends Rental {

    private double total;
    private final ArrayList<Rental> rentals = new ArrayList<>();

    public void addRental(Rental rental) throws NumberFormatException {

        if (rental.getNumberOfBikes() + this.getNumberOfBikes() > 5) {
            throw new NumberFormatException();
        } else {
            rentals.add(rental);
        }
    }

    @Override
    public int getNumberOfBikes() {
        int numberOfBikes = 0;
        for (Rental i : rentals) {
            numberOfBikes += i.getNumberOfBikes();
        }
        return numberOfBikes;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public double rent() {
        if(getNumberOfBikes() < 3){
            System.out.println("You have to rent at least 3 bikes for the promotion!");
            return 0;
        }
        total = 0;
        for (Rental i : rentals) {
            total += i.rent();            
        }
        total *= 0.7;
        return total;
    }

}
