package GUILag;
import CTRLag.*;
import ModelLag.*;
import java.util.Scanner;


public class ProductMenuUI
{
    private Scanner scanner;
    private ProductCTRL product;
    private InputReader iReader;
    
    /**
     * ProductMenuUI Constructor
     *
     */
    public ProductMenuUI() {
        scanner = new Scanner(System.in);
        product = new ProductCTRL();
        iReader = InputReader.getInstance();
    }
    
    /**
     * Method start
     *
     */
    public void start() {
        System.out.println("Dette Er Produkt Side:");
        System.out.println("1. Tilføj Produkt Type");
        System.out.println("2. Find produkt");
        System.out.println("3. Tilføj Eksemplare");
        System.out.println("4. Tilbage");
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
                addProductType();     
                break;
           case 2:
                findProduct();
                break;
           case 3:
                addProducts();
                break;
           case 4:
                break;
           default:
                System.out.println("invalid input");
                start();
                break;
        }
    }
    
    /**
     * Method addProductType
     *
     */
    private void addProductType() {
      try{
        String n = iReader.getInputWithLabel("Produkt Navn: ");
        String d = iReader.getInputWithLabel("Produkt Beskrivelse: ");
        String b = iReader.getInputWithLabel("Produkt Stregkode: ");
        String l = iReader.getInputWithLabel("Produkt Placering: ");
        System.out.println("Min Lager");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Max Lager");
        int max = Integer.parseInt(scanner.nextLine());
        System.out.println("Pris");
        double p = Integer.parseInt(scanner.nextLine());
        
        
        product.addProductType(n, d, b, l, min, max, p);
        
        start();
      }catch(Exception e){
        }
    }
    
    /**
     * Method addProducts
     *
     */
    private void addProducts(){
        try{
         String n = iReader.getInputWithLabel("Produkt navn: ");
         
         product.addProductToProductType(n);
         
         start();
        }catch(Exception e){
            System.out.println("Produktet findes ikke. Tjek om navnet er korrekt.");
            start();
        }
    }
    
    /**
     * Method findProduct
     *
     */
    private void findProduct() {
        String name = iReader.getInputWithLabel("produkt navn: ");
        try
        {
                   product.findProduct(name);
            System.out.println(product.findProduct(name).getName());
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
