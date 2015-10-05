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
    private DataAccessStrategy das;
    private Customer customer;
    private double totalSubtotal;
    private double totalDiscount;
    private double amountTotal;
    //Constructor
    public Receipt(DataAccessStrategy das, String custId) {
        this.das = das;
        this.customer = das.findCustomer(custId);
    }
    //findCustomer
    private Customer findCustomer(String custID) {
        return das.findCustomer(custID);
    }
    //new line item
    public void addToLineItems(String prodId, DataAccessStrategy das, int qty) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = new LineItem(das.findProduct(prodId), qty);
        lineItems = tempItems;
    }
    
    
}
