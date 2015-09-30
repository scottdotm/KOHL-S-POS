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
    private int qty;
    
    
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

    public double getQty() {
        return qty;
    }

    public final void setQty(int qty) throws IllegalArgumentException {
        if (qty < 0) {
            throw new IllegalArgumentException();
        } else {
            this.qty = qty;
        }
    }
    
            
}
