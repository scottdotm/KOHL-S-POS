package discountstrategy;

/**
 *
 * @author smuth4
 */
public class FakeDatabase implements DataAccessStrategy {
    //Array of Products
    private final Product[] products ={
        new Product("A435", "Test Product #1", 15.95, new PercentOffDiscount(0.15)),
        new Product("B562", "Test Product #2", 15.95, new QtyDiscount(3,3))
    };
    //Array of Customers
    private final Customer[] customers ={
        new Customer("001", "Jimmbo"),
        new Customer("002", "Slim")
    };
    //Overriding findProduct from DataAccessStrategy
    @Override
    public final Product findProduct(String prodID) throws IllegalArgumentException {
        if (prodID == null || prodID.length() == 0) {
            throw new IllegalArgumentException();
        }
        
        Product product = null;
        
        for(Product p: products){
            if(prodID.equals(p.getProdId())){
                product = p;
                break;
            }
        }
        return product;
    }
    //Overriding findCustomer from DataAccessStrategy
    @Override
    public final Customer findCustomer(String custID) throws IllegalArgumentException {
        if (custID == null || custID.length() == 0) {
            throw new IllegalArgumentException();
        }
        
        Customer customer = null;
        
        for(Customer c: customers){
            if(custID.equals(c.getCustID())){
                customer = c;
                break;
            }
        }
        return customer;
    }
}