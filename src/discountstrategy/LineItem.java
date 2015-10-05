package discountstrategy;

/**
 * 9/29/2015
 * @author smuth4
 */
public class LineItem {
    private DataAccessStrategy das; // strategy component (DIP compliant)
    private Product product;
    private int qty;

    public LineItem(DataAccessStrategy das, String prodId, int qty) {
        this.das = das;
        this.product = findProduct(prodId);
        setQty(qty);
    }
    
    private final Product findProduct(final String prodId) {
        // validation needed
        return das.findProduct(prodId);
    }
    
    public final double getOrigPriceSubtotal() {
        return product.getUnitPrice() * qty;
    }
    
    public final double getDiscountAmt() {
        return product.getDiscountStrategy().getDiscountProductTotal(product.getUnitPrice(), qty);
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(final Product product) {
        // validation needed
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(final int qty) {
        // validation needed
        this.qty = qty;
    }
    
    
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
