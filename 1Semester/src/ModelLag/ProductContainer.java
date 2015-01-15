package ModelLag;
import java.util.ArrayList;

/**
 * Write a description of class ProductContainer here.
 * 
 * @author (Anders Kirkholm) 
 * @version (1.0)
 */
public class ProductContainer
{

	private static ProductContainer pCon;
    private ArrayList<ProductType> productList;

    /**
     * Constructor for objects of class ProductContainer
     */
    private ProductContainer(){
        productList = new ArrayList<ProductType>();       
    }

    /**
     * Method getInstance
     *
     * @return The instance
     */
    public static ProductContainer getInstance(){
        if(pCon == null){
            pCon = new ProductContainer();
        }
        return pCon;
    }
    
    /**
     * Method addProduct
     *
     * @param p A product-object
     */
    public void addProduct(ProductType p){
        productList.add(p);
    }
    
    /**
     * Method findProduct
     *
     * @param the name
     * @return the products
     */
    public ArrayList<ProductType> findProduct(String name){
        ArrayList<ProductType> found = new ArrayList<ProductType>();
        
        for(ProductType p: productList)
        {
            if(p.getName().equals(name))
            {
                found.add(p);
            }
       }
       return found;
    }   
    
    /**
     * Method deleteProductType
     *
     * @param p delete product
     */
    public void deleteProductType(Product p){
        productList.remove(p);
    }
    
}

