package GUILag;
import CTRLag.*;
import ModelLag.*;
import java.util.Scanner;


public class CustomerMenuUI
{
    private Scanner scanner;
    private PersonCTRL customer;
    private InputReader iReader;
    
    
    /**
     * CustomerMenuUI Constructor
     *
     */
    public CustomerMenuUI() {
        scanner = new Scanner(System.in);
        customer = new PersonCTRL();
        iReader = InputReader.getInstance();
    }
    
    /**
     * Method start
     *
     */
    public void start() {
        System.out.println("Dette Er Kunden Side:");
        System.out.println("1. Tilføj Kunde");
        System.out.println("2. Back");
        processInput();
    }
    
    /**
     * Method processInput
     *
     */
    private void processInput() {
        
       int input = Integer.parseInt(scanner.nextLine());
       switch(input)
       {
           case 1:
                addCustomer();
           break;
           case 2:
           break;
           default:
            System.out.println("invalid input");
            start();
           break;
        }
    }
    
    /**
     * Method addCustomer
     *
     */
    private void addCustomer() {
     try{       
        String name = iReader.getInputWithLabel("Kundes navn: ");
        String address = iReader.getInputWithLabel("Kundens addresse: ");
        String zip = iReader.getInputWithLabel("Kunde postnummer: ");
        String city = iReader.getInputWithLabel("Kunde by: ");
        String phone = iReader.getInputWithLabel("Kunde telefonnummer: ");
        String email = iReader.getInputWithLabel("Kunde email: ");
        String cusNo = iReader.getInputWithLabel("Kunde Kundenummer: ");
                
        customer.createCustomer(name, address, zip, city, phone, email, cusNo);
        
        start();
     }catch(Exception e){
        }
    }
}
