package discountstrategy;

/**
 * 9/29/2015
 * @author smuth4
 */
public class LineItem {
    private DataAccessStrategy das;
    private int qty;
    private Product product;

    public LineItem(Product product, int qty) {
        this.qty = qty;
        this.product = product;
    }

    public final Product findProduct(final String prodId){
        return das.findProduct(prodId);
        
    }
    
//    public final Customer findCustomer(final String custId){
//        return das.findCustomer();
//        
//    }
    
    public LineItem() {
    }

    public double getSubtotal(){
        
        return product.getUnitPrice()* qty; 
    }
        
    public double getSubTotalDiscount(){
        
        return getSubtotal() - product.getDiscountProductTotal(qty);
    }    
    
   public String getProdId() {
        return product.getProdId();
    }
    
   public String getTitle(){
       return product.getTitle();
       
   } 
   
   public double getUnitPrice(){
       return product.getUnitPrice();
       
   }
   
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public DataAccessStrategy getDas() {
        return das;
    }

    public void setDb(DataAccessStrategy das) {
        this.das = das;
    }

}
