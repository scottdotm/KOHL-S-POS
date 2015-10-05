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

    public Product(String prodId, String title, double unitPrice, DiscountStrategy discount) {
        this.prodId = prodId;
        this.prodName = title;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }
    public double getAmountSaved(int qty){
        
        return discount.getAmountSaved(unitPrice, qty);
        
    }
    
     public double getDiscountProductTotal(int qty){
        
        return discount.getDiscountProductTotal(unitPrice, qty);
        
    }
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getTitle() {
        return prodName;
    }

    public void setTitle(String title) {
        this.prodName = title;
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