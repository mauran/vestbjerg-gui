package ModelLag;


/**
 * Write a description of class Product here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Product
{
    private String serialNumber;
    
    /**
     * Constructor for objects of class Product
     */
    public Product(String s){
        this.serialNumber = s;
    }

    /**
     * Method setSerialNUmber
     *
     * @param s a serialnumber
     */
    public void setSerialNUmber(String s){
        this.serialNumber = s;
    }
    
    /**
     * Method getSerialNumber
     *
     * @return The serialnumber
     */
    private String getSerialNumber(){
        return serialNumber;    
    }
    
}
