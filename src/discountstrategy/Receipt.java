package discountstrategy;

/**
 *
 * @author Scott
 */
public class Receipt {
    //what does a recepit need?
    //line item array
    //customer info form FakeDatabase array
    private LineItem[] lineItems = new LineItem[0];
    private DataAccessStrategy das = new FakeDatabase();
    //customer object
    private Customer customer;
    //subtotal of all products
    private double totalSubtotal;
    //subtotal of all discounts
    private double totalDiscount;
    //total of all items after discount
    private double amountTotal;
    
    //Constructor
    public Receipt(DataAccessStrategy das, String custId) {
        this.setDas(das);
        this.customer = findCustomer(custId);
        lineItems = new LineItem[0];
    }

    
    //findCustomer
    private String getCustomer(String custID) {
        return das.findCustomer(custID).getCustName();
    }
    
    public void setDas(DataAccessStrategy das) {
        this.das = das;
    }
}
