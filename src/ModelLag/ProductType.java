package ModelLag;
import java.util.ArrayList;

 /**
 * Write a description of class ProductType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductType
{
    private String name, description, barcode, location;
    private int minInStock, maxInStock, inStock;
    private double price;
    private ArrayList<Product> products;

    /**
     * Constructor for objects of class ProductType
     * 
     * @param n is the user input for the namee of a ProductTypeD.
     * @param d is the user input for the description of a ProductType.
     * @param b is the user input for the barcode of a ProductType.
     * @param l is the user input for the location of a ProductType.
     * @param min is the user input for the minInStock of a ProductType.
     * @param max is the user input for the maxInStock of a ProductType.
     * @param p is the user input for the price of a ProductType.
     */
    public ProductType(String n, String d, String b, String l, int min, int max, double p)
    {
      this.name = n;
      this.description = d;
      this.barcode = b;
      this.location = l;
      this.minInStock = min;
      this.maxInStock = max;
      this.price = p;
      products = new ArrayList<Product>();
    }
      
    /**
     * Method addProduct
     *
     * @param p a product
     */
    public void addProduct(Product p){
        products.add(p);
        
    }
    
    /**
     * Method updateInStock
     *
     */
    public void updateInStock(){
        this.inStock = products.size();
    }
    
    /**
     * Method getProductFromList
     *
     * @return the product from list
     */
    public Product getProductFromList(){
        Product p = products.get(0);
        deleteProduct();
        return p;
    }

    /**
     * Method deleteProduct
     *
     * @param p the product to be deleted
     */
    public void deleteProduct(){
        products.remove(0);
    }
    
    /**
     * Method setName
     *
     * @param n the name
     */
    public void setName(String n){
        this.name = n;
    }    
    /**
     * Method getName
     *
     * @return the name to get
     */
    public String getName(){
        return name;
    }
    
    /**
     * Method setDescription
     *
     * @param the description
     */
    public void setDescription(String d){
        this.description = d;
    }    
    
    /**
     * Method getDescription
     *
     * @return The description
     */
    
    public String getDescription(){
        return description;
    }
    
    /**
     * Method setBarcode
     *
     * @param b A parameter
     */
    public void setBarcode(String b){
        this.barcode = b;
    }    
    /**
     * Method getBarcode
     *
     * @return The return value
     */
    public String getBarcode(){
        return barcode;
    }
    
    /**
     * Method setLocation
     *
     * @param l A parameter
     */
    public void setLocation(String l) {
        this.location = l;
    }    
    /**
     * Method getLocation
     *
     * @return The return value
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Method setMinInStock
     *
     * @param min A parameter
     */
    public void setMinInStock(int min) {
        this.minInStock = min;
    }
    /**
     * Method getMinInStock
     *
     * @return The return value
     */
    public int getMinInStock() {
        return minInStock;
    }
    
    /**
     * Method setMaxInStock
     *
     * @param max A parameter
     */
    public void setMaxInStock(int max) {
        this.maxInStock = max;
    }
    
    
    /**
     * Method getMaxInStock
     *
     * @return The return value
     */
    public int getMaxInStock() {
        return maxInStock;
    }
    
    /**
     * Method setPrice
     *
     * @param p A parameter
     */
    public void setPrice(double p) {
        this.price = p;
    }

    /**
     * Method getPrice
     *
     * @return The return value
     */
    public double getPrice() {
        return price;
    }
    
    public int getInStock(){
        return inStock;
    }
    
}
