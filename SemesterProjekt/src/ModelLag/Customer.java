package ModelLag;



/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer extends Person
{
    private String customerNumber;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String address, String zip, String city, String phone, String email,String cusNo){
        super(name, address, zip, city, phone, email);
        this.customerNumber = cusNo;
        
    }
    
   
    
    
    /**
     * Method setCustomerNumber
     *
     * @param customerNumber the customer number
     */
    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }
    
    /**
     * Method getCustomerNumber
     *
     * @return The customernumber
     */
    public String getCustomerNumber(){
        return this.customerNumber;
    }


}
