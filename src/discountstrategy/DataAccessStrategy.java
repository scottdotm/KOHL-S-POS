/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Scott
 */
public interface DataAccessStrategy {

    public abstract Product findProduct(String prodID);
    //public abstract Customer findCustomer(String custID);
}
