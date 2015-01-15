package CTRLag;
import ModelLag.*;


/**
 * Write a description of class OrderCTRL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrderCTRL
{
    // instance variables - replace the example below with your own
    private OrderContainer oCon;
    private ProductTypeContainer pCon;

    /**
     * Constructor for objects of class OrderCTRL
     */
    public OrderCTRL(){
        oCon = OrderContainer.getInstance();
        pCon = ProductTypeContainer.getInstance();    
    }
    
     /**
     *  Create order
     */
    public void createOrder(String orderNo, String employeeNo, Customer c, String packDate, String reciveDate){
       try{      
           Order newOrder = new Order(orderNo, employeeNo, c, packDate, reciveDate);
           oCon.addOrder(newOrder);
          }catch(Exception e){
           }
    }
    
     /**
     *  Add partorder
     */
    public void addPartOrder(String orderNo, String pName, int amount){
      try{
        Order o = oCon.findOrder(orderNo);
        PartOrder po = o.createPartOrder();
        ProductType ptn = pCon.findProduct(pName);
        po.addProductType(ptn, amount);
        o.addPartOrder(po);
      }catch(Exception e){
        }
    }

    /**
     * Find order
     */
    public Order findOrder(String orderNo){
        return oCon.findOrder(orderNo);
    }
    
    public void deleteOrder(Order o){
        oCon.deleteOrder(o);
    }
}
