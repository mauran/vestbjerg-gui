package ModelLag;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProductTypeContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductTypeContainerTest
{
    private ProductTypeContainer ptCon;
    private ProductType pt1, pt2, pt3;
    
    /**
     * Default constructor for test class ProductTypeContainerTest
     */
    public ProductTypeContainerTest()
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
    public void testIfProductTypeAdded(){
        ptCon = ProductTypeContainer.getInstance();
        
        pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        ptCon.addProduct(pt1);
        
        assertEquals(pt1, ptCon.findProduct("Hammer"));        
    }
    
    @Test
    public void testIfMultipleProductTypeAdded(){
        ptCon = ProductTypeContainer.getInstance();
        pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        pt2 = new ProductType("Boremaskine", "Boremaskine til væg", "777", "Lager D", 10, 20, 599.95);
        pt3 = new ProductType("Tang", "Tang til møtrik", "888", "Lager F", 30, 60, 69.95); 
        
        ptCon.addProduct(pt1);
        ptCon.addProduct(pt2);
        ptCon.addProduct(pt3);
        
        assertEquals(pt2, ptCon.findProduct("Boremaskine"));
        
    }
    
    @Test
    public void testIfNoProductTypeAdded(){
        ptCon = ProductTypeContainer.getInstance();
        
        assertEquals(null, ptCon.findProduct("Hammer"));
    }
    
    @Test
    public void testIfProductDeleted(){
        ptCon = ProductTypeContainer.getInstance();
        pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        
        ptCon.addProduct(pt1);
        ptCon.deleteProductType(pt1);
        
        assertEquals(null, ptCon.findProduct("Hammer"));
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
       ptCon.deleteProductType(pt1);
       ptCon.deleteProductType(pt2);
       ptCon.deleteProductType(pt3);
    }
}
