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
        this.console.println("\n"
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
            //MT I changed this further so it displays the prompt to get the username
        private String getUserName() { // gabby I modified all the code here from the on in the reading
         boolean valid = false;
        String selection = null;
        
        this.console.println("\n Please enter your name:");
        
        try {
        while (!valid){
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            if (selection.length() < 1){
                 ErrorView.display(this.getClass().getName(),"You must enter a value");
                continue;
            }
            
            break;
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());//gabby
        }
        return selection;
    }    

        private String getMenuOption() {   // gabby I modified all the code here from the on in the reading
         boolean valid = false;
        String selection = null;
        try {
        while (!valid){
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            if (selection.length() < 1){
                ErrorView.display(this.getClass().getName(),"You must enter a value");
                continue;
            }
            
            break;
        }
        } catch (Exception e) {
          ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());//gabby
        }
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
                this.console.println("Could not create the player."  + "Enter a different name." );
                return false;          
                       }
        
        player.setName(input);
        this.console.println("=== " + "Welcome to the game " + input + " We hope you have a lot of fun!" + "==="); 

        OregonTrail.setPlayer(player);
       
        return true;
    }    

        
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
