package discountstrategy;

/**
 * 9/29/2015
 * @author smuth4
 */
public class LineItem {
    //What is a lineItem composed of?
    private Product product;
    private String prodId;
    private String prodName;
    private double unitPrice;
    private double subTotal;
    private double discount;
    private int qty;
    //product information should come from fake databse array
    
    public LineItem(){
        
    }
    
    public LineItem(Product product, int qty) {
        //when calling LineItem constructor need to add new Product(String prodID,
        //String prodName, double unitPrice, DiscountStrategy discount)
        setProduct(product);
        setQty(qty);
        setProdId(product.getProdId());
        setProdName(product.getName());
        setUnitPrice(product.getUnitPrice());
        setDiscount(product.getAmountSaved(qty)); 
    }
    
    //subtotal helper method
    private final void setSubTotal(){
        subTotal = unitPrice * qty;
    }
    
    public final double getSubTotal(){
        setSubTotal();
        return subTotal;
    }
    
    public final double getNormalSubtotal() {
        return product.getUnitPrice() * qty;
    }

    public final double getDiscountAmount() {
        return product.getDiscountStrategy().getDiscountProductTotal(product.getUnitPrice(), qty);
    }
    
   
    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) throws IllegalArgumentException {
        if (qty < 0) {
            throw new IllegalArgumentException();
        } else {
            this.qty = qty;
        }
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

    public final void setProdName(String prodName) {
        this.prodName = prodName;
    }
    
    public final double getUnitPrice() {
        return unitPrice;
    }
    
    public final void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public final double getDiscount() {
        return discount;
    }
    
    public final void setDiscount(double discount) {
        this.discount = discount;
    }
     
//    //Testing
//        public static void main(String[] args) {
//        LineItem lineItem = new LineItem(new Product("A101", "Cap", 20.00, new QtyDiscount(0.10, 2)), 2);
//        //create a Receipt LineItem
//        // ID     NAME      QTY     PRICE     SUBTOTAL     DISCOUNT
//        String id = lineItem.getProdId();
//        String name = lineItem.getProdName();
//        int qty = lineItem.getQty();
//        double unitPrice = lineItem.getUnitPrice();
//        double subtotal = lineItem.getSubTotal();
//        double discount = lineItem.getDiscount();
//        
//        System.out.println("Should get:");
//        System.out.println("A101   Cap    2    20.0   20.0   4.0");
//        System.out.println("Got:");
//        System.out.println(id + "\t" + name + "\t" + qty + "\t" + unitPrice + "\t"
//            + subtotal + "\t" + discount);
//    }
    
}
