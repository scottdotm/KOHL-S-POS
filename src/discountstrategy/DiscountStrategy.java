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
public interface DiscountStrategy {
    //no discount class would work the same but would return zero

    double getAmountSaved(double unitPrice, int qty);

    double getDiscountProductTotal(double unitPrice, int qty);

    double getDiscountRate();

    void setDiscountRate(double discountRate);
    
}
