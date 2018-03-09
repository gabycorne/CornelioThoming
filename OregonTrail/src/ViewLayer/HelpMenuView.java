/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;

/**
 *
 * @author mthoming
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("**** displayMenuView() called ***");
    }
    

        public String getInputs() {
        boolean validInput = false;
        String input = ""; 
        
        System.out.println("\t  Please enter your desired menu item");
        
        do {
            String value = "";
            
            Scanner inFile;
            inFile = new Scanner(System.in);
  
            value = inFile.nextLine();
            
            if (value == null || value.length() < 1 ) {
                
                System.out.println("\t  You must enter a non-blank value:");
            }
            else {
                validInput = true;
                input = value.trim();
                
            }
           }
        
        while (!validInput);
        
        return input;
        
        }
        
    @Override
        public boolean doAction(String input) {
            System.out.println("**** HelpMenuView.doAction() called ***");
            System.out.println("\tinput = " + input);
        
        return true;
        }
    
}
