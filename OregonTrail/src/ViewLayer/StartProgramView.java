/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;
import oregontrail.Player;

/**
 *
 * @author mthoming
 */
public class StartProgramView {

    public StartProgramView() {
    }
    
    public void displayStartProgramView() {        
        boolean endOfView = false;
        do {
            String input = getInputs();
            
            input = input.toUpperCase();
            
           if (input == null || input.length() < 1 || input.equals("Q")) {
               boolean isValidInput = false;
               return;
            }
           
            endOfView = doAction(input);
        } while (endOfView != true);
                
        ViewLayer.MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
    
    public String getInputs() {
        boolean validInput = false;
        String name = ""; 
        
        System.out.println("\t  Please enter your name:");
        
        do {
            String input = "";
            
            Scanner inFile;
            inFile = new Scanner(System.in);
  
            input = inFile.nextLine();
            
            if (input == null || input.length() < 1 ) {
                
                System.out.println("\t  You must enter a non-blank value:");
            }
            else {
                validInput = true;
                name = input.trim();
                
            }
           }
        
        while (!validInput);
        
        return name;
        
        }       


    private boolean doAction(String input) {
        System.out.println("**** doAction() called ***");
        System.out.println("\tinput = " + input);
        
        Player player = new Player();
        
        if (player == null){
                System.out.println("Could not create the player."  + "Enter a different name." );
                return false;          
                       }
        
       player.setName(input);
        System.out.println("================================================= " + "Welcome to the game " + input + " We hope you have a lot of fun!" + "==================================================="); 
        
        return true;
    }    

    public void display() {
        System.out.println("*** display() called ***");
    }
    
    public void displayMainMenuView() {

        boolean endView = false;

        do {
            String input = getInputs();
            input = input.toUpperCase();

            if (input == null || input.length() < 1 || input.equals("Q")) {
                
            }
            else {
                    endView = doAction(input); 
            }
        } while (endView != true);

    }
}
