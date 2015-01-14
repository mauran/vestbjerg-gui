package ModelLag;

import java.util.ArrayList;

/**
 * Write a description of class PartOrder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartOrder
{
    private ProductType productType;
    private ArrayList<Product> products;
    private int amount;
   
    
    /**
     * PartOrder Constructor
     *
     */
    public PartOrder() {
        products = new ArrayList<Product>();
    }

    /**
     * Method addProductType
     *
     * @param pt A parameter
     * @param amount A parameter
     */
    public void addProductType(ProductType pt, int amount){   
        this.productType = pt;
        this.amount = amount;
        int a = amount;
        
        while(a>0){
            products.add(productType.getProductFromList());
            a--;
        }
    }
       
    /**
     * Method getProduct
     *
     * @return The product
     */
    public Product getProduct(String serialNumber){
        Product returnProduct = null;
        for(Product p : products){
            if(p.getSerialNumber().equalsIgnoreCase(serialNumber)){
                returnProduct = p;
            }
            
        }
        
        return returnProduct;
    }
    
    /**
     * Method setAmount
     *
     * @param amount amounts
     */
    public void setAmount(int amount){
        this.amount = amount;
    }
    
    /**
     * Method getAmount
     *
     * @return The return of amount
     */
    public int getAmount(){
        return amount;
    }
    
    /**
     * Method setProductType
     *
     * @param p a product
     */
    public void setProductType(ProductType p){
        productType = p;
    }
    
    /**
     * Method getProductType
     *
     * @return the productype
     */
    public ProductType getProductType(){
        return productType;
    }
    
}
