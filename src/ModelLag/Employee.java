package ModelLag;


/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    private String employeeNo;
    
    /**
     * Constructor for objects of class Employee
     */
    public Employee(String name, String address, String zip, String city, String phone, String email,String empNo)
    {
        super(name, address, zip, city, phone, email);
        employeeNo = empNo;
    }
    
    /**
     * Method setEmployeeNo
     *
     * @param empNo the employeenumber
     */
    public void setEmployeeNo(String empNo){
        employeeNo = empNo;
    }
    
    /**
     * Method getEmployeeNo
     *
     * @return The employeenumber
     */
    public String getEmployeeNo(){
        return employeeNo;
    }
    
    

}
