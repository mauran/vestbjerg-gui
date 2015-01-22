package CTRLag;
import ModelLag.*;


/**
 * Write a description of class ProductCTRL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductCTRL
{
    // instance variables - replace the example below with your own
    private ProductTypeContainer pCon;
    private static Product product;

    /**
     * Constructor for objects of class ProductCTRL
     */

    public ProductCTRL()
    {
        pCon = ProductTypeContainer.getInstance();
    }

    /**
    * Find product
    */

    public ProductType findProduct(String name){
       
        ProductType pt = pCon.findProduct(name);
        return pt;
    }

    /**
    * Add producttype
    */
    
    public void addProductType(String n, String d, String b, String l, int min, int max, double p){
        ProductType pt = new ProductType(n,d,b,l,min,max,p);
        pCon.addProduct(pt);
    }
    
    /**
    * Update product
    */

    public void updateProduct(ProductType pt,String newN, String newD, String newB, String newL, int newMin, int newMax, double newP){
        pt.setName(newN);
        pt.setDescription(newD);
        pt.setBarcode(newB);
        pt.setLocation(newL);
        pt.setMinInStock(newMin);
        pt.setMaxInStock(newMax);
        pt.setPrice(newP);
    }

    /**
    * Delete producttype
    */

    public void deleteProductType(ProductType p){
        pCon.deleteProductType(p);
    }

    /**
    * Add producttype
    */

    public void addProductToProductType(String name){
        ProductType pt = findProduct(name);
        int i = 0;
        while(i<25){
            Product p = new Product("12234");
            pt.addProduct(p);
            i++;
        }
    }
        
}
