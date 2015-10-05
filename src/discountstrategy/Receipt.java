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
//    public Receipt(DataAccessStrategy das, String custId) {
//        this.das = das;
//        this.customer = das.findCustomer(custId);
//    }

    
    //findCustomer
    private String getCustomer(String custID) {
        return das.findCustomer(custID).getCustName();
    }
    
    //new line item
    public void addNewLineItem(String prodId, int qty) {
        //line item constructor object
        LineItem prodObj = new LineItem(das.findProduct(prodId),qty);
        //temporary array
        LineItem[] temp = new LineItem[lineItems.length + 1];
        //for loop to copy current array into temp array
        for (int i = 0; i < lineItems.length; i++) {
            temp[i] = lineItems[i];
        }
        //add new line item
        temp[temp.length - 1] = prodObj;
        //copy temp array to lineItems array
        lineItems = temp;
        //null temp array
        temp = null;
        totalSubtotal += prodObj.getSubtotal();
    }
    
    //get the array
    public LineItem[] getLineItemArray() {
        return lineItems;
    }
    
//    public static void main(String[] args) {
//
//        Receipt receipt = new Receipt();
//
//        receipt.addNewLineItem("2002", 4);
//        receipt.addNewLineItem("2004", 1);
//
//        LineItem[] items = receipt.getLineItemArray();
//        for (int i = 0; i < receipt.getLineItemArray().length; i++) {
//            System.out.println(items[i].getProduct().getProdId() + "\t"
//                    + items[i].getProduct().getProdName() + "\t" + items[i].getQty()
//                    + "\t" + items[i].getSubtotal() + "\t" + items[i].getDiscount());
//        }
//}
}
