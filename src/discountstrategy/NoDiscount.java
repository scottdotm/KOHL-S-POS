package discountstrategy;

/**
 *
 * @author Scott
 */
public class NoDiscount implements DiscountStrategy {
    private double discountRate;
    
    @Override
    public final double getDiscountProductTotal(double unitPrice, int qty) {
        return (unitPrice * qty) - getAmountSaved(unitPrice, qty);
    }

    @Override
    public final double getAmountSaved(double unitPrice, int qty) {
        return 0;
    }

    @Override
    public final double getDiscountRate() {
        return 0;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        this.discountRate = 0;
    }
}
