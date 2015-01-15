package ModelLag;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProductTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductTest
{
    /**
     * Default constructor for test class ProductTest
     */
    public ProductTest()
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
    public void testIfSerialNumberSet(){
        Product p1 = new Product("666");
        
        p1.setSerialNumber("777");
        assertEquals("777", p1.getSerialNumber());
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
