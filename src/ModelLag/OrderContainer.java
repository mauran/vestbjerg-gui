package ModelLag;
import java.util.ArrayList;

/**
 * Write a description of class OrderContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrderContainer
{
    private ArrayList<Order> orderList;
    private static OrderContainer oCon;
    
    /**
     * Constructor for objects of class OrderContainer
     */ 
    private OrderContainer(){
        orderList = new ArrayList<Order>();
    }
    
    /**
     * Method getInstance
     *
     * @return the OrderContainer
     */
    public static OrderContainer getInstance(){
        if(oCon == null){
            oCon = new OrderContainer();
        }
        return oCon;
    }
    
    /**
     * Method addOrder
     *
     * @param o A parameter
     */
    public void addOrder(Order o){
        orderList.add(o);
    }
   
    
    /**
     * Method findOrder
     *
     * @param the search query string
     * @return The order found
     */
    public Order findOrder(String on){
        int i = 0;
        boolean found = false;
        while (!found && i<=orderList.size()){
            Order o = orderList.get(i);
            if(on.equalsIgnoreCase(o.getOrderNo())){
                found = true; 
                return o;
            }
            i++;             
        }      
        return null;
    }
    
    /**
     * Method deleteOrder
     *
     * @param o the order
     */
    public void deleteOrder(Order o){
        orderList.remove(o);
    }

}
