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
public class StartProgramView extends View {
       
    
    @Override
    public void display() {
        System.out.println("\n"
            + "\n================================="
            + "\n  Welcome to Oregon Trail!       "
            + "\n  Test your survival skills      "
            + "\n  and see if you can survive     "
            + "\n  on the western frontier!       "
            + "\n================================="
            + "\n"); 
        
        //prompt for the user's name
        displayGetUserName();    

        //show the main menu options
        ViewLayer.MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        //prompt for a selection
        mainMenuView.displayGetMenuEntry();
        
    }
    
        public void displayGetUserName() {
        boolean done = false;
        do{
            String userName = this.getUserName();
            if (userName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(userName);
        } while (!done);
    
    }
    
        private String getUserName() {
        boolean validInput = false;
        String selection = ""; 
        
        System.out.println("\t  Please enter your name:");
        
        do {
            Scanner inFile;
            inFile = new Scanner(System.in);
  
            String input = inFile.nextLine();
            
            input = input.toUpperCase();
            
            if (input == null || input.length() < 1 ) {
                
                System.out.println("\t  You must enter a non-blank value:");
            }
            else {
                validInput = true;
                selection = input.trim();
                
            }
           }
        
        while (!validInput);
        
        return selection;
        
        }

        private String getMenuOption() {
        boolean validInput = false;
        String selection = ""; 
        
        System.out.println("\t  Please enter your selection:");
        
        do {
            Scanner inFile;
            inFile = new Scanner(System.in);
  
            String input = inFile.nextLine();
            
            input = input.toUpperCase();
            
            if (input == null || input.length() < 1 ) {
                
                System.out.println("\t  You must enter a non-blank value:");
            }
            else {
                validInput = true;
                selection = input.trim();
                
            }
           }
        
        while (!validInput);
        
        return selection;
        
        }
    
    public void displayStartProgramView() {
        
        boolean endOfView = false;
        do {
            String[] input = new String[10];
                    input[0] = getInput();
            
            input[0] = input[0].toUpperCase();
            
           if (input[0] == null || input[0].length() < 1 || input[0].equals("Q")) {
               boolean isValidInput = false;
               return;
            }
           
            endOfView = true;
        } while (endOfView != true);

        ViewLayer.MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        String mainMenuInput = "";
        //mainMenuView.getInputs();  //figure out how to call the getInput() function from the View super-class
        //mainMenuView.doAction(mainMenuInput);  //this is not needed in week 9. we only have to display the
                                                // main menu, not get input for it (yet)
        
    }

    // call the getInput function from the View super-class
    
    public boolean doAction(String input) {
                
        Player player = new Player();
        
        if (player == null){
                System.out.println("Could not create the player."  + "Enter a different name." );
                return false;          
                       }
        
       player.setName(input);
        System.out.println("=== " + "Welcome to the game " + input + " We hope you have a lot of fun!" + "==="); 


    /*    
        String menuItem = input;
        
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
        
    */
        
        return true;
    }    

        //Old Logic??  Can it be deleted??
//        private void startNewGame(){
//             
//           Player playerTemp = new Player(); 
//           
//           GameControl.CreateNewGame(OregonTrail.getPlayer);
//           ViewLayer.GameMenuView gameMenuView = new GameMenuView();
//           gameMenuView.display();
//            
//        }
        
        private void restartNewGame(){
             ViewLayer.StartExistingGameView startExistingGameView = new StartExistingGameView();
           startExistingGameView.display();
            
        }
        
         private void restartGame() {
         }
        
         private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
            
        }

}
