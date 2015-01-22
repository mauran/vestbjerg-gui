package ModelLag;
import java.util.ArrayList;

/**
 * Write a description of class ProductContainer here.
 * 
 * @author (Anders Kirkholm) 
 * @version (1.0)
 */
public class ProductTypeContainer
{

    private static ProductTypeContainer pCon;
    private ArrayList<ProductType> productTypeList;

    /**
     * Constructor for objects of class ProductContainer
     */
    private ProductTypeContainer(){
        productTypeList = new ArrayList<ProductType>();       
    }
   

    /**
     * Method ProductTypeHard
     *
     */
    public void ProductTypeHard(){
        ProductType pt = new ProductType("Hammer","Solid hammer","121","Byggemarked",20,100,150);
        int a = 0;
        while(a > 25){
            Product p = new Product("123456");
            pt.addProduct(p);
            a++;
        }
        addProduct(pt);
    }
    
    
    /**
     * Method getInstance
     *
     * @return the InstanceObject
     */
    public static ProductTypeContainer getInstance(){
        if(pCon == null){
            pCon = new ProductTypeContainer();
        }
        return pCon;
    }
    
    /**
     * Method addProduct
     *
     * @param p a producttype
     */
    public void addProduct(ProductType p){
        productTypeList.add(p);
    }
    
    /**
     * Method findProduct
     *
     * @param name the productname
     * @return The product
     */
    public ProductType findProduct(String name){
        int i = 0;
        boolean found = false;
         while (!found && i<=productTypeList.size()){
            ProductType p = productTypeList.get(i);
            if (name.equalsIgnoreCase(p.getName())){
                found = true; 
                return p;
            }
            i++;      
        }
        return null;
    }   
    
    
    /**
     * Method deleteProductType
     *
     * @param p the product
     */
    public void deleteProductType(ProductType p){
        productTypeList.remove(p);
    }
    
}

