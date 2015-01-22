package CTRLag;
import java.util.ArrayList;
import java.util.List;

import ModelLag.*;

/**
 * Write a description of class PersonCTRL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCTRL
{
    private CustomerContainer cCon;
    private EmployeeContainer eCon;

    /*
     * Constructor for objects of class PersonCTRL
     */

    public PersonCTRL(){
        cCon = CustomerContainer.getInstance();
        eCon = EmployeeContainer.getInstance();
    }
    
    /*
     * Create customer
     */
    
    public void createCustomer(String name, String address, String zip, String city, String phone, String email,String cusNo) {
        Customer customer = new Customer(name, address, zip, city, phone, email, cusNo);
        cCon.addCustomer(customer);

    }
    
    /*
     * Find customer
     */

    public Customer findCustomer(String n) {
        return cCon.findCustomer(n);  
    }
    
    public List<Customer> findAllCustomers(){
    	return cCon.getAll();
    }
    
    /*
     * Update customer
     */

    public void updateCustomer(Customer c, String name, String address, String zip, String city, String phone, String email,String cusNo) {          
        c.setName(name);
        c.setAddress(address);
        c.setZip(zip);
        c.setCity(city);
        c.setPhone(phone);
        c.setEmail(email);
        c.setCustomerNumber(cusNo);
    }
    
    /*
     * Delete customer
     */

    public void deleteCustomer(Customer c) {  
        cCon.deleteCustomer(c); 
    }
    
    /*
     * Create employee
     */

    public void createEmployee(String name, String address, String zip, String city, String phone, String email,String empNo) {
        Employee employee = new Employee(name, address, zip, city, phone, email, empNo);
        eCon.addEmployee(employee);
    }
    
    /*
     * Find employee
     */

    public Employee findEmployee(String n) {
        return eCon.findEmployee(n);
    }

    /*
     * Update employee
     */
    
    public void updateEmployee(Employee e, String name, String address, String zip, String city, String phone, String email, String empNo) {  
        e.setName(name);
        e.setAddress(address);
        e.setZip(zip);
        e.setPhone(phone);
        e.setEmail(email);
        e.setEmployeeNo(empNo);
    }

    /*
     * Delete employee
     */
    public void deleteEmployee(Employee e) {
        eCon.deleteEmployee(e);
    }

}
