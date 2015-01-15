package GUILag;
import CTRLag.*;
import ModelLag.*;
import java.util.Scanner;

/**
 * Write a description of class MainMenuUI here.
 * 
 * @author (Tobais) 
 * @version (0.1)
 */
public class MainMenuUI
{
    OrderMenuUI order;
    CustomerMenuUI customer;
    ProductMenuUI product;
    
    /**
     * MainMenuUI Constructor
     *
     */
    public MainMenuUI() {
        customer = new CustomerMenuUI();
        order = new OrderMenuUI();
        product = new ProductMenuUI();
        startProcessing();
    }
    
    /**
     * Method startProcessing
     *
     */
    public void startProcessing() {
        System.out.println("***MainMenu***");
        System.out.println("1. Kunde");
        System.out.println("2. Ordrer");
        System.out.println("3. produkt");
        System.out.println("4. afslut");
        System.out.println("Make your choice");
        processInput();
    }
    
    /**
     * Method processInput
     *
     */
    private void processInput() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        displayMenu(result);
    }
    
    /**
     * Method displayMenu
     *
     * @param menu A parameter
     */
    private void displayMenu(int menu) {
        switch(menu)
        {
            case 1:
                customer.start();
                startProcessing();
                break;
            case 2:
                order.start();
                startProcessing();
                break;
            case 3:
                product.start();
                startProcessing();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid input");
                startProcessing();
                break;
        }
    }
}
