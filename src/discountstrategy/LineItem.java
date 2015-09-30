/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author smuth4
 */
public class LineItem {
    private Product product;
    private String prodId;
    private String prodName;
    private double unitPrice;
    private double subTotal;
    private double discount;
    private int qty;
    
    
    
    public LineItem(Product product, int qty) {
        //when calling LineItem constructor need to add new Item(String itemID,
        //String itemName, double unitPrice, DiscountStrategy discount)
        setProduct(product);
        setQty(qty);
        setProdId(product.getProdId());
        setProdName(product.getName());
        setUnitPrice(product.getUnitPrice());
        setDiscount(product.getAmountSaved(qty)); 
    }
    
    //subtotal helper method
    private void setSubTotal(){
        subTotal = unitPrice * qty;
    }
    
    public double getSubTotal(){
        setSubTotal();
        return subTotal;
    }
    
    public double getNormalSubtotal() {
        return product.getUnitPrice() * qty;
    }

    public double getDiscountAmount() {
        return product.getDiscountStrategy().getDiscountProductTotal(product.getUnitPrice(), qty);
    }
    
   
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public final void setQty(int qty) throws IllegalArgumentException {
        if (qty < 0) {
            throw new IllegalArgumentException();
        } else {
            this.qty = qty;
        }
    }
    
    public String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) {
        this.prodId = prodId;
    }
    
    public String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName) {
        this.prodName = prodName;
    }
    
    public double getUnitPrice() {
        return unitPrice;
    }
    
    public final void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double getDiscount() {
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
