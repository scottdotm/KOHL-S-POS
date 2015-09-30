package discountstrategy;

/**
 *
 * @author smuth4
 */
public class Product {
    private String prodId;
    private String name;
    private double unitPrice;
//    private String description;
    private DiscountStrategy discount;

    public Product(){
        //empty constructor to make use of setters
    }

    public Product(String prodId, String name, double unitPrice, DiscountStrategy discount) {
        this.prodId = prodId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }
    
    public double getAmountSaved(int qty) {
        return discount.getAmountSaved(unitPrice, qty); //delegate work to discount object
    }
    
    public double getDiscountProductTotal(int qty) {
        return discount.getDiscountProductTotal(unitPrice, qty); //same delegation as above
    }
    
    public String getProdId() {
        if (prodId == null || prodId.length() < 0) {
            throw new IllegalArgumentException();
            
        } else {
        return prodId;
        }
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

//    public String getDescription() {
//        return description;
//    }
//
//    public final void setDescription(String description) throws IllegalArgumentException {
//        if (description == null || description.length() < 0) {
//            throw new IllegalArgumentException();
//        } else {
//            this.description = description;
//        }
//    }
    
    public DiscountStrategy getDiscountStrategy() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
//    public void setDiscountStrategy(DiscountStrategy discount) throws IllegalArgumentException{
//        
//        this.discount = discount;
//    }
    
    //Test Code
    //public static void main(String[] args){
        //Product product = new Product("A100", "Hat", 20.00, new PercentOffDiscount(.10));
        //double amtSaved = product.getAmountSaved(2);
        //System.out.println("Expected 4.00 and got: " + amtSaved);
    //}
            
            
    
}
