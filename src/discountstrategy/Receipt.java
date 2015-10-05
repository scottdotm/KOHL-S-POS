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
        this.customer = das.findCustomer(custId);
        lineItems = new LineItem[0];
    }
    //findCustomer
    private String getCustomer(String custID) {
        return das.findCustomer(custID).getCustName();
    }
   
    public void setDas(DataAccessStrategy das) {
        this.das = das;
    }
    //add a new line item
    public final void addLineItem(final String prodId, final int qty) {
        LineItem item = new LineItem(das, prodId, qty);
        addToArray(item);
    }
    //add to an array
    private void addToArray(final LineItem item) {
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        //copy array
        temp[lineItems.length] = item;
        lineItems = temp;
        //null temp array
//        temp = null;
    }
}
