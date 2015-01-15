package ModelLag;

/**
 * Write a description of class PartOrder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartOrder
{
    private ProductType productType;
    private Product product;
    private int amount;
   
    
    /**
     * PartOrder Constructor
     *
     */
    public PartOrder() {
      
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
            productType.getProductFromList();
            a--;
        }
    }
        
    /**
     * Method addProduct
     *
     * @param p the product
     */
    private void addProduct(Product p){
        product = p;
    }
    
    /**
     * Method setProduct
     *
     * @param p the product
     */
    public void setProduct(Product p){
        product = p;
    }
    
    /**
     * Method getProduct
     *
     * @return The product
     */
    public Product getProduct(){
        return product;
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
