package ModelLag;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CustomerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CustomerTest
{
    
   
    /**
     * Default constructor for test class CustomerTest
     */
    public CustomerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testIfNameSet(){
        Customer c1 = new Customer("Yousef", "Sigridsvej 17", "8220", "Aarhus",
                                    "60169932", "Ynoa@gmail.com", "YN1986");
        c1.setName("Anders");
        assertEquals("Anders", c1.getName());
        
    }  
    
    @Test
    public void testIfAddressSet(){
        Customer c1 = new Customer("Yousef", "Sigridsvej 17", "8220", "Aarhus",
                                    "60169932", "Ynoa@gmail.com", "YN1986");
        c1.setAddress("Rævehøjen 77");
        assertEquals("Rævehøjen 77", c1.getAddress());
        
        
    }
    
    @Test
    public void testIfZipSet(){
        Customer c1 = new Customer("Yousef", "Sigridsvej 17", "8220", "Aarhus",
                                    "60169932", "Ynoa@gmail.com", "YN1986");
        c1.setZip("9000");
        assertEquals("9000", c1.getZip());
        
    }
    
    @Test
    public void testIfCitySet(){
        Customer c1 = new Customer("Yousef", "Sigridsvej 17", "8220", "Aarhus",
                                    "60169932", "Ynoa@gmail.com", "YN1986");
        c1.setCity("Aalborg");
        assertEquals("Aalborg", c1.getCity());
    }
    
    @Test
    public void testIfPhoneSet(){
        Customer c1 = new Customer("Yousef", "Sigridsvej 17", "8220", "Aarhus",
                                    "60169932", "Ynoa@gmail.com", "YN1986");
        c1.setPhone("86255942");
        assertEquals("86255942", c1.getPhone()) ;       
    }
    
    @Test
    public void testIfEmailSet(){
        Customer c1 = new Customer("Yousef", "Sigridsvej 17", "8220", "Aarhus",
                                    "60169932", "Ynoa@gmail.com", "YN1986");
        c1.setEmail("Sofakrigeren@gmail.com");
        assertEquals("Sofakrigeren@gmail.com", c1.getEmail());
        
    }
    
    @Test
    public void testifCustomerNumberSet(){
        Customer c1 = new Customer("Yousef", "Sigridsvej 17", "8220", "Aarhus",
                                    "60169932", "Ynoa@gmail.com", "YN1986");
        c1.setCustomerNumber("YN2014");
        assertEquals("YN2014", c1.getCustomerNumber());
        
        
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
