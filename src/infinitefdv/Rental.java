
package infinitefdv;

/**
 *
 * @author Angel Rodrigues
 * @date 2017/11/27
 */
public abstract class Rental {

    private double price;
    private int numberOfBikes;
    private int time;

    public double rent() {
        return getNumberOfBikes() * getPrice() * getTime();
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the numberOfBikes
     */
    public int getNumberOfBikes() {
        return numberOfBikes;
    }

    /**
     * @param numberOfBikes the numberOfBikes to set
     */
    public void setNumberOfBikes(int numberOfBikes) {
        this.numberOfBikes = numberOfBikes;
    }
}
