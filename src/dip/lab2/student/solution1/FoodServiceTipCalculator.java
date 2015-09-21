package dip.lab2.student.solution1;



/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private final double goodRate = 0.20;
    private final double fairRate = 0.15;
    private final double poorRate = 0.10;

    private double bill;
    
    private Quality Quality;

    public FoodServiceTipCalculator(Quality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(Quality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }
    public double getBill() {
        return bill;
    }

    public final void setServiceRating(Quality q) {
        // No need to validate because enums provide type safety!
        Quality = q;
    }

    public Quality getServiceQuality() {
        return Quality;
    }

}
