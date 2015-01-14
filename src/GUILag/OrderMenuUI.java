package GUILag;
import CTRLag.*;
import ModelLag.*;
import java.util.Scanner;


public class OrderMenuUI {
    private Scanner scanner;
    private OrderCTRL oCtrl;
    private InputReader iReader;
    private PersonCTRL cCtrl;
    private CustomerMenuUI customerUI;
    
    
    /**
     * OrderMenuUI Constructor
     *
     */
    public OrderMenuUI(){
        oCtrl = new OrderCTRL();
        cCtrl = new PersonCTRL();
        scanner = new Scanner(System.in);
        iReader = InputReader.getInstance();
        
    }
    
    /**
     * Method start
     *
     */
    public void start(){
        System.out.println("Ordre Side:");
        System.out.println("1. Opret Ordre");
        System.out.println("2. Ændre Ordre Status");
        System.out.println("3. Slet Ordre");
        System.out.println("4. Tilføj Vare");
        System.out.println("5. Find Ordre");
        System.out.println("6. Back");
        processInput();
    }
    
    /**
     * Method processInput
     *
     */
    private void processInput(){        
       int input = Integer.parseInt(scanner.nextLine());
       
       switch(input)
       {
           case 1:
                createOrder();
                break;
           case 2:
                setReadyToShip();
                break;
           case 3:
                deleteOrder();
                break;
           case 4:
                addPartOrder();
                break;
           case 5:
                findOrder();
                break;
           case 6:
                break;
           default:
            System.out.println("invalid input");
            start();
           break;
        }
    }
    
    /**
     * Method createOrder
     *
     */
    private void createOrder(){
      try{
        String orderNo = iReader.getInputWithLabel("Ordrenummer");
        String empNo = iReader.getInputWithLabel("Medarbejdernummer");
        String cusNo = iReader.getInputWithLabel("kundenummer");
        String packDate = iReader.getInputWithLabel("Pakkedato");
        String receiveDate = iReader.getInputWithLabel("Modtagelsesdato");  
        
        Customer c = cCtrl.findCustomer(cusNo);
        
        oCtrl.createOrder(orderNo, empNo, c, packDate, receiveDate);
      }catch(Exception e){
        }    
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int sampleMethod(int y) {
        // put your code here
        return y;
    }

    /**
     * Method setReadyToShip
     *
     */
    private void setReadyToShip() {      
        boolean status = true;       
        Order o = findOrder();
        o.setStatus();
    }
    
    /**
     * Method deleteOrder
     *
     */
    private void deleteOrder(){
        Order o = findOrder(); 
        oCtrl.deleteOrder(o);        
    }
    
    /**
     * Method addPartOrder
     *
     */
    private void addPartOrder(){
      try{  
        String orderNo = iReader.getInputWithLabel("Ordrenummer");
        String pName = iReader.getInputWithLabel("Produkt Navn");
        System.out.println("antal :");
        int a = Integer.parseInt(scanner.nextLine());
    
        oCtrl.addPartOrder(orderNo, pName, a);
      }catch(Exception e){
        }
    }
    
    /**
     * Method findOrder
     *
     * @return The return value
     */
    private Order findOrder(){
        System.out.println("--Find Ordre--");
        String orderNo = iReader.getInputWithLabel("Indtast Ordrenummer:");
        Order o = oCtrl.findOrder(orderNo);
        printOrder(o);
        return o;
    }
    
    /**
     * Method printOrder
     *
     * @param o A parameter
     */
    private void printOrder(Order o){
        
        System.out.println("Ordrenummer:"+ o.getOrderNo());
        System.out.println("Medarbejdernummer:"+ o.getEmployeeNo());
        System.out.println("Pakkedato:"+ o.getPackDate());
        System.out.println("Modtagelsesdato:"+ o.getReciveDate());
        try{
        System.out.println("Kundenummer:"+ o.getCustomerNo());
        System.out.println("Kundenavn:"+ o.getCustomerName());
        
        if(o.getStatus() == false){
            System.out.println("Not Ready to Ship");
        }
        if(o.getStatus() == true){
            System.out.println("Ready To Ship!");
        }
        
        o.setTotalPrice();
        System.out.println("Total Pris:"+ o.getTotalPrice());
    }catch(Exception e){
        System.out.println("No such customer. Please create a customer!");
        customerUI = new CustomerMenuUI();
        customerUI.start();
    }
    }

}
