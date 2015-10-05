package discountstrategy;

/**
 * 9/29/2015
 * @author smuth4
 */
public class LineItem {
    private DataAccessStrategy das;
    private int qty;
    private Product product;

    public LineItem(DataAccessStrategy db, int qty, Product product) {
        this.das = db;
        this.qty = qty;
        this.product = product;
    }

    public final Product findProduct(final String prodId){
        return das.findProduct(prodId);
        
    }
    
//    public final Customer findCustomer(final String custId){
//        return db.findCustomer();
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

    public DataAccessStrategy getDb() {
        return das;
    }

    public void setDb(DataAccessStrategy db) {
        this.das = db;
    }

    
    
   
    
   
    
    
    
    
    public static void main(String[] args) {
        LineItem item = new LineItem(new FakeDatabase(),4,new Product ("A100","Men's Shorts", 31.00,new PercentOffDiscount(.1)));
        
        double subtotal = item.getSubtotal();
        double subtotalDiscount = item.getSubTotalDiscount();
        System.out.println("Expected Subtotal = 124 and got :" + subtotal);
        System.out.println("Expected Subtotal Discount = 12.4 and got :" + subtotalDiscount);
    }
    
}
