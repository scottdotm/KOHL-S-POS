package discountstrategy;

/**
 * 9/28/2015
 * @author smuth4
 */
// PercentOffDiscount is a special type of DiscountStrategy (that's how you know you have good naming)
public class PercentOffDiscount implements DiscountStrategy {
    private double discountRate;
    
    public PercentOffDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    @Override
    public double getDiscountProductTotal(double unitPrice, int qty) {
        return (unitPrice * qty) - getAmountSaved(unitPrice, qty);
    }
    
    @Override
    public double getAmountSaved(double unitPrice, int qty) {
        return unitPrice * qty * discountRate;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
//Testing Code
//    public static void main(String[] args){
//        PercentOffDiscount discount = new PercentOffDiscount(.10);
//        //discount.setDiscountRate(.10);
//        double amt = discount.getAmountSaved(1.00, 2);
//        System.out.println("Dscount amount: " + amt);
//     double newTotal = discount.getDiscountProductTotal(10.00, 2);
//     System.out.println("Discounted Product Total: " + newTotal);
//    }
    
}
