/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;
import ViewLayer.StartExistingGameView;
import Control_Layer.GameControl;
import oregontrail.OregonTrail;
import oregontrail.Player;
import ViewLayer.HelpMenuView;

/**
 *
 * @author mthoming
 */
public class MainMenuView extends View {

    public MainMenuView() {
    }
    
    public void displayMenuOptions() {
        
        
        
            //display message
        System.out.println("\n"
            + "\n================================="
            + "\n  Choose from the following:     "
            + "\n                                 "
            + "\n  N - New Game                   "
            + "\n  R - Restart saved Game         "
            + "\n  H - Get help                   "                
            + "\n  Q - Quit game                  "            
            + "\n=================================");
    
    }
        
        
    public boolean doAction(String selection){
     
        String input = "";
        switch(input){
            
            case "N": startNewGame();
                break;
                
            case "R": restartGame();
                break;
                
            case "H": getHelp();
                break;
               
            case "Q": return true;
                
            default: System.out.println("Invalid selection");
      
            break;
        }
        return false;
    }
    
    
    
    
    
        public String getInputs() {
        boolean validInput = false;
        String[] input = new String[10]; 
        
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
                input[0] = value.trim();
                
            }
           }
        
        while (!validInput);
        
        return input[0];
        
        } 
        
          
        public void startNewGame(){
             
           Player playerTemp = new Player(); 
           
           GameControl.CreateNewGame(OregonTrail.getplayer);
           ViewLayer.GameMenuView gameMenuView = new GameMenuView();
           gameMenuView.displayGameMenuView();
            
        }
        
        public void restartNewGame(){
             ViewLayer.StartExistingGameView startExistingGameView = new StartExistingGameView();
           startExistingGameView.displayStartExistingGameView();
            
        }
        
         private void restartGame() {
         }
        
         public void getHelp() {
        ViewLayer.MainMenuView.HelpMenuView helpMenuView = new HelpMenuView();
        HelpMenuView.displayHelpMenuView();
            
        }      

        public static class HelpMenuView {

            public static void displayHelpMenuView() {
                System.out.println("**** displayHelpMenuView() called ***");
                
            }

            public HelpMenuView() {
                System.out.println("**** HelpMenuView() called ***");
                
            }
        }
    
        public static void main(String[] args) {
        ViewLayer.GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();

        }

}