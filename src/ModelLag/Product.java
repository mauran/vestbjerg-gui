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
    public void setSerialNumber(String s){
        this.serialNumber = s;
    }
    
    /**
     * Method getSerialNumber
     *
     * @return The serialnumber
     */
    public String getSerialNumber(){
        return serialNumber;    
    }
    
}
