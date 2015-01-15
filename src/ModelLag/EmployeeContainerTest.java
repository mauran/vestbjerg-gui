package ModelLag;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EmployeeContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EmployeeContainerTest
{
    private EmployeeContainer eCon;
    private Employee e1, e2, e3;
    
    /**
     * Default constructor for test class EmployeeContainerTest
     */
    public EmployeeContainerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testIfEmployeeAdded(){
        eCon = EmployeeContainer.getInstance();
        e1 = new Employee("Nick", "Lollandsgade 23", "6000", "Aars", "86259563", "NickR@gmail.com", "NR666");
        
        eCon.addEmployee(e1);
        assertEquals(e1, eCon.findEmployee("NR666")); 
    }
    
    @Test
    public void testIfMultipleEmployeeAdded(){
        eCon = EmployeeContainer.getInstance();
        
        e1 = new Employee("Nick", "Lollandsgade 23", "6000", "Aars", "86259563", "NickR@gmail.com", "NR666");
        e2 = new Employee("Mikkel", "Hvalpsundvej 19", "5000", "Asaa", "86934875", "MikkelB@gmail.com", "MB777");
        e3 = new Employee("Kim", "Rullegade 65", "4000", "Aalbæk", "86964721", "KimK@gmail.com", "KK888");
        
        eCon.addEmployee(e1);
        eCon.addEmployee(e2);
        eCon.addEmployee(e3);
        
        assertEquals(e2, eCon.findEmployee("MB777"));
        
        
    }
    
    @Test
    public void testIfNoEmployeeAdded(){
         eCon = EmployeeContainer.getInstance();
         
         assertEquals(null, eCon.findEmployee("MB777"));
    }
    
    @Test
    public void testIfEmployeeDeleted(){
        eCon = EmployeeContainer.getInstance();
        e1 = new Employee("Nick", "Lollandsgade 23", "6000", "Aars", "86259563", "NickR@gmail.com", "NR666");
        
        eCon.addEmployee(e1);
        eCon.deleteEmployee(e1);
        assertEquals(null, eCon.findEmployee("NR666"));
        
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        eCon.deleteEmployee(e1);
        eCon.deleteEmployee(e2);
        eCon.deleteEmployee(e3);
    }
}
