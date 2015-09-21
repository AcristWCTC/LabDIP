package dip.lab2.student.solution1;


/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator{
    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    
    private double bill;
    private double baseTipPerBag;
    private int bagCount;
    private Quality Quality;

    public BaggageServiceTipCalculator(Quality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
        bill = baseTipPerBag * bagCount;
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(Quality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }

    public void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }

    public double getGoodRate() {
        return goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }
    
    public final void setServiceRating(Quality q) {
        // No need to validate because enums provide type safety!
        Quality = q;
    }

    public Quality getQuality() {
        return Quality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }
     public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
    

}
