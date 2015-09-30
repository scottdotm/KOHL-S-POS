package discountstrategy;

/**
 *
 * @author smuth4
 */
public interface DiscountStrategy {
    //no discount class would work the same but would return zero

    double getAmountSaved(double unitPrice, int qty);

    double getDiscountProductTotal(double unitPrice, int qty);

    double getDiscountRate();

    void setDiscountRate(double discountRate);
    
}
