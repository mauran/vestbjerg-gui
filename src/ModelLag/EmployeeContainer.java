package ModelLag;
import java.util.ArrayList;

/**
 * Write a description of class EmployeeContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmployeeContainer
{
    private ArrayList<Employee> employeeList;
    private static EmployeeContainer eCon = null;

    /**
     * Constructor for objects of class EmployeeContainer
     */
    private EmployeeContainer(){
        employeeList = new ArrayList<Employee>();
    }
    
    
    /**
     * Method getInstance
     *
     * @return The Array with Employees
     */
    public static EmployeeContainer getInstance(){
        if(eCon == null){
            eCon = new EmployeeContainer();
        }
        return eCon;
    }

    /**
     * Method addEmployee
     *
     * @param e an employee object
     */
    public void addEmployee(Employee e){
         employeeList.add(e);
    }
    
    /**
     * Method findEmployee
     *
     * @param the employee number
     * @return The the employee
     */
    public Employee findEmployee(String en){
        int i = 0;
        boolean found = false;
        while(!found && i<employeeList.size()){
            Employee e = employeeList.get(i);
            if(en.equalsIgnoreCase(e.getEmployeeNo())){
                found = true;
                return e;
            }
            i++;
        }
        return null;
    } 

    /**
     * Method deleteEmployee
     *
     * @param e the employee
     */
    public void deleteEmployee(Employee e){
        employeeList.remove(e);
    }
}
