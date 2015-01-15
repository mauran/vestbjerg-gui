package ModelLag;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PartOrderTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PartOrderTest
{
    /**
     * Default constructor for test class PartOrderTest
     */
    public PartOrderTest()
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
    public void testIfProductTypeAddedToPartOrder(){
        PartOrder po1 = new PartOrder();
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        Product p1 = new Product("666");
        pt1.addProduct(p1);
        
        po1.addProductType(pt1, 1);
        
        assertEquals(pt1, po1.getProductType());
        
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
