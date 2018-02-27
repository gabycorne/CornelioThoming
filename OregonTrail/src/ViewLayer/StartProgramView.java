/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import Control_Layer.GameControl;
import java.util.Scanner;
import oregontrail.OregonTrail;
import oregontrail.Player;

/**
 *
 * @author mthoming
 */
public class StartProgramView {

    public StartProgramView() {
    }
    
        public void displayBanner() {
            //display message
        System.out.println("\n"
            + "\n================================="
            + "\n  Welcome to Oregon Trail!       "
            + "\n  Test your survival skills      "
            + "\n  and see if you can survive     "
            + "\n  on the western frontier!       "
            + "\n=================================");
    
    }
    
    public void displayStartProgramView() {
        
        boolean endOfView = false;
        do {
            String[] input = new String[10];
                    input[0] = getInputs();
            
            input[0] = input[0].toUpperCase();
            
           if (input[0] == null || input[0].length() < 1 || input[0].equals("Q")) {
               boolean isValidInput = false;
               return;
            }
           
            endOfView = true;
        } while (endOfView != true);

        ViewLayer.MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenuOptions();
        String mainMenuInput = "";
        mainMenuView.getInputs();
        mainMenuView.doAction(mainMenuInput);
        
        
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


    private boolean doAction(String input[]) {

                
        Player player = new Player();
        
        if (player == null){
                System.out.println("Could not create the player."  + "Enter a different name." );
                return false;          
                       }
        
       player.setName(input[0]);
        System.out.println("=== " + "Welcome to the game " + input + " We hope you have a lot of fun!" + "==="); 

        
        /*
        System.out.println("**** doAction() called ***");
        System.out.println("\tinput = " + input);
        */
        
        String menuItem = input[0];
        
        menuItem = menuItem.toUpperCase();
        
        switch(menuItem){
            
            case "N": startNewGame();
                break;
                
            case "R": restartGame();
                break;
                
            case "H": getHelp();
                break;
               
            case "E": return true;
                
                default: System.out.println("Invalid main menu");
      
            return false;
            
            }
        
        return true;
    }    
    
            private void startNewGame(){
             
           Player playerTemp = new Player(); 
           
           GameControl.CreateNewGame(OregonTrail.getplayer);
           ViewLayer.GameMenuView gameMenuView = new GameMenuView();
           gameMenuView.displayGameMenuView();
            
        }
        
        private void restartNewGame(){
             ViewLayer.StartExistingGameView startExistingGameView = new StartExistingGameView();
           startExistingGameView.displayStartExistingGameView();
            
        }
        
         private void restartGame() {
         }
        
         private void getHelp() {
        ViewLayer.MainMenuView.HelpMenuView helpMenuView = new MainMenuView.HelpMenuView();
        MainMenuView.HelpMenuView.displayHelpMenuView();
            
        }

    public void display() {
        System.out.println("*** display() called ***");
    }
    
    public void displayMainMenuView() {

        boolean endView = false;

        do {
            String[] input = new String[10];
            input[0] = getInputs();
            input[0] = input[0].toUpperCase();

            if (input[0] == null || input[0].length() < 1 || input[0].equals("Q")) {
                
            }
            else {
                    endView = doAction(input); 
            }
        } while (endView != true);

    }
}
