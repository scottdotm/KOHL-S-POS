package discountstrategy;

/**
 *
 * @author smuth4
 */
public class Product {
    private String prodId;
    private String prodName;
    private double unitPrice;
    private DiscountStrategy discount;

    public Product() {
    }

    public Product(String prodId, String prodName, double unitPrice, DiscountStrategy discount) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }
    public final double getAmountSaved(int qty){
        
        return discount.getAmountSaved(unitPrice, qty);
        
    }
    
     public final double getDiscountProductTotal(int qty){
        
        return discount.getDiscountProductTotal(unitPrice, qty);
        
    }
    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public final String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
}