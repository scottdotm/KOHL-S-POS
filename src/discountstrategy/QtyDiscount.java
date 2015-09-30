package discountstrategy;

/**
 * 9/28/2015
 * @author smuth4
 */
public class QtyDiscount implements DiscountStrategy {
    //right click class name > refactor > extract interface > provide name > click all boxes
    private double discountRate;
    private double minQty;
    
    public QtyDiscount(double discountRate, int minQty) {
        this.discountRate = discountRate;
        this.minQty= minQty;
    }
    
    @Override
    public final double getDiscountProductTotal(double unitPrice, int qty) {
        if(qty >= minQty) {
            return (unitPrice * qty) - getAmountSaved(unitPrice, qty);
            }
    else {
            return unitPrice * qty;
}
        //return (unitPrice * qty) - getAmountSaved(unitPrice, qty);
    }
    
    @Override
    public final double getAmountSaved(double unitPrice, int qty) {
        if(qty >= minQty){
            return unitPrice * qty * discountRate;
        } else{
            return 0;
        }
        //return unitPrice * qty * discountRate;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public final double getMinQty() {
        return minQty;
    }

    public final void setMinQty(double minQty) {
        this.minQty = minQty;
    }
    
    
//Testing Code
//    public static void main(String[] args){
//        QtyDiscount discount = new QtyDiscount(.10, 5);
//        //discount.setDiscountRate(.10);
//        double amt = discount.getAmountSaved(1.00, 2);
//        System.out.println("Dscount amount: " + amt);
//     double newTotal = discount.getDiscountProductTotal(10.00, 2);
//     System.out.println("Discounted Product Total: " + newTotal);
//    }
    
}
