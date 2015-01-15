package ModelLag;


/**
 * Write a description of class Business here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Business extends Person
{
    private String vat; 
    private String contactPerson;
    
    /**
     * Constructor for objects of class Business
     */
    public Business(String name, String address, String zip, String city, String phone, String email, String vat, String conPer){
       super(name, address, zip, city, phone, email);
       this.vat = vat;
       this.contactPerson = conPer;
    }
    
    /**
     * Method setVat
     *
     * @param vat the vat
     */
    public void setVat(String vat){
        this.vat = vat;
    }
    
    /**
     * Method getVat
     *
     * @return The vat
     */
    public String getVat(){
        return this.vat;
    }
    
    /**
     * Method setContactPerson
     *
     * @param contactPerson a contactperson
     */
    public void setContactPerson(String contactPerson){
        this.contactPerson = contactPerson;
    }

    /**
     * Method getContactPerson
     *
     * @return The contactperson
     */
    public String getContactPerson(){
        return this.contactPerson;
    }
    
}
