package ModelLag;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CustomerContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CustomerContainerTest
{
    private CustomerContainer cCon;
    private Customer c1, c2, c3;
    
    /**
     * Default constructor for test class CustomerContainerTest
     */
    public CustomerContainerTest()
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
    public void testIfCustomerAdded(){
        cCon = CustomerContainer.getInstance();
        c1 = new Customer("Yousef", "Sigridsvej 17", "8220", "Aarhus",
                                    "60169932", "Ynoa@gmail.com", "YN1986");
        cCon.addCustomer(c1);
        
        assertSame(c1, cCon.findCustomer("YN1986"));
        
    }
    
    @Test
    public void testIfMultipleCustomerAdded(){
        cCon = CustomerContainer.getInstance();
        c1 = new Customer("Yousef", "Sigridsvej 17", "8220", "Aarhus", "60169932", "Ynoa@gmail.com", "YN1986");
        c2 = new Customer("Anders", "Rævehøjen 17", "9000", "Aalborg", "86255942", "AndersK@gmail.com","AK1982");
        c3 = new Customer("Mauran", "Stormgade 50", "9200", "Aabenraa", "70482569", "MauranM@gmail.com","MM1990");
        
        cCon.addCustomer(c1);
        cCon.addCustomer(c2);
        cCon.addCustomer(c3);
        
        assertEquals(c2, cCon.findCustomer("AK1982"));   
    }
    
    @Test
    public void testIfNoCustomerAdded(){
        cCon = CustomerContainer.getInstance();
        
        assertEquals(null, cCon.findCustomer("YN1986"));
    }
    
    @Test
    public void testIfCustomerDeleted(){
        cCon = CustomerContainer.getInstance();
        
        c1 = new Customer("Yousef", "Sigridsvej 17", "8220", "Aarhus", "60169932", "Ynoa@gmail.com", "YN1986");
        
        cCon.addCustomer(c1);
        cCon.deleteCustomer(c1);
        
        assertEquals(null, cCon.findCustomer("1986"));
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        cCon.deleteCustomer(c1);
        cCon.deleteCustomer(c2);
        cCon.deleteCustomer(c3);
        
    }
}
