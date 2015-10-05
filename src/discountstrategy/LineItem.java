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
    
   public String getProdName(){
       return product.getProdName();
       
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

    public void setDas(DataAccessStrategy das) {
        this.das = das;
    }
    //debug
//    public static void main(String[] args) {
//        LineItem lineItem = new LineItem(new Product("A100", "Hat", 20.00, new QtyDiscount(0.10, 2)), 2);
////        create a Receipt LineItem
////         ID     NAME      QTY     PRICE     SUBTOTAL     DISCOUNT
//        int qty = lineItem.getQty();
//        
//        System.out.println("Should get:");
//        System.out.println("A100   Hat    2    20.0   40.0   4.0");
//        System.out.println("Got:");
//        System.out.println(lineItem.product.getProdId() + "\t" + lineItem.product.getProdName() 
//                + "\t" + qty + "\t" + lineItem.product.getUnitPrice() + "\t"
//            + lineItem.getSubtotal() + "\t" + lineItem.product.getAmountSaved(qty));
//    }

}
