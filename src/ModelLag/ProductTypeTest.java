package ModelLag;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProductTypeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductTypeTest
{
    private static final double EPSILON = 0.1;
    /**
     * Default constructor for test class ProductTypeTest
     */
    public ProductTypeTest()
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
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        
        pt1.setName("Boremaskine");
        assertEquals("Boremaskine", pt1.getName());        
    }
    
    @Test
    public void testIfDescriptionSet(){
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        
        pt1.setDescription("Boremaskine til væg");
        assertEquals("Boremaskine til væg", pt1.getDescription());
    }
    
    @Test
    public void testIfBarcodeSet(){
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        
        pt1.setBarcode("777");
        assertEquals("777", pt1.getBarcode());
    }
    
    @Test
    public void testIfLocationSet(){
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        
        pt1.setLocation("Lager C");
        assertEquals("Lager C", pt1.getLocation());
    }
    
    @Test
    public void testMinInStock(){
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        
        pt1.setMinInStock(40);
        assertEquals(40, pt1.getMinInStock());
    }
    
    @Test
    public void testMaxInStock(){
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        
        pt1.setMaxInStock(80);
        assertEquals(80, pt1.getMaxInStock());
    }
    
    @Test
    public void testIfPriceSet(){
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        
        pt1.setPrice(399.95);
        assertEquals(399.95, pt1.getPrice(), EPSILON);
    }
    
    @Test
    public void testIfProductAdded(){
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        Product p1 = new Product("666");
       
        pt1.addProduct(p1);
        
        assertEquals(p1, pt1.getProductFromList());
        
        
    }
   
    @Test
    public void testIfProductIsDeleted(){
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        Product p1 = new Product("666");
        Product p2 = new Product("777");
        
        pt1.addProduct(p1);
        pt1.addProduct(p2);
        pt1.deleteProduct();
        
        assertEquals(p2, pt1.getProductFromList());
        
    }
    @Test
    public void testIfStockUpdates(){
        ProductType pt1 = new ProductType("Hammer", "En hammer til søm", "666", "Lager C", 20, 40, 299.95);
        Product p1 = new Product("666");
        Product p2 = new Product("777");
       
        pt1.addProduct(p1);
        pt1.addProduct(p2);
        pt1.updateInStock();
        assertEquals(2, pt1.getInStock());
        
        
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
