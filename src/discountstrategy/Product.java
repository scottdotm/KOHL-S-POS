package discountstrategy;

/**
 *
 * @author smuth4
 */
public class Product {
    private String prodId;
    private String prodName;
    private double unitPrice;
    private DiscountStrategy discountStrategy;

    public Product(String prodId, String prodName, double unitPrice, DiscountStrategy discountStrategy) {
        setProdId(prodId);
        setDescription(prodName);
        setUnitPrice(unitPrice);
        setDiscountStrategy(discountStrategy);
    }

    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(final String prodId) {
        // needs validation
        this.prodId = prodId;
    }

    public final String getDescription() {
        return prodName;
    }

    public final void setDescription(final String prodName) {
        // needs validation
        this.prodName = prodName;
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(final double unitPrice) {
        // needs validation
        this.unitPrice = unitPrice;
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(final DiscountStrategy discountStrategy) {
        // needs validation
        this.discountStrategy = discountStrategy;
    }
    
}
    //debug
//    public static void main(String[] args) {
//        Product product = new Product("P645", "Hat", 20.00, new PercentOffDiscount(0.10));
//        double amtSaved = product.getAmountSaved(2);
//        System.out.println("Expected 4.00 and got: " + amtSaved);
//        
//        Product product2 = new Product("P645", "Hat", 20.00, new QtyDiscount(0.10, 2));
//        double amtSaved2 = product2.getAmountSaved(2);
//        System.out.println("Expected 4.00 and got: " + amtSaved2);
//    }
