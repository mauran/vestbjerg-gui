package ModelLag;


/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Person
{
    private String name, address, zip, city, phone, email;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, String address, String zip, String city, String phone, String email){
    	super();
        this.name = name;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Method setName
     *
     * @param n string name
     */
    public void setName(String n){
        name = n;
    }
    
    /**
     * Method getName
     *
     * @return The name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Method setAddress
     *
     * @param the address
     */
    public void setAddress(String a){
        address = a;
    }
    
    /**
     * Method getAddress
     *
     * @return The address
     */
    public String getAddress(){
        return address;
    }
    
    /**
     * Method setZip
     *
     * @param z A zip
     */
    public void setZip(String z){
        zip = z;
    }
    
    /**
     * Method getZip
     *
     * @return the zip
     */
    public String getZip(){
        return zip;
    }
    
    /**
     * Method setCity
     *
     * @param c A city
     */
    public void setCity(String c){
        city = c;
    }
   
    /**
     * Method getCity
     *
     * @return The city
     */
    public String getCity(){
        return city;
    }
    
    /**
     * Method setPhone
     *
     * @param p a phonenumber
     */
    public void setPhone(String p){
        phone = p;
    }
    
    /**
     * Method getPhone
     *
     * @return The phonenumber
     */
    public String getPhone(){
        return phone;
    }
     
    /**
     * Method setEmail
     *
     * @param the email
     */
    public void setEmail(String e){
        email = e;
    }
   
    /**
     * Method getEmail
     *
     * @return The email
     */
    public String getEmail(){
        return email;
    }
}
