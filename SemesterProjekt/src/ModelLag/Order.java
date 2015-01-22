package ModelLag;
import java.util.ArrayList;

/**
 * 
 * @author (Anders Kirkholm) 
 * @version (1.0)
 */
public class Order
{
    // instance variables - replace the example below with your own
    private String orderNo, employeeNo, packDate, reciveDate;
    private Customer customer;
    private boolean status;
    private double totalPrice;
    private ArrayList<PartOrder> poList;

    /**
     * Constructor for objects of class Order
     */
    public Order(String oNo, String eNo, Customer c, String pD, String rD){
        this.orderNo = oNo;
        this.employeeNo = eNo;
        this.customer = c;
        this.packDate = pD;
        this.reciveDate = rD;
        status = false;
        poList = new ArrayList<PartOrder>();         
    }
    
    /**
     * Method createPartOrder
     *
     * creates a PartOrder p and returns it.
     */
    public PartOrder createPartOrder(){
        PartOrder p = new PartOrder();
        return p;
    }
    
    /**
     * Method addPartOrder
     *
     * @param po A parameter
     */
    public void addPartOrder(PartOrder po){
        poList.add(po);
    }
    
    /**
     * Method setTotalPrice
     * 
     * calculates a total price for all products on an Order 
     * by looping through the PartOrders in the ArrayList<PartOrder>
     * getting the price form each ProductType and multipling it by the amount wanted.
     * 
     */
    public void setTotalPrice(){
        double tp = 0;
        for(PartOrder p : poList){
            int amount = p.getAmount();
            double pr = p.getProductType().getPrice();
            tp += amount*pr;
        }
        this.totalPrice = tp;
    }
    
    /**
     * Method setOrderNo
     *
     * @param oNo set ordernumber
     */
    public void setOrderNo(String oNo){
        this.orderNo = oNo;
    }
    
    /**
     * Method getOrderNo
     *
     * @return return the order number
     */
    public String getOrderNo(){
        return orderNo;
    }
    
    /**
     * Method setEmployeeNo
     *
     * @param eNo the employeenumber
     */
    public void setEmployeeNo(String eNo){
        this.employeeNo = eNo;
    }
    
    /**
     * Method getEmployeeNo
     *
     * @return The return employeenumber
     */
    public String getEmployeeNo(){
        return employeeNo;
    }
    
    /**
     * Method getCustomerNo
     *
     * @return The customernumber
     */
    public String getCustomerNo(){
        return customer.getCustomerNumber();
    }
    
    /**
     * Method getCustomerName
     *
     * @return The customername
     */
    public String getCustomerName(){
        return customer.getName();
    }
    
    /**
     * Method setPackDate
     *
     * @param pd the packing date
     */
    public void setPackDate(String pd){
        this.packDate = pd;
    }
    
    /**
     * Method getPackDate
     *
     * @return The packing date
     */
    public String getPackDate(){
        return packDate;
    }
    
    /**
     * Method setReciveDate
     *
     * @param rD the recievedate
     */
    public void setReciveDate(String rD){
        this.reciveDate = rD;
    }
    
    /**
     * Method getReciveDate
     *
     * @return The recievedate
     */
    public String getReciveDate(){
        return reciveDate;
    }
    
    /**
     * Method setStatus
     *
     */
    public void setStatus(){
        this.status = true;
    }
    
    /**
     * Method getStatus
     *
     * @return The status
     */
    public boolean getStatus(){
        return status;
    }
    
    /**
     * Method setTotalPrice
     *
     * @param tp the totalprice
     */
    public void setTotalPrice(double tp){
        this.totalPrice = tp;
    }
    
    
    /**
     * Method getTotalPrice
     *
     * @return The totalprise
     */
    public double getTotalPrice(){
        return totalPrice;
    }
    
    /**
     * Method customerInfo
     *
     */
    public void customerInfo(){
        
    }
      
}










