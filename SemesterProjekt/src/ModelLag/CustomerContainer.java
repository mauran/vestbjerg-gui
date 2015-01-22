package ModelLag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.text.html.FormView;

/**
 * Write a description of class CustomerContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomerContainer
{
    private ArrayList<Customer> customerList;
    private ArrayList<Business> businessList;
    private static CustomerContainer cCon = null;

    /**
     * Constructor for objects of class CustomerContainer
     */
    private CustomerContainer(){
        customerList = new ArrayList<Customer>();
        businessList = new ArrayList<Business>();
    }

    
    /**
     * Method getInstance
     *
     * @return customerarray
     */
    public static CustomerContainer getInstance(){

        if(cCon == null){
            cCon = new CustomerContainer();
        }
        return cCon;
    }

    /**
     * Method addCustomer
     *
     * @param c A customer object
     */
    public void addCustomer(Customer c){
        customerList.add(c);
    }

    
    /**
     * Method findCustomer
     *
     * @param cn A parameter
     * @return The return value
     */
    public Customer findCustomer(String cn){
        int i = 0;
        boolean found = false;
        Customer returnCustomer = null;
        while(!found && i< customerList.size()){
            Customer c = customerList.get(i);
            if(cn.equalsIgnoreCase(c.getCustomerNumber()) || cn.equalsIgnoreCase(c.getPhone()) ){
                found = true;
                returnCustomer = c;
            }
            i++;
        }
        return returnCustomer;
    }
    
    public List<Customer> getAll(){
    	ArrayList<Customer> c = customerList;
		return c;
    }
    
    /**
     * Method updateCustomer
     *
     */
    public void updateCustomer(){
        
    }

    /**
     * Method deleteCustomer
     *
     * @param c A customer object
     */
    public void deleteCustomer(Customer c){
        customerList.remove(c);
    }
    
    /**
     * Method addBusiness
     *
     * @param a business object
     */
    public void addBusiness(Business b){
        businessList.add(b);
    }
    
    /**
     * Method findBusiness
     *
     * @param vat numbber
     * @return The business object
     */
    public Business findBusiness(String vat){
        int i = 0;
        boolean found = false;
        while(!found && i<=businessList.size()){
            Business b = businessList.get(i);
            if(vat.equalsIgnoreCase(b.getVat())){
                found = true;
                return b;
            }
            i++;
        }
        return null;
    }
    
    
    /**
     * Method deleteBusiness
     *
     * @param b the business object
     */
    public void deleteBusiness(Business b){
        businessList.remove(b);
    }
    
        



}
