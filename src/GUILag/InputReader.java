package GUILag;

import java.util.Scanner;


/**
 * Write a description of class InputReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InputReader
{
    // instance variables - replace the example below with your own
    private static InputReader instance;
    private Scanner sc = new Scanner(System.in);

    /**
     * Constructor for objects of class InputReader
     */
    private InputReader() {
        
    }
    
    /**
     * Method getInstance
     *
     * @return The return value
     */
    public static InputReader getInstance(){
        if(instance != null){
            return instance;
        }
        
        return new InputReader();
    }
    
    /**
     * Method getInput
     *
     * @return The return value
     */
    public String getInput() {
       String input = sc.nextLine();
       return input;
    }
    
    /**
     * Method getInputWithLabel
     *
     * @param label string
     * @return The return value
     */
    public String getInputWithLabel(String label){
        System.out.println(label+":");
        String input = getInput();
        return input;
    }
    
    
}
