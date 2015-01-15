package ModelLag;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EmployeeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EmployeeTest
{
    /**
     * Default constructor for test class EmployeeTest
     */
    public EmployeeTest()
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
    public void testIfEmployeeNumberIsSet(){
        Employee e1 = new Employee("Nick", "Lollandsgade 23", "6000", "Aars", "86259563", "NickR@gmail.com", "NR666");
        
        assertEquals("NR666", e1.getEmployeeNo());
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
